package com.hussi.bussinessLogic;

import com.hussi.util.ReportingInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class DayCollection implements ReportingInterface
{

	private static final Logger logger = LoggerFactory.getLogger(DayCollection.class);
	public long getDaysCollection(Date date)
	{
		logger.info("scan records from DB on daily basis");
		return 0;
	}

}
