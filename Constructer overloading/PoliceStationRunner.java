class PoliceStationRunner{
	public static void main(String[] args){
		PoliceStation policestation=new PoliceStation();
		System.out.println("----------------------------");
		
		PoliceStation policestation1=new PoliceStation("kalasipalya station");
		System.out.println("the station name :"+policestation1.name);
		System.out.println("----------------------------");
		
		PoliceStation policestation2=new PoliceStation("kalasipalya station","madya");
		System.out.println("the station name :"+policestation2.name);
		System.out.println("the location of the station :"+policestation2.location);
		System.out.println("----------------------------");
		
		PoliceStation policestation3=new PoliceStation("kalasipalya station","madya","soma");
		System.out.println("the station name :"+policestation3.name);
		System.out.println("the location of the station :"+policestation3.location);
		System.out.println("the location of the station :"+policestation3.subInspecterName);
		System.out.println("----------------------------");
		
		
		PoliceStation policestation4=new PoliceStation("kalasipalya station","madya","soma","bhima");
		System.out.println("the station name :"+policestation4.name);
		System.out.println("the location of the station :"+policestation4.location);
		System.out.println("the location of the station :"+policestation4.subInspecterName);
		System.out.println("the location of the station :"+policestation4.constableName);
		System.out.println("----------------------------");
		
		
		PoliceStation policestation5=new PoliceStation("kalasipalya station","madya","soma","bhima","tharun");
		System.out.println("the station name :"+policestation5.name);
		System.out.println("the location of the station :"+policestation5.location);
		System.out.println("the location of the station :"+policestation5.subInspecterName);
		System.out.println("the location of the station :"+policestation5.constableName);
		System.out.println("the location of the station :"+policestation5.inspecterName);
		System.out.println("----------------------------");
		
		
		PoliceStation policestation6=new PoliceStation("kalasipalya station","madya","soma","bhima","tharun","abhi");
		System.out.println("the station name :"+policestation6.name);
		System.out.println("the location of the station :"+policestation6.location);
		System.out.println("the location of the station :"+policestation6.subInspecterName);
		System.out.println("the location of the station :"+policestation6.constableName);
		System.out.println("the location of the station :"+policestation6.inspecterName);
		System.out.println("the location of the station :"+policestation6.headConstableName);
	
		
		System.out.println("----------------------------");
		
		
	}
}