class Contact{
	public static void main(String[] args){
		String name3=findContact(7845963214l);
		System.out.println("the contact belongs to : "+name3);
		String name2=findContact(8974564178l);
		System.out.println("the contact belongs to : "+name2);
		String name4=findContact(5674189632l);
		System.out.println("the contact belongs to : "+name4);
		String name01=findContact(5674189562l);
		System.out.println("the contact belongs to : "+name01);
		String name5=findContact(5678942132l);
		System.out.println("the contact belongs to : "+name5);
		String name6=findContact(6589747896l);
		System.out.println("the contact belongs to : "+name6);
		String name7=findContact(7896458974l);
		System.out.println("the contact belongs to : "+name7);
		String name8=findContact(8978458956l);
		System.out.println("the contact belongs to : "+name8);
		String name9=findContact(9874654578l);
		System.out.println("the contact belongs to : "+name9);
		String name02=findContact(9874650078l);
		System.out.println("the contact belongs to : "+name02);
		String name10=findContact(7898789878l);
		System.out.println("the contact belongs to : "+name10);
		String name1=findContact(9845637812l);
		System.out.println("the contact belongs to : "+name1);
		String name05=findContact(9845007812l);
		System.out.println("the contact belongs to : "+name05);
		
	}
	static String findContact(long num){
		if(num==9845637812l){
			return "suman";
		}
		else if(num==7845963214l){
			return "manu";
		}
		else if(num==8974564178l){
			return "sham";
		}
		else if(num==5674189632l){
			return "ram";
		}
		else if(num==5678942132l){
			return "bhema";
			
		}
		else if(num==6589747896l){
			return "soma";
		}
		else if(num==7896458974l){
			return "tharun";
		}
		else if(num==8978458956l){
			return "abhi";
		}
		else if(num==9874654578l){
			return "raghu";
		}
		else if(num==7898789878l){
			return "manoj";
		}
		else{
			return "no one: enter a valid number";
		}
		
	}
}