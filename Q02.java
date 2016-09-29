
import java.util.*;
    
         class Q02 {
	         double f_deg;
		 	double c_deg;
			        double ran;
				        String what;
						 void input(){
						 	   Scanner A = new Scanner(System.in);
							   	   System.out.println("degree.");
								   	   this.ran = A.nextDouble();

									   	   System.out.println(" c / f");
										   	   this.what = A.next();
											   	   print();
												   	   }

													   	   void print(){
														   	   if(this.what.equals("c")){
															   	   this.c_deg = this.ran;
																   	   this.f_deg = (this.c_deg*1.8)+32;
																	   	   System.out.println("output degree"+f_deg+" );
																		   	   }
																			   	   else{
																				   	   this.f_deg = this.ran;
																					   	   this.c_deg = (this.f_deg-32)/1.8;
																						   	   System.out.println("output degree"+c_deg+" );
																							   	   }
																								   	   } 
																									   	   public static void main(String[] args){
																										   	    new Q02().input();
																											    	    }
																												    	  } 
