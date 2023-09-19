package com.example.emailservice.application;

import com.example.emailservice.adapters.EmailSenderGateaway;
import com.example.emailservice.core.EmailSenderUseCase;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    // A email sender gateaway é uma classe criada para ser o portão de entrada para o mundo externo e poder enviar o email. Será uma interface que é um adapter para o mundo externo, assim não haverá a dependência direta do service, assim ao criar a classe da AWS ela irá implementar a minha classe que eu defini.
    private final EmailSenderGateaway emailSenderGateaway;

    public EmailSenderService(EmailSenderGateaway emailSenderGateaway) {
        this.emailSenderGateaway = emailSenderGateaway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateaway.sendEmail(to, subject, body);
    }

}
