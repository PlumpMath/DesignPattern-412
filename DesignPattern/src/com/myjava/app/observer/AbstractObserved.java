package com.myjava.app.observer;

public interface AbstractObserved {
	//Add Observer
	public void addAbstractObserver(AbstractObserver observer);
	//Remove Observer
	public void removeAbstractObserver(AbstractObserver observer);
	//Remove All Observer
	public void removeAllObservers();
	//Nofify Observer
	public void notifyObservers();
}
