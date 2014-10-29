package com.myjava.app.cmd;

public class Tv {

	public int currentChannel = 0;
	public void turnOn(){
		System.out.println("Tv is ON now .");
	}
	public void turnOff(){
		System.out.println("Tv is OFF now .");
	}
	public void changeChannel(int channel){
		this.currentChannel = channel;
		System.out.println("Current Channel of Tv is "+channel+" now .");
	}
}