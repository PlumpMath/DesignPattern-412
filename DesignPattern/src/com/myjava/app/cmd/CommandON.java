package com.myjava.app.cmd;

public class CommandON implements Command{

	private Tv tv;	
	public CommandON(Tv tv) {
		this.tv = tv;
	}
	public void execute() {
		tv.turnOn();
	}
}
