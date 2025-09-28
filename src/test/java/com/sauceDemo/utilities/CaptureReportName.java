package com.sauceDemo.utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sauceDemo.GenericScripts.I_ApplicationConstants;


public class CaptureReportName implements I_ApplicationConstants
{
	public static String getReportName() throws Exception
	{
		
		String reportName = TimeStamp.CurrentTimeStamp()+".html";
		return reportName;
	}

}
