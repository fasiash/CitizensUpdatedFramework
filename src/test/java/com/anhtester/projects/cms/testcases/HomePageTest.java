package com.anhtester.projects.cms.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.anhtester.common.BaseTest;
import com.anhtester.constants.FrameworkConstants;
import com.anhtester.helpers.ExcelHelpers;

public class HomePageTest extends BaseTest {

	 /*	
	 @Test
    public void TC_Open_Application_Module() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
        getHomePage().Open_Application_Module();
    }
*/	
	
	 @Parameters({"USERID", "PASSWORD"})
	 @Test
	 public void TC_Open_Application_Module(String userName, String pwd) throws Exception {
//		 ExcelHelpers excel = new ExcelHelpers();
//		 excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
         getLoginPage().loginSuccessWithCustomerAccount(userName, pwd);
		 getHomePage().Open_Application_Module();
	 }
	 
}
