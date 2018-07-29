package javadesignp.buildermethod;

public class Phone {
	
	private String OS;
	private int RAM;
	private String PROCESSOR;
	private double screensize;
	private int battery;
	public Phone(String oS, int rAM, String pROCESSOR, double screensize, int battery) {
		super();
		OS = oS;
		RAM = rAM;
		PROCESSOR = pROCESSOR;
		this.screensize = screensize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", RAM=" + RAM + ", PROCESSOR=" + PROCESSOR + ", screensize=" + screensize
				+ ", battery=" + battery + "]";
	}
	

}
