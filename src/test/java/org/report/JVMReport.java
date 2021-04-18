package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static  void GenerateJvmReport(String Jsonpath) {
	      File F= new File(System.getProperty("user.dir")+"\\target\\Report");

	      
	      Configuration con=new Configuration(F,"facebook Application");
	      con.addClassifications("platform name","windows");
	      con.addClassifications("platform version","10");
	      con.addClassifications("Browser name","chrome");
	      con.addClassifications("browser version ","89.0");
	      
	      
	      List<String>li=new ArrayList<String>();
	      li.add(Jsonpath);
	      
	      ReportBuilder r= new ReportBuilder(li,con);
	      r.generateReports();
	}
	   
	}


