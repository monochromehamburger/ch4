class MultAdd{
	public static void main(String args[]){
		expSum(2);
		System.out.println("𓇼 ⋆.˚ 𓆉 𓆝 𓆡⋆.˚ 𓇼");
		System.out.println(multadd(Math.log(10),1,Math.log(20)));
	}
	public static double multadd(double a, double b, double c){
		return a*b+c;
	}
	public static void expSum(double a){
		double output=multadd(a,Math.exp(-1*a),Math.sqrt(1-Math.exp(-1*a)));
		System.out.println(output);
	}
}                                                                                           
                        
