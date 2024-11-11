class River {
	String name;
	static String State="karnataka";
	static String country="India";
	static String continent="Asia";
	static String planet="Earth";
	boolean irrigation=true;
	boolean boating=true;
	String waterColour="Blue";
	boolean hydroPower=true;
	boolean isFreshWater=true;
	String end;
	boolean floods;
	boolean enDangeredSpecies;
	boolean navigable;
	boolean dam;
	double temperature;
	double annualRainfallInmm;
	boolean mythology;
	int dams;
	String famousCities;
	double lengthInKMs;
	double depth;
	double width;
	double discharge;
	double basinSize;
	double fishPopulationInCrores;
	String pollutionlevel;
	String majorIndustries;
	boolean aquaticLife;
	



	River(){
		
		
	}
	River(String name,int dams,String famousCities,double lengthInKMs,double depth,double width,double discharge,double basinSize,double fishPopulationInCrores){
		this.name=name;
		this.dams=dams;
		this.famousCities=famousCities;
		this.lengthInKMs=lengthInKMs;
		this.depth=depth;
		this.width=width;
		this.discharge=discharge;
		this.basinSize=basinSize;
		this.fishPopulationInCrores=fishPopulationInCrores;		
	}
	
	//printing statements
	public void print(){
		System.out.println("Name :"+this.name);
		System.out.println("Country: "+this.country);
		System.out.println("Contient: "+this.continent);
		System.out.println("Planet: "+this.planet);
		System.out.println("Is it used for irrigation: "+this.irrigation);
		System.out.println("IBoating is possible: "+this.boating);
		System.out.println("Colour of water: "+this.waterColour);
		System.out.println("Basin Size: "+this.basinSize);
		System.out.println("Annual Rainfall in MM"+this.annualRainfallInmm);
		System.out.println("Is Aquatic life"+this.aquaticLife);
		System.out.println("are dam present on the river"+this.dam);
		System.out.println("How many dams are there: "+this.dams);
		System.out.println("Depth: "+this.depth);
		System.out.println("Discharge: "+this.discharge);
		System.out.println("Any danger Species: "+this.enDangeredSpecies);
		System.out.println("End: "+this.end);
		System.out.println("Famous Cities: "+this.famousCities);
		System.out.println("Population of fishes in crores: "+this.fishPopulationInCrores);
		System.out.println("Floods: "+this.floods);
		System.out.println("Hydropower: "+this.hydroPower);
		System.out.println("Fresh water: "+this.isFreshWater);
		System.out.println("Length in KMs: "+this.lengthInKMs);
		System.out.println("Major industries: "+this.majorIndustries);
		System.out.println("Mythology: "+this.mythology);
		System.out.println("Navigable: "+this.navigable);
		System.out.println("Pollution Level: "+this.pollutionlevel);
		System.out.println("Temperature: "+this.temperature);
		System.out.println("Water Colour: "+this.waterColour);
		System.out.println("Width: "+this.width);
		
	}
	
	
	
}