package com.learning.multithreading.ticktack;

public class TickTackThread implements Runnable {

	String name;
	TickTack tt;
	Thread t;
	int ROLLS = 10;
	
	public TickTackThread(TickTack tt, String name) {
		this.tt = tt;
		t = new Thread(this, name);
		t.start();
	}
	
	@Override
	public void run() {
		if (t.getName().equalsIgnoreCase("tick")) {
			for (int i=0; i<ROLLS; i++) {
				tt.tick(true);
			}
			tt.tick(false);
		} else if (t.getName().equalsIgnoreCase("tack")) {
			for (int i=0; i<ROLLS; i++) {
				tt.tack(true);
			}
			tt.tack(false);
		}
		
	}
	
}
