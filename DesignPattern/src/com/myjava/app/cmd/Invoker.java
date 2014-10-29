package com.myjava.app.cmd;

public class Invoker {

	private Command on,off,changeChannel;
	public Invoker(Command on, Command off, Command changeChannel) {
		this.on = on;
		this.off = off;
		this.changeChannel = changeChannel;
	}
	public void turnOn(){
		on.execute();
	}
	public void turnOff(){
		off.execute();
	}
	public void changeChannel(){
		changeChannel.execute();
	}
}
