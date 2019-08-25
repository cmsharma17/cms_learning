
public class Test1 extends abc implements i{
	int i =9;
	static{
		//static int i=5;
		System.out.println(new Test1().i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void B() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

}

abstract class abc{
	public void A(){
		
	}
	
	public abstract void B();
}

interface i{
	public void a();
}
