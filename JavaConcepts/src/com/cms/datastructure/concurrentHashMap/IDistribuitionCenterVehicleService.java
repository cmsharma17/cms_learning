package com.cms.datastructure.concurrentHashMap;

public interface IDistribuitionCenterVehicleService<T> {
	public void arrivalQueue(T vehicle);
	public boolean onloadInProgress(T vehicle);
	public void departureQueue(T vehicle);
}
