package com.hussi.domain;

public class Customer
{
	long id;
	private long getId()
	{
		return id;
	}
	private String getCustomer_name()
	{
		return customer_name;
	}
	private Car getCar()
	{
		return car;
	}
	private void setId(long id)
	{
		this.id = id;
	}
	private void setCustomer_name(String customer_name)
	{
		this.customer_name = customer_name;
	}
	private void setCar(Car car)
	{
		this.car = car;
	}
	// structure it right .. this should go on top and car should have a access specifier
	String customer_name;
	Car car;
	

}
