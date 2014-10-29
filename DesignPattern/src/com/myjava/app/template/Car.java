package com.myjava.app.template;

/**
 * 模板方法  
 */
public abstract class Car {

	protected abstract void start();
	protected abstract void stop();
	protected abstract void roar();
	protected abstract void turnaround();
	protected abstract void lignt();
	
	public final void show(){
		start();
		lignt();
		roar();
		turnaround();
		stop();
	}
	
	public static void main(String[] args){
		Bmw b = new Bmw();
		Ford f = new Ford();
		System.out.println("time for BMW to show:");	
		b.show();
		System.out.println("time for Ford to show:");	
		f.show();
	}
}

class Bmw extends Car{

	public void start() {
		System.out.println("BMW starts.");		
	}

	public void stop() {
		System.out.println("BMW stop.");		
	}

	public void roar() {
		System.out.println("BMW roar like thunder.");			
	}

	public void turnaround() {
		System.out.println("BMW is turning around 50km/h.");			
	}

	public void lignt() {
		System.out.println("BMW ' led lighting .");		
	}
	
}

class Ford extends Car{

	public void start() {
		System.out.println("Ford starts.");		
	}

	public void stop() {
		System.out.println("Ford stop.");		
	}

	public void roar() {
		System.out.println("Ford sounds slient.");			
	}

	public void turnaround() {
		System.out.println("Ford is turning around 100km/h.");			
	}

	public void lignt() {
		System.out.println("Ford ' led lights .");		
	}
	
}
