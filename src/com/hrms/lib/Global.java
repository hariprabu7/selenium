package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Global {
	public WebDriver driver;
	
	//Testdata
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String un = "admin";
	public String pw = "admin";
	public String ln = "hari";
	public String fn = "prabu";
	public String searchfor = "1001";
	//Objects
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String btn_logout = "Logout";
	public String btn_add = "//input[@value='Add']";
	public String btn_save = "//input[@value='Save']";	
	public String txt_lastname = "txtEmpLastName";
	public String txt_firstname = "txtEmpFirstName";
	public String mo_leave = "Leave";
	public String mo_leavesummary = "Leave Summary";
	public String btn_empleavesummary = "Employee Leave Summary";
	public String btn_view = "//input[@value='View']";
	public String drop_search = "loc_code";
	public String drop_empid = "0";
	public String txt_searchfor = "loc_name";
	public String btn_search = "//input[@value='Search']";
	public String checkbox = "//input[@value='0002']";
	public String btn_delete = "//input[@value='Delete']";
	
			
	

}
