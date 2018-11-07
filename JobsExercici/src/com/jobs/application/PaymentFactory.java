package com.jobs.application;

import com.jobs.domain.IPaymentRate;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class PaymentFactory
{

	public static IPaymentRate createPaymentRateBoss()
    {
		return new IPaymentRate()
        {
			@Override
			public BigDecimal pay(BigDecimal salaryPerMonth)
            {
				return salaryPerMonth.multiply(new BigDecimal(1.5)).setScale(2, RoundingMode.HALF_EVEN);
			}
		};
	}

    public static IPaymentRate createPaymentRateManager()
    {
        return new IPaymentRate()
        {
            @Override
            public BigDecimal pay(BigDecimal salaryPerMonth)
            {
                return salaryPerMonth.multiply(new BigDecimal(1.1)).setScale(2, RoundingMode.HALF_EVEN);
            }
        };
    }


	public static IPaymentRate createPaymentRateEmployee()
    {
		return new IPaymentRate()
        {
			@Override
			public BigDecimal pay(BigDecimal salaryPerMonth)
            {
                return salaryPerMonth.multiply(new BigDecimal(0.85)).setScale(2, RoundingMode.HALF_EVEN);
			}
		};
	}
}