class MobilePhone{
	
	public static void main(String[] agrs){
		int jio=10000;
		int vivo=27000;
		int redmi=25000;
		int realme=43000;
		int onePlus=66000;
		int iPhone=100000;
		int iqoo=40000;
		int redmagic=80000;
		int oppo=10600;
		int nokia=20000;
		
		int[] prices={jio,vivo,realme,redmi,onePlus,iPhone,iqoo,redmagic,oppo,nokia};
		
		for(int i=0;i<10;i++){
			if(prices[i]>=25000){
				prices[i]=prices[i]+500;
				System.out.println("the prize after update : "+prices[i]);
			}
		}
	}
	
}