package com.hussi.util;

import com.hussi.domain.ParkingTicket;

import java.sql.Connection;

public interface DataServices
{
	Connection getConnection();
	boolean writeToDB(ParkingTicket parkingTicket);
}
