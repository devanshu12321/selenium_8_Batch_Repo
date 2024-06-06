package extentreports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
   @Test
	public void report() {
	   String TIME=LocalDateTime.now().toString().replace(":", "-");

		// Step1:Create ExtentSparkReporter object
	   ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReport.html");
	   
	   // Step2:Create ExtentReports object
	   ExtentReports extReport=new ExtentReports();
	   
	   
	   // Step3:attach spark reporter to ExtentReports
	   extReport.attachReporter(spark);
	   
	   // Step4:create ExtentTest object
	   ExtentTest test=extReport.createTest("report");
	   
	  // Step5: call log() to provide status and message 
	   test.log(Status.PASS, "log message added into extent reports");
	   
	 // Step 6:call flush() to write report into destination
	   extReport.flush();
	}
}
