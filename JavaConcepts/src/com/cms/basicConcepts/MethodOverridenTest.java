package com.cms.basicConcepts;

public class MethodOverridenTest {

	public static void main(String[] args) {
		bogo(new Extension());

	}
	static void bogo(Base b){
		b.add(8);
		b.print();
	}

}

class Base{
	int i;
	Base(){
		System.out.println("Base Constructor");
		add(1);
	}
	void add(int v){
		System.out.println("Base add method");
		i = i+v;
	}
	void print(){
		System.out.println(i);
	}
}

class Extension extends Base{
	Extension(){
		System.out.println("Extension Constructor");
		add(2);
	}
	void add(int v){
		System.out.println("Extension add method");
		i += v*2;
	}
}
