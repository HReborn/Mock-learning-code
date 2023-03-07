package com.learning.multithreading;

public class TickTack {
	
	boolean tick;

	public synchronized void tick(boolean running) {

		if (!running) {
			tick = true;
			notify();
			return;
		}

		tick = true;

		System.out.print("Tick ");

		try {

			while (tick) {
				notify();
				wait();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void tack(boolean running) {

		if (!running) {
			tick = false;
			notify();
			return;
		}

		tick = false;

		System.out.println("Tack");

		try {

			while (!tick) {
				notify();
				wait();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
