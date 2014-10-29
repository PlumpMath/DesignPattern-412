package com.myjava.app.cmd;

public class CommandOFF implements Command{

	private Tv tv;
	public CommandOFF(Tv tv) {
		this.tv = tv;
	}
	public void execute() {
		tv.turnOff();
	}	
}
