class PoliceStation{
	String name;
	String location;
	String subInspecterName;
	String constableName;
	String inspecterName;
	String headConstableName;
	
	
	PoliceStation(){
		System.out.println("running the program");
	}
	PoliceStation(String name){
		this.name=name;
		
	}
	PoliceStation(String name,String location){
		this.name=name;
		this.location=location;
	}
	PoliceStation(String name,String location,String subInspecterName){
		this(name,location);
		this.subInspecterName=subInspecterName;
		
	}
	PoliceStation(String name,String location,String subInspecterName,String constableName){
		this(name,location,subInspecterName);
		this.constableName=constableName;
		
	}
	PoliceStation(String name,String location,String subInspecterName,String constableName,String inspecterName){
		this(name,location,subInspecterName,constableName);
		this.inspecterName=inspecterName;
		
	}
	PoliceStation(String name,String location,String subInspecterName, String constableName,String inspecterName,String headConstableName){
		this(name,location,subInspecterName,constableName);
		this.headConstableName=headConstableName;
		
	}
	
	
}
