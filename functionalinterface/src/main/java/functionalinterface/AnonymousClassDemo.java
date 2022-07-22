package functionalinterface;

public class AnonymousClassDemo {

	public static void main(String[] args) {
	
		   Calculator calculator=new Calculator(){

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			   
		   };
		   System.out.println(calculator.add(4, 5));

	}

}
