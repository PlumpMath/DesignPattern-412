package com.myjava.app.adapter.defaultAdapter;

public class JobImpl extends JobDefault{

	public void speakJapanese(){
		System.out.println("I speak Chinese ...");
	}
}

/**
 	默认适配器模式：这种模式的核心归结如下：当你想实现一个接口但
 	又不想实现所有接口方法，只想去实现一部分方法时，就用中默认的
 	适配器模式，他的方法是在接口和具体实现类中添加一个抽象类，而
 	用抽象类去空实现目标接口的所有方法。而具体的实现类只需要覆盖
 	其需要完成的方法即可
 **/
