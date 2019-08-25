package com.cms.basicConcepts;

import java.util.Date;

/**
 * @author chandramoulisharma
 *
 */
public class ImmutableClass {
	private final Integer immutableField1;
	private final String immutableField2;
	private final Date mutableField;
	
	private ImmutableClass(Integer fld1, String fld2, Date fld3){
		this.immutableField1 = fld1;
		this.immutableField2 = fld2;
		this.mutableField = fld3;
	}
	
	public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date fld3){
		return new ImmutableClass(fld1,fld2,fld3);
	}

	public Integer getImmutableField1() {
		return immutableField1;
	}

	public String getImmutableField2() {
		return immutableField2;
	}
	
	public Date getMutableField(){
		return new Date(mutableField.getTime());
	}
	
}
