class A{
	static void tell(){
		System.out.println("WE are the A's");	
	}
	
	static void tell(int k){
		System.out.println("WE are the B's" + k);	
	}
}

/*
class B extends A{
	static void tell(){
		System.out.println("WE are the B's");	
	}
}
*/

class CheckOverLoadingStatic{
	public static void main(String[] args){
		A k = new A();
		k.tell();
		k.tell(5);		
	}
}