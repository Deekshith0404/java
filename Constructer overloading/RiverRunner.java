class RiverRunner{
	public static void main(String[] args){
		
		
		River river=new River();
		river.floods=true;
		river.enDangeredSpecies=true;
		river.navigable=true;
		river.dam=true;
		river.mythology=false;
		river.temperature=23.92;
		river.annualRainfallInmm=1248;
		river.pollutionlevel="Moderate";
		river.lengthInKMs=300;
		river.aquaticLife=true;
		river.print();
		River river1=new River("kaveri",5,"mysore",150,500,46,50,5000,1);
		river1.print();
		System.out.println("----------------------------------------------------------------");
		River river2=new River("ganga",5,"kodagu",200,750,320,150,10000,5);
		river2.print();
		System.out.println("-----------------------------------------------------------------");
		River river3=new River("madure",5,"bangalore",250,5000,460,350,52000,3 );
		river3.print();
	}
}