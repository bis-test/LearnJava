package javadesignp.buildermethod;

public class PhoneBuilder {

	private String OS;
	private int RAM;
	private String PROCESSOR;
	private double screensize;
	private int battery;
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	public PhoneBuilder setRAM(int rAM) {
		RAM = rAM;
		return this;
	}
	public PhoneBuilder setPROCESSOR(String pROCESSOR) {
		PROCESSOR = pROCESSOR;
		return this;
	}
	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(OS, RAM, PROCESSOR, screensize, battery);
		
	}
}
