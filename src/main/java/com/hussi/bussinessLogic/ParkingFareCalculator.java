package com.hussi.bussinessLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * Created by wahid on 20-Jun-18.
 */

public class ParkingFareCalculator
{
	private static final Logger logger = LoggerFactory.getLogger(ParkingFareCalculator.class);

	public long calculateParkingFare(long entry, long exit)
	{
		System.out.println("calculate parking fare");
		return 0;
	}

	private static int calculateFareWeekday(int hours)
	{
		return 0;

	}

	private static int calculateFareWeekEnd(int hours)
	{
		return 0;

	}

	private static boolean isWeekEnd(Calendar cal)
	{
		return cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}

	private static boolean isWeekDay(Calendar cal)
	{
		return !isWeekEnd(cal);
	}

	// DummyTest
	/*public static void main(String[] args)
	{

	}*/

}