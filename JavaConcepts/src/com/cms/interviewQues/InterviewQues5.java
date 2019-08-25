package com.cms.interviewQues;

public class InterviewQues5 {
	String s = new String("Ram");
	public static void main(String[] args) {
		InterviewQues5 obj = new InterviewQues5();
		InterviewQues5 obj1 = new InterviewQues5();
		obj1 = obj;
		obj1.s = "Chandra";
		System.out.println(obj.s);
		System.out.println(obj1.s);
	}

}
