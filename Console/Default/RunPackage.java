package Default;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.IOException;
public class RunPackage extends Package {

    public void DefaultPackage()throws IOException, InterruptedException
	{
				
				 Scanner sc = new Scanner(System.in);
				 RunPackage obj = new RunPackage();
				  
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*             Choose your travel package            *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  1. International");
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  2. Domestic" );
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
		
				 selectDestination= sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 
				 if (selectDestination==1)
					 
		{
			
			
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*           Choose your travel destination          *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  1. Indonesia");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  2. Italy");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  3. South Africa");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
			
				 selectPackage=sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 
				 if (selectPackage==1)
			{
				
				 obj.Indonesia();
				
			}
				 else if(selectPackage==2)
			{
				
				 obj.Italy();
				
			}
				 else if(selectPackage==3)
			{
				
				 obj.SouthAfrica();
				
			}
		}
		
		
				 else if (selectDestination==2)
					 
		{
			
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*           Choose your travel destination          *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  1. Cox's Bazar");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  2. Sajek Valley");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  3. Sreemangal");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
			
				 selectPackage=sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 if (selectPackage==1)
			{
				
				 obj.CoxsBazar();
				
			}
				 else if(selectPackage==2)
			{
				
				 obj.SajekValley();
				
			}
				 else if(selectPackage==3)
			{
				
				 obj.Sreemangal();
				
			}
		}
               
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\tEnter a package : ");
				 int Package = sc.nextInt();
				 
				 
		
				 
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