class TestString{
	public static void main(String[] args){
		String cname1 = "FirstBit";
		String cname2 = "FirstBit";
		String cname3 = "Infosys";
		String str = new String("FirstBit");
		
		System.out.println("1st If Condition : Equal");
		if(cname1 == cname2){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}

		System.out.println("2nd If Condition : Not Equal");
		if(cname1 == str){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}

		System.out.println("3rd If Condition : Equal");
		if(cname1.equals(str)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}
}