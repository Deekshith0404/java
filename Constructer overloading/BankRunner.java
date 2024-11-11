class BankRunner{
	public static void main(String[] args){
		Bank bank=new Bank();
		System.out.println("-----------------------------------");
		
		Bank bank1=new Bank("suman","canara");
		System.out.println("owner name is:"+bank1.ownerName);
		System.out.println("bank name is:"+bank1.bankName);
		System.out.println("-----------------------------------");

		Bank bank2=new Bank("suman","canara",123,"eastern bank");
		System.out.println("owner name is:"+bank2.ownerName);
		System.out.println("bank name is:"+bank2.bankName);
		System.out.println("bank branchNo is:"+bank2.branchNo);
		System.out.println("bank branchName is:"+bank2.branchName);
		System.out.println("-----------------------------------");
		
		Bank bank3=new Bank("suman","canara",123,"Eastern bank",184658,571104);
		System.out.println("owner name is:"+bank3.ownerName);
		System.out.println("bank name is:"+bank3.bankName);
		System.out.println("bank branchNo is:"+bank3.branchNo);
		System.out.println("bank branchName is:"+bank3.branchName);
		System.out.println("bank ipAddress is:"+bank3.ipAddress);
		System.out.println("bank pinCode is:"+bank3.pinCode);
		System.out.println("-----------------------------------");
		
		Bank bank4=new Bank("suman","canara",123,"Eastern bank",184658,571104,"madikeri",859674,"45-78-1965",9856);
		System.out.println("owner name is:"+bank4.ownerName);
		System.out.println("bank name is:"+bank4.bankName);
		System.out.println("bank branchNo is:"+bank4.branchNo);
		System.out.println("bank branchName is:"+bank4.branchName);
		System.out.println("bank ipAddress is:"+bank4.ipAddress);
		System.out.println("bank pinCode is:"+bank4.pinCode);
		System.out.println("bank location is:"+bank4.location);
		System.out.println("bank ifscCode is:"+bank4.ifscCode);
		System.out.println("bank estDate is:"+bank4.estDate);
		System.out.println("bank branchCode is:"+bank4.branchCode);
		System.out.println("-----------------------------------");
		

		
	}

}