package org.conditionalstatement;

public class nestedIf1 {
	
	public static void main (String[]args) {
		
		int no =14;
			

		if (no<=5) {
			
			if (no%2==0) { //even
				
			  if (no==2) {
				  
				  System.out.println(no);
				  
			  }
			  
			  else {
				  
				  System.out.println("print:"+no);
				  
			  }
			  
			  }
			
			
			else {
				
				if(no==1) {
					
					System.out.println(no);
					
				}
				
				else if (no==3) {
					System.out.println(no);
					
				}
				
				else {
					System.out.println(no);
				}
			}
				  
			
			}
		
		else {
			
			if (no%2==0) {
				
				if(no==14) {
					
					System.out.println("Dinu :"+no);
					
				}
				
				
				else {
					System.out.println("else :"+no);
				}
					
			}
		}
			
			
		}
			
		


}
