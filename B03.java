import java.util.*;
    class Q03{
             

	     	int days;
			int seconds;
				int count;

					void input(){
						  Scanner A = new Scanner(System.in);
						  	  System.out.println("days.");
							            this.days = A.nextInt(); 
								    	  this.seconds = this.days*60*60*24;
									  	  output();
										  	  }

											  	void output(){
													  System.out.println(
													  	  "days is "+seconds+" seconds ");
														  	  
															  	  if(this.seconds>1000000){
																  	    this.count = this.seconds/1000000;
																	    	    System.out.print(
																		    	    "100 thousand seconds is "+count);
																			    	     }
																				     	   }

																					   	  public static void main(String[] args){
																						  	    new Q03().input();
																							    	    }
																								    	}
