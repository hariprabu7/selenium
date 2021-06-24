package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
	@Test
	public void tc004() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openapp();
		obj.login();
		obj.empinfo();
		Thread.sleep(3000);
		obj.logout();
		Thread.sleep(2000);
		obj.closeapp();
	}

}
