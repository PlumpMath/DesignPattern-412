package com.myjava.app.cmd;

public class CommandReChannel implements Command{

	private Tv tv;
	private int channel;
	public CommandReChannel(Tv tv,int channel) {
		this.tv = tv;
		this.channel = channel;
	}
	public void execute() {
		tv.changeChannel(channel);		
	}	
}
