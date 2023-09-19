package com.example.emailservice.adapters;

public interface EmailSenderGateaway {
    // Criada para se comunicar com os providers de e-mails externos. Representaria o meu contrato
    void sendEmail(String to, String subject, String body);
}
