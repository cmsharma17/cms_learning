package com.cms.programming.interviewQuestions;

public class FindFrequencyWithoutCllection {

	public static void main(String[] args) {
		char[] inputChar = new char[]{'a','a','c','b','b','a','c','d'};
		int length = inputChar.length;
		int tmpArr[] = new int[length];
		int visited = -1;
		for(int i = 0; i<length; i++) {
			int count = 1;
			for(int j=i+1; j<length; j++) {
				if(inputChar[i] == inputChar[j]) {
					System.out.println(inputChar[i]);
					count ++;
					tmpArr[j] = visited; 
				}
			}
			if(tmpArr[i] != visited) {
				tmpArr[i] = count;
			}
		}
		
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < tmpArr.length; i++){  
            //if(tmpArr[i] != visited)  
                System.out.println("    " + inputChar[i] + "    |    " + tmpArr[i]);  
        }  
        System.out.println("----------------------------------------");  

	}

}
