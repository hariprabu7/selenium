package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	@Test
	public void tc003() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openapp();
		obj.login();
		obj.leave();
		obj.logout();
		Thread.sleep(3000);
		obj.closeapp();
	}

}
