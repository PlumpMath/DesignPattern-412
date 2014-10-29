package com.myjava.app.cmd;

public class Client {
	public static void main(String[] args){
		Tv tv = new Tv();
		
		CommandON on = new CommandON(tv);
		CommandOFF off = new CommandOFF(tv);
		CommandReChannel reChannel = new CommandReChannel(tv,67);
		
		Invoker control = new Invoker(on,off,reChannel);
		control.turnOn();
		control.changeChannel();
		control.turnOff();
	}
}
