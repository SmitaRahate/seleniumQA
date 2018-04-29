package com.demo.oop.abstraction;

public class ElectricGuitar extends StringInstrument{
	public ElectricGuitar() {
		super();
		this.name = "guitar";
		this.numberOfString = 6;
	}
	
	public ElectricGuitar(int instrumentOfString)
	{
		super();
		this.name = "Guitar";
		this.numberOfString = instrumentOfString;
	}
	
	@Override
	public void play() {
		System.out.println(name +": "+numberOfString);
	}

	@Override
	public void play1() {
		// TODO Auto-generated method stub
		
	}
}


