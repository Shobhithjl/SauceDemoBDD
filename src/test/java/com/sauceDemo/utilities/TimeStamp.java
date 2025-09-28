package com.sauceDemo.utilities;

public class TimeStamp 
{
	public static String CurrentTimeStamp()
	{
		java.util.Date date = new java.util.Date();
		String formatDate = date.toString();
		String actualDate = formatDate.replace(":","-");
		return actualDate;
	}
}
