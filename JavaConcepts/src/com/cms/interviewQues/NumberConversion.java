package com.cms.interviewQues;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class NumberConversion {

	public static void main(String[] args) {
		NumberConversion obj = new NumberConversion();
		obj.toConvertSmallerDigitNumber("48565664968483514466");

	}
	
	public void toConvertSmallerDigitNumber(final String originalNumber) {
		
		BigInteger firstPart = new BigInteger(originalNumber.subSequence(0, originalNumber.length()/2).toString());
		BigInteger lastPart = new BigInteger(originalNumber.subSequence(originalNumber.length()/2, originalNumber.length()).toString());
		String numberInBase36 = firstPart.add(lastPart).toString(36);
		
		System.out.println(numberInBase36);
		
	}

}
