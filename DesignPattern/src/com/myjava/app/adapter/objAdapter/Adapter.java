package com.myjava.app.adapter.objAdapter;

public class Adapter implements Job{

	Person p;
	public Adapter(Person p){
		this.p = p;
	}
	public void speakJapanese() {
		p.speakJapanese();	
	}

	public void speakChinese() {
		
	}

	public void speakFrench() {
		p.speakFrench();		
	}

}
/**
   对象的适配器模式，把“源”作为一个构造参数传入适配器，
   然后执行接口所要求的方法。这种适配模式可以为多个源
   进行适配。弥补了类适配模式的不足
 */