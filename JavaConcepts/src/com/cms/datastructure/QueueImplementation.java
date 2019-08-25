package com.cms.datastructure;

public class QueueImplementation {
	int front = 0;
	int rear = -1;
	int queueArray[];
	private int capacity;
	int currentSize = 0;
	
	public QueueImplementation(int size){
		this.capacity = size;
		queueArray =  new int[this.capacity];
	}
	
	
	public void enqueue(int item){
		if(currentSize == capacity){
			System.out.println("unable to add element");
		}else{
			rear ++;
			if(rear == capacity-1){
                rear = 0;
            }
			queueArray[rear] = item;
			currentSize ++;
			System.out.println("Push::"+item);
		}
	}
	
	public void dequeue(){
		if(currentSize == 0){
			System.out.println("Underflow, unable to remove element");
		}else{
			front ++;
			if(front == capacity-1){
				System.out.println("Pull Element::"+queueArray[front-1]);
				front = 0;
			}else{
				System.out.println("Pull Element::"+queueArray[front-1]);
			}
			currentSize--;
		}
	}
	
	public static void main(String args[]){
		QueueImplementation obj = new QueueImplementation(5);
		obj.enqueue(5);
		obj.dequeue();
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.dequeue();
		obj.dequeue();
		obj.enqueue(9);
	}
}
