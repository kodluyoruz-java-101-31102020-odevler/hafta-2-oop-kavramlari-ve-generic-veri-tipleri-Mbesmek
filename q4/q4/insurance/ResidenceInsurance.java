package q4.insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance {

	public ResidenceInsurance(String insuranceName, double insurancePrice, Date insuranceStartDate,
			Date insuranceFinishDate) {
		super(insuranceName, insurancePrice, insuranceStartDate, insuranceFinishDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateInsurance() {
		long startTime =(super.getInsuranceStartDate().getTime());
		long finishTime=(super.getInsuranceFinishDate().getTime());
		long usageTime=finishTime-startTime;
		double insurancePrice=usageTime*0.20;
		return (int) insurancePrice;
	}

}
