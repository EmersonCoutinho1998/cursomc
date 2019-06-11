package com.emerson.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.emerson.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
