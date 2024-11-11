class Shop{
	String name;
	String ownername;
	int landlineNum;
	String estDate;
	Shop(){
		System.out.println("running the first statement");
		
	}
	Shop(String name){
		this.name=name;
		
	}
	Shop(String name,String ownername){
		this.name=name;
		this.ownername=ownername;
		
	}
	Shop(String name,String ownername,int landlineNum){
		this(name,ownername);
		this.landlineNum=landlineNum;
		
	}
	Shop(String name,String ownername,int landlineNum,String estDate){
		this(name,ownername,landlineNum);
		this.estDate=estDate;
		
	}
}