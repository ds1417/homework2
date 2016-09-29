mport java.util.*;
   

        class Q04{


	         int kor;
		 	 int eng;
			 	 int math;
				 	 int sum;
					 	 double avg;

						        void input(){
							          
								  	  Scanner A = new Scanner(System.in);
									  	  System.out.println("kor score");
										  	  this.kor= A.nextInt();

											  	  System.out.println("eng score");
												  	  this.eng = A.nextInt();

													            System.out.println("mate score");
														    	  this.math = A.nextInt();

															  	  output();

																  	  }
																	  	
																		        void output(){
																				  this.sum = this.kor+this.eng+this.math;
																				  	  this.avg = this.sum/3.0;
																					  	  System.out.println(
																						  	  "total is "+sum+" avg is "
																							  	  +avg+" ");

																								  	  if(kor>90){
																									  	   System.out.println("kor good \n");
																										   	   }
																											   	  if(eng>90){
																												  	   System.out.println("eng nice \n");
																													   	   }
																														             if(math>90){
																															     	   System.out.println("mate good\n");
																																   	   }
																																	   	   }

																																		              public static void main(String[] args){
																																			      	     new Q04().input();
																																				     	     }
																																					     	   }  
