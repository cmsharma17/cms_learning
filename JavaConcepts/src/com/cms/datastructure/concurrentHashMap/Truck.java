package com.cms.datastructure.concurrentHashMap;

public class Truck {
	private int plates;
	private boolean inProgress;

	public Truck() {

	}

	public Truck(int plates) {

		this.plates = plates;

	}

	public int getPlates() {
		return plates;
	}

	public void setPlates(int plates) {
		this.plates = plates;
	}

	public boolean isInProgress() {
		return inProgress;
	}

	public void setInProgress(boolean inProgress) {
		this.inProgress = inProgress;
	}

	// It is VERY IMPORTANT to implement hasCode() and equals() on classes
	// that will be "stored" in a HashMap

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		if (plates != other.plates)
			return false;
		if (inProgress != other.inProgress)
			return false;
		return true;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + plates;
		result = prime * result + (inProgress ? 1231 : 1237);
		return result;
	}

	public String toString() {
		return "Truck [plates=" + plates + "]";
	}
}
