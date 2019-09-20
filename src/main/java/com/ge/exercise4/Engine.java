package com.ge.exercise4;

public class Engine {
	 int maxNumRebuilds;
	 double flightHoursBeforeRebuild;
	 double dryWeight;
	 double wetWeight;
	 double takeoffThrust;
	
	public Engine(final int maxNumRebuilds, final double flightHoursBeforeRebuild, final double dryWeight, final double wetWeight,
			final double takeoffThrust) {
		this.maxNumRebuilds = maxNumRebuilds;
		this.flightHoursBeforeRebuild = flightHoursBeforeRebuild;
		this.dryWeight = dryWeight;
		this.wetWeight = wetWeight;
		this.takeoffThrust = takeoffThrust;
	}
	
}
