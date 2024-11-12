class Theater{
	public static void main(String[] args){
		String ref=counter(200);
		System.out.println(ref);
	}
	static String counter(int price){
		if(price==100){
			return "Gandhi class ticket";
		}
		else if(price==150){
			return "middle class ticket";
			
		}
		else if(price==200){
			return "balcony ticket";
		}
		else{
			return "please give proper money ";
		}
	}
}