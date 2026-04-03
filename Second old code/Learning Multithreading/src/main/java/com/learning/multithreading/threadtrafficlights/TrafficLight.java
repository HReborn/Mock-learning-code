package com.learning.multithreading.threadtrafficlights;

public class TrafficLight implements Runnable {

	public enum CorSemaforo {

		RED(2000), YELLOW(300), GREEN(1000);
		
		private int lightTime;
		
		CorSemaforo(int lightTime) {
			this.lightTime = lightTime;
		}
		
		public int getLightTime() {
			return lightTime;
		}
		
	}
	
	private boolean on;
	private Thread t;
	private CorSemaforo cor;
	
	TrafficLight() {
		this.on = true;
		this.cor = CorSemaforo.RED;
		this.t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		while (on) {
			putToSleep(cor.getLightTime());
			changeColor();
		}
	}
	public synchronized void changeColor() {
		if (cor == CorSemaforo.RED) {
			cor = CorSemaforo.YELLOW;
		} else if (cor == CorSemaforo.YELLOW) {
			cor = CorSemaforo.GREEN;
		} else if (cor == CorSemaforo.GREEN) {
			cor = CorSemaforo.RED;
		}
		notify();
	}
	public CorSemaforo getCor() {
		return cor;
	}
	public synchronized void pause() {
		System.out.println("pausing");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void stop() {
		System.out.println("stopping");
		this.on = false;
	}
	public synchronized void resume() {
		this.on = true;
		System.out.println("resuming");
		notify();
	}
	public void putToSleep(int mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void waitForColorToChange() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}