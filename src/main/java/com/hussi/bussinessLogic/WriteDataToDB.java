package com.hussi.bussinessLogic;

import com.hussi.domain.ParkingTicket;
import com.hussi.util.DataServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

public class WriteDataToDB implements DataServices
{
	private static final Logger logger = LoggerFactory.getLogger(WriteDataToDB.class);
	@Override
	public Connection getConnection()
	{
		logger.info("get Connection Object");
		return null;
	}

	@Override
	public boolean writeToDB(ParkingTicket parkingTicket)
	{
		logger.info("use connection object and write data to DB");
		return false;
	}

}
