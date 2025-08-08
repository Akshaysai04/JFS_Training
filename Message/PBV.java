class PBV{
	public static void main(String args[]){
	int i=20;
	boolean b=true;
	double d=120.00;
	char ch='M';
	passByValue(i,d,b,ch);
	System.out.println("in Main() "+i+" "+d+" "+b+" "+ch);
}
static void passByValue(int age,double price,boolean pass,char gender){
		age++;
		price+=100;
		pass=true;
		gender='F';
        System.out.println("in PBV() "+age+" "+price+" "+pass+" "+gender);
}
}