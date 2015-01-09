package com.steftmax.larrys_epic_misadventures.update;

public class DeltaTimer {

	long lastNanoTime = System.nanoTime();
	long thisTime = lastNanoTime;
	long delta = 0;
	private double timeScale;

	public DeltaTimer(double timeScale) {
		this.timeScale = timeScale;
	}

	public long getDelta() {
		thisTime = System.nanoTime();

		delta = (long) ((thisTime - lastNanoTime) * timeScale);
		lastNanoTime = thisTime;
		return delta;
	}

}