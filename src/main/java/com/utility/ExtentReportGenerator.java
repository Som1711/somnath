package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		String path="C:\\Users\\Altaf\\eclipse-workspace\\Batch_11\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("");
		reporter.config().setReportName("");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("", "");
		extent.setSystemInfo("", "");
		extent.setSystemInfo("", "");
		extent.setSystemInfo("", "");
		return extent;
	}
	
	
}
