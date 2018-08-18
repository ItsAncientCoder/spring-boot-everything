package com.oxy.oxygen.jobScheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oxy.oxygen.service.UserService;

@Component
public class AutoJobScheduler {

	private static Logger logger = LogManager.getLogger(AutoJobScheduler.class);
	private UserService userService;
	
	@Autowired
	public AutoJobScheduler(UserService userService) {
		this.userService = userService;
	}

	Date date;
	SimpleDateFormat sdf = new SimpleDateFormat("MM:dd-HH:mm:ss");

	//@Scheduled(fixedRate = 5000)
	public void scheduleUsingFixedRate() {
		logger.info(userService.usersList());
	}

	//@Scheduled(fixedDelay = 1000)
	public void scheduleUsingDelay() {
		date = new Date();
		System.out.println("@Scheduled(fixedDelay=5000) " + sdf.format(date));
	}

	//@Scheduled(fixedDelay = 5000, initialDelay = 10000)
	public void scheduleUsingFixedDelayWithInitialDelay() {
		date = new Date();
		System.out.println("@Scheduled(fixedDelay=5000, initialDelay=10000) " + sdf.format(date));
	}

	//@Scheduled(cron = "*/5 * * * * *")
	public void scheduleUsingCronic() {
		date = new Date();
		System.out.println("Cron: "+sdf.format(date));
	}

}
