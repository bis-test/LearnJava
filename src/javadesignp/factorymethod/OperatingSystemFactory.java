package javadesignp.factorymethod;

public class OperatingSystemFactory {
	
	public Plan getPlanType(String planType)
	{
		if (planType.equals("Domestic"))
		return new DomesticPlan();
		
		else if (planType.equals("Commercial"))
		return new CommercialPlan();
		
		else if (planType.equals("Institutional"))
			return new InstitutionalPlan();
		else
			return null;
		
	}

}
