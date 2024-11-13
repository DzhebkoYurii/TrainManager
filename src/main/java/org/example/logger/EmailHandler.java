package org.example.logger;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class EmailHandler extends Handler {
    private final String recipientEmail;
    private final String senderEmail;
    private final String senderPassword;
    private final Properties emailProperties;

    public EmailHandler(String recipientEmail, String senderEmail, String senderPassword) {
        this.recipientEmail = recipientEmail;
        this.senderEmail = senderEmail;
        this.senderPassword = senderPassword;

        emailProperties = new Properties();
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");
        emailProperties.put("mail.smtp.host", "smtp.gmail.com");  // Змініть, якщо інший поштовий сервер
        emailProperties.put("mail.smtp.port", "587");
    }

    @Override
    public void publish(LogRecord record) {
        if (record.getLevel().intValue() >= Level.SEVERE.intValue()) {
            sendEmail(record);
        }
    }

    private void sendEmail(LogRecord record) {
        Session session = Session.getInstance(emailProperties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Critical Error in Application Log");
            message.setText("A critical error occurred:\n\n" + record.getMessage());

            Transport.send(message);
            System.out.println("Critical error email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void flush() {}

    @Override
    public void close() throws SecurityException {}
}
