/*A worked example follows : If N=5 AND C=2 the correct product and final sum for each element
 * of the range are 0 + 1 + 2 + 6 + 12 = 21
 * Solution should be implemented in Java. Initially calculate the value where N = 100 and C=10, and let us know the 
 * answer
 * please additionally tell us the value where n = 1000000 and c = 200 , but only include the first 10 digits of the
 * results in your answer
 *   */
package com.cms.interviewQues;

public class InterviewQues3 {
	int sum = 0;
	public void correctProductAndSum(int n, int s){
		
		for(int i =0; i< n; i++){
			//System.out.println("s="+s +" , i="+i+" , s^i="+ (s^i) +" , (s^i)-i="+((s^i)-i) );
			//sum += (s^i)-i;
			int pro = pow(s,i);
			System.out.println("s="+s +" , i="+i+" , s^i="+ pro + ", (s^i)-i="+(pro-i) );
			
		}
		System.out.println("Sum="+sum);
	}
	public static void main(String args[]){
		InterviewQues3 obj = new InterviewQues3();
		obj.correctProductAndSum(5, 2);
	}
	
	int pow(int base, int power){
	    if(power == 0) return 1;
	    return base * pow(base, --power);
	}
	
}
