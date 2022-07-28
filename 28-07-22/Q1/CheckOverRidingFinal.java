class A{
	final void tell(){
		System.out.println("WE are the A's");	
	}
	
}


class B extends A{
	final void tell(){
		System.out.println("WE are the B's");	
	}
}

class CheckOverRidingFinal{
	public static void main(String[] args){
		A k = new A();
		k.tell();		
	}
}