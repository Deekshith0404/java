class HotelManagement{
	public static void main(String[] args){
		String ref=order(50);
		System.out.println("the item is : "+ref);
	}
	static String order(int price){
		if(price==30){
			return "idli";
		}
		else if(price==50){
			return "palav";
		}
		else if(price==100)
		{
			return "biriyani";
		}
		else{
			return"enter the amount currectly";
		}
	}
	
}