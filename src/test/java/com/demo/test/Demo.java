package com.demo.test;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.demo.actions.BaseClass;
import com.demo.actions.LoginAction;
import com.relevantcodes.extentreports.LogStatus;

public class Demo extends BaseClass {
	@Test
	public void login() {
		LoginAction login1 = new LoginAction();
		//login1.login();
		System.out.println("HI");
		logger.log(LogStatus.INFO, "User login");

	}

}
