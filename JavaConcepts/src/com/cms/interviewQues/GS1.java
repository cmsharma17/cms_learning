package com.cms.interviewQues;

import java.util.ArrayList;
import java.util.List;

public class GS1 {
	
	static int x;//x co-ordinate of Circumference;
    static int y;//y co-ordinate of Circumference;
    
	public static void main(String argsp[]){
		GS1 obj = new GS1();
		int size = obj.findNumberofIntegerPoints(5);
		System.out.println(size);
	}
	
	static int findNumberofIntegerPoints(int radius) {
        int xCenter = 0;
        int yCenter = 0;
        List<Integer> list = new ArrayList<Integer>();
        
       // (x*x)+(y*y)=(radius*radius);
        
        for(int n=0; n<radius; n++){
            x = n;
            System.out.println(Math.sqrt((radius*radius)-(x*x)));
            Math.sqrt((radius*radius)-(x*x));
            System.out.println(Math.floor(Math.sqrt((radius*radius)-(x*x))));
            if(Math.sqrt((radius*radius)-(x*x)) == Math.floor(Math.sqrt((radius*radius)-(x*x)))){
                list.add(y);
                list.add(-y);
            }
        }
        
        return list.size();
	}
}
