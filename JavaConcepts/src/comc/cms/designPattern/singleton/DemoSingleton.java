package comc.cms.designPattern.singleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static DemoSingleton _instance = null;
	
	private int i = 10;
	private DemoSingleton() {
	}
	
	public static DemoSingleton getInstance() {
		if(_instance == null) {
			synchronized(DemoSingleton.class) {
				if(_instance == null) {
					_instance =  new DemoSingleton();
				}
			}
		}
		return _instance;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	protected Object readResolve() {
		return _instance;
		}
	
}
