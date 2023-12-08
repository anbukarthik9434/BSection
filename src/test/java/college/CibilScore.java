package college;

import java.util.Scanner;

public class CibilScore {
public static void  main( String []args) {
	Scanner sc= new Scanner(System.in) ;
	System.out.println("Enter the ciblScore");
	
	int cibilScore=sc.nextInt();
	
	if(cibilScore<700) {
		System.out.println("Not eligible for loan:"+cibilScore);
	}
	else if (cibilScore>=700 && cibilScore<=650) {
		System.out.println("Eligible for loan:"+cibilScore);
	}
	
	else if(cibilScore>650 &&cibilScore<=1000){
		System.out.println("Super score:"+cibilScore);
	}
	else {
		System.out.println("Not matched:"+cibilScore);
		
	}
			
		
}
}