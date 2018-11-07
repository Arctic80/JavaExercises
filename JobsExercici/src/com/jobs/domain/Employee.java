package com.jobs.domain;

import java.math.BigDecimal;

public class Employee extends AbsStaffMember
{
	protected BigDecimal salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, BigDecimal salaryPerMonth, IPaymentRate paymentRate) throws Exception
    {
		super(name, address, phone);		
		if (paymentRate == null || (salaryPerMonth.compareTo(BigDecimal.ZERO) == -1))
			throw new Exception("Salario negativo o PaymentRate null");

		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;
	}

	@Override
	public void pay()
    {
		totalPaid = paymentRate.pay(salaryPerMonth);
	}
}