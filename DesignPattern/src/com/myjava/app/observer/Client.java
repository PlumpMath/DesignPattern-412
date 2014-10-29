package com.myjava.app.observer;

public class Client {
	public static void main(String[] args){
		AbstractObserver OA = new ConcreteObserver();
		AbstractObserver OB = new PeerObserver();
		
		AbstractObserved target = new ConcreteObserved();
		target.addAbstractObserver(OA);
		target.addAbstractObserver(OB);
		System.out.println("==  Notify Both OA And OB to Update  ==");
		target.notifyObservers();
		
		System.out.println("==  Remove OA ,Only OB Left ==");
		target.removeAbstractObserver(OA);
		target.notifyObservers();
		
		System.out.println("==  Remove OB ,NO Observer Left ==");
		target.removeAbstractObserver(OB);
		target.notifyObservers();
		System.out.println("==  You See ,NO one is Notified ==");
	}
}
