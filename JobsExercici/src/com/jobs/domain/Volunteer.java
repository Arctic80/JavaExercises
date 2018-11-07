package com.jobs.domain;


import java.math.BigDecimal;

public class Volunteer extends AbsStaffMember
{
    String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception
    {
		super(name, address, phone);
		this.description = description;
	}

	@Override
	public void pay()
    {
		totalPaid = BigDecimal.ZERO;
	}
}