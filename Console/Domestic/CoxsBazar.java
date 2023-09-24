package Domestic;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.IOException;
public class CoxsBazar extends Variable 
{
	
		public void DomesticCoxs()throws IOException, InterruptedException{
			
				 Scanner sc = new Scanner(System.in);
				 
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                Choose your tour ride              *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. Bus   ( options )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. Plane ( 3700 tk )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");	
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
				 
				 travel= sc.nextInt();
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
		

				 if(travel == 1)
		{
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. AC Bus     ( 2500 tk )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. NON-AC Bus (  900 tk )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
				 bus = sc.nextInt();
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
			
			
				 if(bus == 1)
			{
				
				 travelCost=2500;	
				 
			}
				 else if(bus == 2)
			{
				
				travelCost=900;
				
			}
		}
		else if(travel ==2)
		{
			
			travelCost=3700;
			
		}
		
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                  Choose your Hotel                *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. 5 Star ( 12000 tk )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. 3 Star (  8000 tk )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                3. Local  (  5000 tk )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                4. Motel  (  3500 tk )" );
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                5. Loduge (  2000 tk )");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
				 hotel = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 if(hotel == 1)
		{
			
			hotelcost=12000;
			
		}
				 else if(hotel == 2)
			{
				
				 hotelcost=8000;
				
			}
				 else if(hotel == 3)
			{
				
				 hotelcost=5000;
				 
			}
				 else if(hotel == 4)
			{
				
				 hotelcost=3500;
				 
			}
				 else if(hotel == 5)
			{
				
				 hotelcost+=2000;
				 
			}
			
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*            Popular places in Cox's Bazar          *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 String array[]=new String []{" Cox's Bazar Sea Beach "," Himchhori Waterfall"," Saint Martin"," Marin Drive"};
				 
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
				
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                "+array[0]); 
				 
			}
				 else if(visit==2)
			{
				
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                "+array[1]);  
				 
			}
				 else if(visit==3)
			{
				
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                "+array[2]); 
				 
			}
				 else if(visit==4)
			{	
		
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                "+array[3]); 	
				 
			}
			
			}
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");		
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t        You Want to visit " +place+ " places" );
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                Choose your tour ride              *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. Bus      ( 2000 tk)"); 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. Vehicles ( options )"); 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                3. Boat     ( options )"); 
				
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
			
				 Intravel = sc.nextInt();
				  System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 if(Intravel== 1)
		    {	
		
				cost=2000;
				
			}
				 else if(Intravel == 2)
			{
				
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. Car      ( 5000 tk )");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. MicroBus ( 7000 tk )");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
				Vehicles = sc.nextInt();
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 
				 if(Vehicles ==1)
				{
					
					cost=5000;
					
				}
				 else if(Vehicles ==2)
				{
					
					cost=8000;
					
				}	
				}
				 else if(Intravel == 3)
			{
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1.VIP Cabin	( 2500 tk)");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2.Normal 	( 1000 tk)");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
				 boat = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				
				 if(boat== 1)
				{
					
				 cost=2500;
				 
				}
				 else if(boat== 2)
				{
					
				 cost=1000;
				 
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
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Tour  Ride       : "+travelCost+" Tk");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Hotel Cost       : "+hotelcost+" Tk");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Inside Tour Ride : "+cost+" Tk");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                Total cost       : "+((travelCost+hotelcost+cost)*(person*days))+" Tk");
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