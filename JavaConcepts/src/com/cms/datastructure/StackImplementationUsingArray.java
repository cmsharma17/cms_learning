//STACK :: LIFO Last In First Out

package com.cms.datastructure;

public class StackImplementationUsingArray {
	int stackArray[] = new int[10] ;
	int top = -1;
	
	public void push(int element){
		top +=1;
		stackArray[top] = element;
	}
	
	public void pop(){
		top -=1;
	}
	
	public void printStack(){
		for(int i=0; i<=top; i++){
			System.out.println("Element:"+stackArray[i]);
		}
	}
	
	public static void main(String args[]){
		StackImplementationUsingArray obj = new StackImplementationUsingArray();
		obj.push(10);
		obj.push(20);
		obj.pop();
		obj.push(30);
		obj.printStack();
	}
}

