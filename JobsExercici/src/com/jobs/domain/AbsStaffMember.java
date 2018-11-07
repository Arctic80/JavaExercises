package com.jobs.domain;

import java.math.BigDecimal;
import java.math.BigInteger;


public abstract class AbsStaffMember
{
    int id;
	private String name;
	String address;
	String phone;
	BigDecimal totalPaid = new BigDecimal(BigInteger.ZERO);

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception
    {
		if (name.equals("") || address.equals("") || phone.equals("")) throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;

		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay();

    public String getName()
    {
        return name;
    }

    public BigDecimal getTotalPaid()
    {
        return totalPaid;
    }
}