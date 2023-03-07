package com.learning.multithreading;

public class Main {

	public static void main(String[] args) {
		TickTack tt = new TickTack();
		TickTackThread t1 = new TickTackThread(tt, "tick");
		TickTackThread t2 = new TickTackThread(tt, "tack");
		
		try {
			t1.t.join();
			t2.t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
