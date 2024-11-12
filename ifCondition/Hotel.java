class Hotel{
	public static void main(String[] args)
	{
		String ref=item(1000);
		System.out.println("the dish is : "+ref);
		
		
	}
	static String item(double price){
		if(price<100)
		{
			return "veg dish";
		}
		else{
			return "noon veg dish";		
			}
	}
}