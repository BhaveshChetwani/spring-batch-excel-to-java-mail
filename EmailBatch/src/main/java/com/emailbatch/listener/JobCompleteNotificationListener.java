package com.emailbatch.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JobCompleteNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(JobCompleteNotificationListener.class);

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JobCompleteNotificationListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("!!! JOB FINISHED! Time to verify the results");

			/*
			 * jdbcTemplate.query("SELECT id, email_id, date, post_name from email", (rs,
			 * row) -> new Email(rs.getString(1), rs.getString(2), rs.getString(3),
			 * rs.getString(4))).forEach(person -> log.info("Found <" + person +
			 * "> in the database."));
			 */
		}
	}
}