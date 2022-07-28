class A{
	static void tell(){
		System.out.println("WE are the A's");	
	}
}


class B extends A{
	static void tell(){
		System.out.println("WE are the B's");	
	}
}


class CheckOverRidingStatic{
	public static void main(String[] args){
		B k = new B();
		k.tell();		
	}
}