package com.learning.multithreading.threadtrafficlights;

public class Main {

	public static long getEndingTime() {
		return System.currentTimeMillis();
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		TrafficLight thread = new TrafficLight();
		for (int i=0; i < 6; i++) {
			System.out.println(thread.getCor());
			thread.waitForColorToChange();
		}
		thread.pause();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.resume();
		for (int i=0; i < 6; i++) {
			System.out.println(thread.getCor());
			thread.waitForColorToChange();
		}
		thread.stop();
		long duration = (getEndingTime() - start)/1000;
		System.out.println("Duração: " + duration + "s");
	}
}
