class Bank{
	String ownerName;
	String bankName;
	int branchNo;
	String branchName;
	int ipAddress;
	int pinCode;
	String location;
	int ifscCode;
	String estDate;
	int branchCode;
	
	Bank(){
		System.out.println("running the program");
	}
	Bank(String ownerName,String bankName){
		this.ownerName=ownerName;
		this.bankName=bankName;
	
	}
	Bank(String ownerName,String bankName,int branchNo,String branchName){
		this(ownerName,bankName);
		this.branchNo=branchNo;
		this.branchName=branchName;
	
	}
	Bank(String ownerName,String bankName,int branchNo,String branchName,int ipAddress,int pinCode){
		this(ownerName,bankName,branchNo,branchName);
		this.ipAddress=ipAddress;
		this.pinCode=pinCode;
	}
	Bank(String ownerName,String bankName,int branchNo,String branchName,int ipAddress,int pinCode,String location,int ifscCode,String estDate,int branchCode){
		this(ownerName,bankName,branchNo,branchName,ipAddress,pinCode);
		this.location=location;
		this.ifscCode=ifscCode;
		this.estDate=estDate;
		this.branchCode=branchCode;
	}
	
	
	

}