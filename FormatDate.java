class FormatDate{
	public static void main(String args[]){
		PrintAmerican("Sunday", "March", 4, 2019);
		PrintEuropean("Sunday", "March", 4, 2019);
	}
	public static void PrintAmerican(String day, String month, int date, int year){
		System.out.println("American: "+day+", "+month+" "+date+", "+year);
	}
	public static void PrintEuropean(String day, String month, int date, int year){
		System.out.println("European: "+day+" "+date+" "+month+" "+year);
	}
}
