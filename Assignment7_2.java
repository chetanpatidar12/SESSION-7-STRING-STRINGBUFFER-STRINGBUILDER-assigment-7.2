package session7;

import java.util.Scanner;

public class Assignment7_2 {

	public static void main(String[] args) {
		String string, sub;
		int i, c;
		boolean f=false;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		string= in.nextLine();
		
		System.out.println("Enter sub string to be find: ");
		sub= in.nextLine();
		
		for( c = 0 ; c < string.length() ; c++ )
	      {
	         for( i = 1 ; i <= string.length() - c ; i++ )
	         {
	        	 String ssub = string.substring(c, c+i);
	             //System.out.println(ssub);
	        	 
	             //System.out.println(sub.equals(ssub));
	             if(sub.equals(ssub)){
	            	 System.out.println("Sub string found");
	            	 f=true;
	            	 return;
	             }
	             
	           
	         }
	      }
		
		
		 if(f==false){
			 System.out.println("Sub string not found!!");				 
		 }
		 

	}

}
