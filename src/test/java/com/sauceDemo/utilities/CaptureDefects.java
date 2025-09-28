package com.sauceDemo.utilities;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sauceDemo.GenericScripts.I_ApplicationConstants;

public class CaptureDefects implements I_ApplicationConstants
{
	public static void getDefect(String fileName) throws Exception
	{
		TakesScreenshot driver = null;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(screenShotsPath+fileName+" "+TimeStamp.CurrentTimeStamp()+".png");
        org.openqa.selenium.io.FileHandler.copy(temp, perm);		
	}

}
