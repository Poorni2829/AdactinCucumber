package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.exe",
plugin= {"pretty",
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\Fb.json",
		"junit:src\\test\\resources\\Reports\\output.xml","rerun:src\\test\\resources\\FailedScenario\\failed.txt"}
      ,dryRun=false,monochrome=true)

public class TestRunner {
@AfterClass
  public static void JVMReportGeneration() {
	JVMReport.GenerateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Fb.json");
	

}

}
