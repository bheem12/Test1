package test;
import java.util.*;

public  class MarsExploration {
public void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length ");
	int n=sc.nextInt();
	System.out.println("enter the string");
	String s=sc.next();
	for (int i = 0;s.length()<n;i++) {
		if((charAt(i)!='S')&&(charAt(i)!='O')) {
			System.out.println(s.replace(charAt(i), 'S'));
			
		}
			
		}
		
		
	}
	
	
	





	private char charAt(int i) {
	// TODO Auto-generated method stub
	return 0;
}



	public static void main(String[] args) {
		MarsExploration m=new MarsExploration();
		m.input();
   m.charAt(i);
   
}
}
