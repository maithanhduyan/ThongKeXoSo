/**
 * @author Mai Thành Duy An
 *
 */
package com.tkxs.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WriteCurrentTimeSchedule {

	private static final Logger LOG = LoggerFactory.getLogger(WriteCurrentTimeSchedule.class);

	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");

	// initialDelay = 3 second.
	// fixedDelay = 20 second.
	@Scheduled(initialDelay = 3 * 1000, fixedDelay = 20 * 1000)
	public void writeCurrentTime() {

		Date now = new Date();

		String nowString = df.format(now);

		// System.out.println("Now is: " + nowString);
		//LOG.info("Schedule :" + nowString);
	}

	@Scheduled(cron = "0 1 1 * * *", zone = "UTC")
	public void doScheduledWork() {
		// Do something here
		//LOG.info("Do something");
	}

	@Scheduled(cron = "0 20 1 * * MON-THU")
	public void doSomething() {
		//LOG.info("Do something");
	}
}
