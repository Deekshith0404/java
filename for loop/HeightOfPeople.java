class HeightOfPeople{
	public static void main(String[] args){
	
	double raman=5.5;
	double suman=5.7;
	double tirumal=6;
	double sumana=5.1;
	double shanu=4.9;
	double rajan=5.3;
	double tharun=6.3;
	double sanjana=5;
	double sum=5.1;
	
	double[] nameOf={raman,suman,tirumal,sumana,shanu,rajan,tharun,sanjana,sum};
	
	for(int i=0;i<9;i++){
		if(nameOf[i]>5.9){
			System.out.println("the height that are geater than 5.9 are"+nameOf[i]);
		}
		if(nameOf[i]<5.3){
			System.out.println("the heights less than 5.3 are : "+nameOf[i]);
		}
	
	
	}
}
}