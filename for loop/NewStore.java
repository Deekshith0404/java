class NewStore{
	public static void main(String[] args){
		int maida=70;
		int soap=40;
		int toothpaste=55;
		int batani=66;
		int rave=150;
		int washingpowder=540;
		int puliogarepacket=15;
		int color=40;
		int agarbathi=10;
		int matchbox=20;
		
		
		int[] grocerys={maida,soap,toothpaste,batani,rave,washingpowder,puliogarepacket	,color,agarbathi,matchbox};
		
		for(int i=0;i<10;i++){
			if(grocerys[i]<50){
				System.out.println("grocerys less than 50 are:"+grocerys[i]);
			}
		}
	}
}