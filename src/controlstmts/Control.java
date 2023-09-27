package controlstmts;
import java.util.Scanner;
public class Control {

	public static void main(String[] args) {
		String name="Dante Kadagi", rollCall="C026-01-0920/2022",unitCodeD,unitCodeS,unitCodeA,unitCodeSt;
		int semester=2, scoreD,scoreS, scoreA, scoreSt  ;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the unit unitCode:");
		unitCodeD=in.nextLine();
		unitCodeA=in.nextLine();
		unitCodeS=in.nextLine();
		unitCodeSt=in.nextLine();
		System.out.println("Enter scores");
		scoreD=in.nextInt();
		scoreA=in.nextInt();
		scoreS=in.nextInt();
		scoreSt=in.nextInt();
		int total=scoreD+scoreA+scoreS+scoreSt;
		double avg=total/4;
		
		String grade="0";
		
		if(avg>=70 && avg<=100) {
			grade="A";
		}
        else if(avg>=60 && avg<=70) {
        	grade="B";
		}
       else if(avg>=50 && avg<=60) {
    	   grade="C";
		}
       else if(avg>=40 && avg<=50) {
    	   grade="D";
		}
       else  {
    	   grade="F";
		}
		
		
		
		
		System.out.println( " \t\t\t\t\tDepertment of Computer Science");
		System.out.println("   \t\t                              End of Semester Results");
		System.out.println("------------------------------------------------------------------------------------------------------"                );
		System.out.println("|Name:-"+"\t"+name     +" \t\t"               + "|Roll_No:"+rollCall                                             );
		System.out.println("______________________________________________________________________________________________________"                );
		System.out.println("|Unit Code"      +" \t\t\t"                +"|Unit Name:"  +" \t\t\t"       + "Score"                                                );
		System.out.println("------------------------------------------------------------------------------------------------------"               );
		System.out.println("|"+unitCodeD     +" \t\t\t"             +"|Database"           +" \t\t\t"             +"|" +scoreD                                           ); 
		System.out.println("|"+unitCodeS        +" \t\t\t"                          +"|Systems:"  +" \t\t\t"         +"|" +scoreS                                                          );
		System.out.println("|"  +unitCodeA      +" \t\t\t"                         +"|Algorithim:" +" \t\t\t"        +"|" +scoreA                                                           );
		System.out.println("|"   +unitCodeSt         +" \t\t\t"                         +"|Statistics:"  +" \t\t\t"     +"|" +scoreSt                                                           );
		System.out.println("-------------------------------------------------------------------------------------------------------"               );
		System.out.println("|Total"     +"\t\t\t\t\t\t\t\t"                                                         +"|" +total );
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("|Average"    +"\t\t\t\t\t\t\t"                                                          +"|" +avg );
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("|Grade" +"\t\t\t\t\t\t\t\t"+"|"+grade);
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println(   "\t\t\t\t\t\t Recommendation"+"\t|");
		System.out.println("Grading Criteria    \t\t\t   overall Grade(A-D)  \t\t   Recommend Pass"  );
		System.out.println("70-100"+"\t\t" +"A");
		System.out.println("60-70"  +"\t\t" +"B"          );
		System.out.println("50-60"+"\t\t" +"C");
		System.out.println("40-50"+"\t\t" +"D");
		System.out.println("Below 40"+"\t" +"F");
		
	}

}
