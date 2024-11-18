class NewSoap{
	public static void main(String args[]){
		int patanjalli=70;
		int lux=45;
		int santoor=40;
		int medimix=30;
		int lifeboy=55;
		
		int[] soaps={patanjalli,lux,santoor,medimix,lifeboy};
		
		for(int i=0;i<5;i++){
			if(soaps[i]<50){
				soaps[i]=soaps[i]+5;
				System.out.println("the prize after updation :"+soaps[i]);
			}
		}
	}
}