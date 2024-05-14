package com.anhtester.projects.cms.testcases;

import org.testng.annotations.Test;

import com.anhtester.common.BaseTest;
import com.anhtester.constants.FrameworkConstants;
import com.anhtester.helpers.ExcelHelpers;

public class Step1_Test extends BaseTest {
	
	 @Test
    public void TC_Product_Information() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module();
        getStep_1Page().Product_Information();
    }
}
