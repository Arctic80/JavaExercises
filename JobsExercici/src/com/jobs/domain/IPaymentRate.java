package com.jobs.domain;


import java.math.BigDecimal;

public interface IPaymentRate
{
	BigDecimal pay(BigDecimal salaryPerMonth);
}