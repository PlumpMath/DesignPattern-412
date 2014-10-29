package com.myjava.app.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserved implements AbstractObserved{

	List<AbstractObserver> observers = new ArrayList<AbstractObserver>();
	public void addAbstractObserver(AbstractObserver observer) {
		observers.add(observer);		
	}

	public void removeAbstractObserver(AbstractObserver observer) {
		observers.remove(observer);		
	}

	public void removeAllObservers() {
		observers.clear();
	}

	public void notifyObservers() {
		//Implemetation of the same Interface makes unifying of notification;
		for(AbstractObserver observer:observers){
			observer.update();
		}		
	}


}
