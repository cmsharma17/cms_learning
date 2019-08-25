package com.cms.interviewQues;

public class InterviewQues6 {
	
	public void testA() throws Exception{
		System.out.println("class A");
	}

	public static void main(String[] args) throws Exception {
		BBB b = new BBB();
		b.testA();
		InterviewQues6 A = new BBB();
		A.testA();
	}

}

 class BBB extends InterviewQues6{
	public  void testA() {
		System.out.println("BBB");
	}
}
