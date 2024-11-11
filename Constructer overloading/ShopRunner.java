class ShopRunner{
	public static void main(String[] args){
		Shop shop=new Shop();
		System.out.println("---------------------------------------");
		Shop shop1=new Shop("lakshmi sweets");
		System.out.println("the name of the shop is :"+shop1.name);
		System.out.println("---------------------------------------");
		
		Shop shop2=new Shop("lakshmi sweets","lakshman");
		System.out.println("the name of the shop is :"+shop2.name);		
		System.out.println("the  owner name of the shop is :"+shop2.ownername);	
		System.out.println("-----------------------------------------");

		Shop shop3=new Shop("lakshmi sweets","lakshman",100123);
		System.out.println("the name of the shop is :"+shop3.name);		
		System.out.println("the  owner name of the shop is :"+shop3.ownername);
		System.out.println("the landline number is:"+shop3.ownername);	
		System.out.println("-----------------------------------------");
		
		Shop shop4=new Shop("lakshmi sweets","lakshman",100123,"12-16-1950");
		System.out.println("the name of the shop is :"+shop4.name);		
		System.out.println("the  owner name of the shop is :"+shop4.ownername);
		System.out.println("the landline number is:"+shop3.ownername);	
		System.out.println("the establiched date is :"+shop4.estDate);
		System.out.println("-----------------------------------------");
		
		
		
	}
	
}