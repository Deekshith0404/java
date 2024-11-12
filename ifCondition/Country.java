class Country{
	public static void main(String[] args){
		int ref=findCountry("india");
		System.out.println("the pin code of india is +"+ref);
		int ref1=findCountry("china");
		System.out.println("the pin code of china is +"+ref1);
		int ref01=findCountry("france");
		System.out.println("the pin code of france is "+ref01);
		int ref2=findCountry("bangladesh");
		System.out.println("the pin code of  bangladesh is +"+ref2);
		int ref3=findCountry("israel");
		System.out.println("the pin code of israel is +"+ref3);
		int ref4=findCountry("indonesia");
		System.out.println("the pin code of indonesia is +"+ref4);
		int ref5=findCountry("mayanmar");
		System.out.println("the pin code of mayanmar is +"+ref5);
		int ref6=findCountry("russia");
		System.out.println("the pin code of russia is +"+ref6);
		int ref7=findCountry("japan");
		System.out.println("the pin code of japan is +"+ref7);
		int ref8=findCountry("united states");
		System.out.println("the pin code of united states is +"+ref8);
		int ref02=findCountry("scoutland");
		System.out.println("the pin code of scoutland is "+ref02);
		int ref9=findCountry("ukraine");
		System.out.println("the pin code of ukraine is +"+ref9);
		int ref10=findCountry("iran");
		System.out.println("the pin code of iran is +"+ref10);
		int ref03=findCountry("wales");
		System.out.println("the pin code of wales is "+ref03);
		int ref11=findCountry("mexico");
		System.out.println("the pin code of mexico is +"+ref11);
		int ref12=findCountry("australia");
		System.out.println("the pin code of australia is +"+ref12);
		int ref13=findCountry("united kingdom");
		System.out.println("the pin code of united kingdom is +"+ref13);
		int ref014=findCountry("ireland");
		System.out.println("the pin code of ireland is "+ref014);		
	}
	static int findCountry(String country){
		if(country=="india"){
			return 91;
		}
		else if(country=="china"){
			return 86;
		}
		else if(country=="bangladesh"){
			return 880;
		}
		else if(country=="israel"){
			return 972;
		}
		else if(country=="indonesia"){
			return 62;
			
		}
		else if(country=="mayanmar"){
			return 95;
		}
		else if(country=="russia"){
			return 7;
		}
		else if(country=="japan"){
			return 81;
		}
		else if(country=="united states"){
			return 1;
		}
		else if(country=="ukraine"){
			return 380;
		}
		else if(country=="iran"){
			return 98;
		}
		else if(country=="mexico"){
			return 52;
		}
		else if(country=="australia"){
			return 61;
		}
		else if(country=="united kingdom"){
			return 44;
		}
		else{
			System.out.println("the pin code doesn't exist");
			return 0;
		}
	}

}