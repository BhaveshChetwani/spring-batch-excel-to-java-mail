package com.emailbatch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.emailbatch.entities.Email;
import com.emailbatch.util.EmailUtilImpl;
import com.emailbatch.util.Helper;

public class EmailItemProcessor implements ItemProcessor<Email, Email> {

	@Autowired
	EmailUtilImpl impl;

	/**
	 * processing unit - 
	 * repeated process to be done to each record
	 */
	@Override
	public Email process(final Email email)
			throws Exception {

		/**
		 * discard the header of the records from excel sheet 
		 * OR
		 * process only if it is not the header
		 */
		if ("EmailId".equals(email.getEmailId())) {
			return email;
		}
		impl.sendEmail(email.getEmailId(), Helper.subjectName, Helper.emailBody);
		return email;
	}

}