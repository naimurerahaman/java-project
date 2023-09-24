package International;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.IOException;
public class Greece extends SouthAfrica
{
		public void InternationalGreece()throws IOException, InterruptedException{
				 Scanner sc = new Scanner(System.in);
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                Choose your tour ride              *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
			    
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. First Class    ( 750 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. Business Class ( 550 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                3. Domestic Class ( 450 $ )");	
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
			
				 plane = sc.nextInt();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 if(plane == 1)
		{
			
				 travelCost=750;	
				 
		}
				 else if(plane == 2)
		{
			
				 travelCost=550;
				 
		}
				 else if(plane == 3)
		{
			
				 travelCost=450;
				 
		}
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                  Choose your Hotel                *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. 5 Star ( 220$  )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. 3 Star ( 120$  )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                3. Local  (  80$  )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                4. Motel  (  60$  )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                5. Loduge (  50$ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
		
				 hotel = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 if(hotel == 1)
		{
			
				 hotelcost=220+cost;
				 
		}
				 else if(hotel == 2)
			{
				
				 hotelcost=120+cost;
				 
			}
				 else if(hotel == 3)
			{
				
				 hotelcost=80+cost;
				 
			}
				 else if(hotel == 4)
			{
				
				 hotelcost=60+cost;
				 
			}
				 else if(hotel == 5)
			{
				
				 hotelcost=50+cost;
				 
			}
			    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*            Popular places in Greece               *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 String array[]=new String []{" Acropolis of Athens"," Meteora"," Temple of Olympian Zeus"," Ancient Agora of Athens"," Balos Beach"};
				 
				 for(int i=0; i<=array.length-1; i++)
		{
			
			    System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+(i+1)+"."+array[i]);
			
		}
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t          How many place you want to visit : " );
				 place= sc.nextInt();
				 System.out.println(" " );		
				 for(int j=0;j<=place-1;j++)
			{
				  System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
				 visit = sc.nextInt();
				 if(visit==1)
				{
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+array[0]);  
				}
				 else if(visit==2)
				{
					
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+array[1]);
				 
				}
				 else if(visit==3)
				{
					
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+array[2]); 
				 
				}
				 else if(visit==4)
				{	
			
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+ array[3]); 	
				 
				}
				 else if(visit==5)
				{
					
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+ array[4]); 	
				 
				}
			}
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");		
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t        You Want to visit " +place+ " places" );
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				  System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                Choose your tour ride              *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. Bus         ( options )"); 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. Train       ( options )"); 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                3. Private car ( options )"); 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");	
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
			
				
				 Intravel = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");		
				 if(Intravel == 1)
			{	
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. AC Bus     ( 20 $  )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. NON-AC Bus ( 10 $  )");
			
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");	
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
			
				 bus = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");		
				 if(bus == 1)
			{
				
				 cost=20;
				
			}
				 else if(bus == 2)
			{
				
				 cost=10;
				
			}
			}
				 if(Intravel == 2)
			{
                
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. Ac Sleeping Couch  ( 75 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. Ac Seating Couch   ( 52 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                3. AC Train           ( 44 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                4. NON-AC Train       ( 25 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                5. Standby Ticket     ( 10 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");	
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
			
			
				 train = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");	
			
				 if(train== 1)
			{
				
				 cost=75;
				 
			}
				 if(train== 2)
			{
				
				 cost=52;
				 
			}
				 if(train== 3)
			{
				
				 cost=44;
				 
			}
				 if(train== 4)
			{
				
				 cost=25;
				 
			}
				 if(train== 5)
			{
				
				 cost=10;
				 
			}
			}		
		
				 if(Intravel == 3)
	{
		         
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. Car		( 500 $ )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. MicroBus	( 700 $ )");
				
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");	
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
				 Vehicles = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 if(Vehicles ==1)
				{
					
				 cost=500;
					
				}
				 else if(Vehicles ==2)
				{
					
				 cost=800;
					
				}	
    }
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                    Tour Details                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                Person           : ");
				 
				 person = sc.nextInt();
				 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                Days             : ");
				 days = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Tour  Ride       : "+travelCost+" $");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Hotel Cost       : "+hotelcost+" $");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Inside Tour Ride : "+cost+" $");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Total cost       : "+((travelCost+hotelcost+cost)*(person*days))+" $");
				 System.out.println("\n");
				 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter Any number for Payment options : ");
				 
				 int Enter = sc.nextInt();
				 
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                       Pay here                    *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 String cardNumber = "";
				 String validOn = "";
				 String cvvCode = "";

				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Card number pattern : 0000-0000-0000-0000");
				 // Card Number
				 while (true) 
				 {
					 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t     Card Number : ");
				 cardNumber = sc.next();

				 if (cardNumber.length() == 19)
					 {
						 
				 if (cardNumber.charAt(4) == '-' && cardNumber.charAt(9) == '-' && cardNumber.charAt(14) == '-') 
				 {
    break;
                }
				
				else 
				{
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Invalid input!");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Card number pattern : 0000-0000-0000-0000");
                }
            } 
			
				 else 
			{
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Invalid input!");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Card number pattern : 0000-0000-0000-0000");
            }
        }

				 // Valid On
				 while (true) 
				 {
					 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t     Valid On : ");
				 validOn = sc.next();

				 if (validOn.length() == 7) 
				 {

				 if ((validOn.charAt(2) == '/')
                        && (Character.isDigit(validOn.charAt(0)) && Character.isDigit(validOn.charAt(1))
                                && Character.isDigit(validOn.charAt(3)) && Character.isDigit(validOn.charAt(4))
                                && Character.isDigit(validOn.charAt(5)) && Character.isDigit(validOn.charAt(6)))) 
								{
									
    break;
                } 
				 else
			{
						
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Invalid input!");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Valid On pattern : mm/yyyy");
					
            }
			
            } 
				 else 
			{
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Invalid input!");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Valid On pattern : mm/yyyy");
				 
            }
        }

				 // CVV Code
				 while (true) 
				 {
				 Console console = System.console();
				 char[] cvvCodeArr = console.readPassword("\t\t\t\t\t\t\t\t\t\t\t     CVV Code : ");
				 cvvCode = String.valueOf(cvvCodeArr);

				 if (cvvCode.length() == 3)
					 
					 {
						 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  Your Payment is Done");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t ____________________________________________________ ");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                      Thank You                     |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|____________________________________________________|");
				 
    break;
	
            
			}
			
			else 
			{
				
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Invalid input!");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t     Valid On should include only 3 characters");
				
            }
        }
	
	}	
}
