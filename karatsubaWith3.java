import java.util.Scanner;

public class karatsubaWith3 {

	private int answer = 0;
	
	public static double mult(double num1, double num2){
		return num1*num2;
	}

	
	private static String karatans = "1";
	private static String ac = "";
	private static String ad = "";
	private static String bc = "";
	private static String bd = "";
	
	private static String aplusbcplusd = "";
	
	public static String karatsuba(String num1, String num2){
		
		if(num1.length()==1){
			
			//only for base operation : only one digit
			karatans = "" + mult(Double.parseDouble(num1),Double.parseDouble(num2));
			
			//answer for ac,ad,bc,bd
			return karatans; 
			
			
			
		}
		
		String a = num1.substring(0,((num1.length())/2));
		String b = num1.substring(num1.length()/2,num1.length());
		String c = num2.substring(0,(num2.length())/2);
		String d = num2.substring(num2.length()/2,num2.length());
		
		int aplusbAns = (Integer.parseInt(a) + Integer.parseInt(b));
		String aplusb = "" + aplusbAns;
		int cplusdAns = (Integer.parseInt(c) + Integer.parseInt(d));
		String cplusd = "" + cplusdAns;
		
		
		
		//Assignment for recursion and capture of result
		
		//System.out.println(ac);
		
		ac = karatsuba(a,c);
		String tempac = ac;
		
		bd = karatsuba(b,d);
		String tempbd = bd;
		
		aplusbcplusd = karatsuba(aplusb,cplusd);
		String tempaplusbcplusd = aplusbcplusd;
		
		System.out.println(tempac);
		System.out.println(tempbd);
		System.out.println(tempaplusbcplusd);
		
		System.out.println("---------------------------");
		
		
		//Double might not be long enough for huge numbers
		
		double abc = (Math.pow(10,num1.length())*Double.parseDouble(tempac) + Math.pow(10, num1.length()/2) * (Double.parseDouble(tempaplusbcplusd)-Double.parseDouble(tempbd) - Double.parseDouble(tempac)) + Double.parseDouble(tempbd));
		
		return ""+abc;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		String num2 = scan.nextLine();
		
		System.out.println(karatsuba(num1,num2));
		
		System.out.println("-------------------------");
		
		
		
		
		
		

	}

}
