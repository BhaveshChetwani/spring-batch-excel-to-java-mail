package com.emailbatch.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	JavaMailSender sender;
	
	/**
	 * Java Email Sender API
	 */
	public void sendEmail(String toAddress, String subject, String body) {
		MimeMessage mimeMessage = sender.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
			helper.addTo(toAddress);
			mimeMessage.setContent(body, "text/html");
			helper.setSubject(subject);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		sender.send(mimeMessage);
	}

}
