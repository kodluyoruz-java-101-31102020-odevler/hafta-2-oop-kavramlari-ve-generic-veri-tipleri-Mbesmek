package q4.insurance;

import java.util.Date;

public class CarInsurance extends Insurance {

	public CarInsurance(String insuranceName, double insurancePrice, Date insuranceStartDate,
			Date insuranceFinishDate) {
		super(insuranceName, insurancePrice, insuranceStartDate, insuranceFinishDate);

	}

	@Override
	public int calculateInsurance() {
		long startTime =(super.getInsuranceStartDate().getTime());
		long finishTime=(super.getInsuranceFinishDate().getTime());
		long usageTime=finishTime-startTime;
		 super.insurancePrice=usageTime*0.30;
		return (int) super.insurancePrice;
	}

}
