package com.cms.datastructure.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DistribuitionCenterTruckService implements IDistribuitionCenterVehicleService<Truck> {
	
	private static final ConcurrentMap<Truck, Long> vehicleQueue = new ConcurrentHashMap<Truck, Long>();
	
	@Override
	public void arrivalQueue(Truck vehicle) {
		long currentTime = System.currentTimeMillis();
		DistribuitionCenterTruckService.vehicleQueue.putIfAbsent(vehicle, currentTime);
		
	}

	@Override
	public boolean onloadInProgress(Truck vehicle) {
		return DistribuitionCenterTruckService.vehicleQueue.get(vehicle) != null;
	}

	@Override
	public void departureQueue(Truck vehicle) {
		DistribuitionCenterTruckService.vehicleQueue.remove(vehicle);
	}

}
