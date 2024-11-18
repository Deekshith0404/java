class NewColor{
	public static void main(String[] args){
		String color1="blue";
		String color2="red";
		String color3="yellow";
		String color4="black";
		String color5="orange";
		String color6="maroon";
		String color7="green";
		String color8="peach";
		String color9="sky blue";
		String color10="gray";
		
		String[] colors={color1,color2,color3,color4,color5,color6,color7,color8,color9,color10};
		for(int i=9;i>=0;i--){
			System.out.println("color "+i+" : "+colors[i]);
		}
	}
}