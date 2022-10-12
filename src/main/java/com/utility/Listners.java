package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listners extends BaseClass implements ITestListener{
	ExtentReports extent =ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extenttest=new	ThreadLocal<ExtentTest>(); 
	
	public void onTestStart(ITestResult result) {
	Library.test=extent.createTest(result.getTestClass().getName()+"-----"+result.getMethod().getMethodName());
	extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "test case pass");

	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "test case fail");
		extenttest.get().addScreenCaptureFromBase64String(getCapture());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "test case skiped");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	public static String getCapture() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}

}
