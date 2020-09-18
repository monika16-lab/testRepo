
package com.w2a.listeners;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.relevantcodes.extentreports.LogStatus;

import com.w2a.Utilites.MonitoringMail;
import com.w2a.Utilites.TestConfig;
import com.w2a.Utilites.UtilitiesClass;
import com.w2a.base.PageClass;




public class CustomeListeners extends PageClass implements ITestListener, ISuiteListener {
	public String messageBody;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) 
	
	{
		System.out.println("---onTestFailure:Start----");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try 
		{
			UtilitiesClass.captureScreenshot();
			System.out.println("1" + UtilitiesClass.screenshotName);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase() + "Failed with exception : " + arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(UtilitiesClass.screenshotName));

		// TODO Auto-generated method stub

		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href=" + UtilitiesClass.screenshotName + ">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=" + UtilitiesClass.screenshotName + "><img src=" + UtilitiesClass.screenshotName
				+ " height=200 width=200></img></a>");
		rep.endTest(test);
		rep.flush();

	}

	public void onTestSkipped(ITestResult arg0) 
	{
		// TODO Auto-generated method stub

		test.log(LogStatus.SKIP, arg0.getName().toUpperCase() + " Skipped the test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();

	}

	public void onTestStart(ITestResult arg0) 
	{
		// TODO Auto-generated method stub

		test = rep.startTest(arg0.getName().toUpperCase());
		// runmode - y
		System.out.println("Method Name" + arg0.getName().toUpperCase());

		/*
		 * if(!TestUtil.isTestRunnable(arg0.getName(),excel)) {
		 * System.out.println(
		 * "--------------------------------SkipException---------------");
		 * System.out.println(new SkipException("Skipping the test"
		 * +arg0.getName().toUpperCase()+" as the Run mode is No"));
		 * 
		 * throw new SkipException("Skipping the test"
		 * +arg0.getName().toUpperCase()+" as the Run mode is No"); }
		 */

	}

	public void onTestSuccess(ITestResult arg0) 
	{
		// TODO Auto-generated method stub

		test.log(LogStatus.PASS, arg0.getName().toUpperCase() + " PASS");
		rep.endTest(test);
		rep.flush();
	}

	public void onFinish(ISuite arg0)
	{

		MonitoringMail mail = new MonitoringMail();

		try {
			
			messageBody = "http://"+InetAddress.getLocalHost().getHostAddress()+"8080/job/DataDrivenProject/Extent_20Report/";
			System.out.println(messageBody);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub

	}
	// http://localhost:8080/job/DataDrivenProject/Extent_20Report/
}
