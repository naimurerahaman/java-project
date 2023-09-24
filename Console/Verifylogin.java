import Domestic.*;
import Default.*;
import International.*;
import java.io.Console;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;




  public class Verifylogin extends Back {
  private static Scanner x;

  public void CallVerifylogin(){

                 String username;
                 Console console = System.console();
                 Scanner sc = new Scanner(System.in);
		         System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Username : ");  
		         username = sc.next();
                 char[] passwordArray=console.readPassword("\t\t\t\t\t\t\t\t\t\t\t                 Password : ");
                 String filepath="users.txt";

                 Verifylogin(username,passwordArray,filepath);
				 
}

  public static void Verifylogin(String username,char[] passwordArray,String filepath)
  
{

                 boolean found =false;
                 String tempUsername="";
                 String tempPassword="";

                 try
				 
            {

                 x=new Scanner (new File(filepath));
                 x.useDelimiter("[,\n]");

                 while(x.hasNext() && !found)
					 
              {

                 tempUsername =x.next();
                 tempPassword =x.next();

                 if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(new String(passwordArray).trim()))
					 
            {

                 found = true;

            }
			
              }
                 x.close();
                 
	   
	            if(found==true) 
					
	   {
	   
		         RunPackage obj3= new RunPackage();
		         Germany obj2= new Germany();
		         Rangamati obj1= new Rangamati();
				 
				 
	   
	             Scanner sc = new Scanner(System.in);
	             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*             Choose your travel package            *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
                 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                1. Default Package ");
                 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                2. Self Choosen Package");
				 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
		         int Package = sc.nextInt();
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
		        if(Package == 1)
					
		 { 
			     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			     System.out.println("\n");
			     obj3.DefaultPackage();
		 }

		         else if(Package == 2)
					 
		{
			
			
		         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*           Choose your travel destination          *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************\n");
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  1. International");
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  2. Domestic" );
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
		         int destination = sc.nextInt();
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 
				 
		         if(destination== 1)
		{
			
		         String array[]= new String[]{" Indonesia"," Italy", " South Africa"," Greece"," Germany"}; 
				 
				 
		         for(int i=0; i<=array.length-1;  i++)
			{ 
		
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+(i+1) + "."+array[i]);
				
			}
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");	
		         int chooseCountry = sc.nextInt();
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
			
		
		         if(chooseCountry==1)
		{
			
		         obj2.InternationalIndonesia();
		
		}
		
		         else if(chooseCountry==2)
		{
			
		         obj2.InternationalItaly();	
		
		}
		
		         else if(chooseCountry==3)
		{
			
		         obj2.InternationalSouthAfrica();
		
		}
		
		         else if(chooseCountry==4)
			
		{
			
		         obj2.InternationalGreece();
		
		}
		
		         else if(chooseCountry == 5)
			
		{
		         obj2.InternationalGermany();
			
		}
		
		}
		
		         else if(destination==2)
					 
		{
			
			     String array[]= new String[]{" Cox's Bazar"," Sajek Valley", " Sreemangal"," Bandarban"," Rangamati"}; 
				 
			     for(int i=0; i<=array.length-1;  i++)
					 
			{ 
			
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  "+(i+1) + "."+array[i]);
				
			}
			
			
			     System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
		         int chooseCity = sc.nextInt();
			     System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
				 
				 
			     if(chooseCity == 1)
			{
				 obj1.DomesticCoxs();
				
			}
			     else if(chooseCity == 2)
			{
				 obj1.DomesticSajek();
				
			}
			     else if(chooseCity == 3)
			{
				 obj1.DomesticSreemangal();
				
			}
			     else if(chooseCity == 4)
			{
				 obj1.DomesticBandarban();
				
			}
			     else if(chooseCity == 5)
			{
				 obj1.DomesticRangamati();
				
			}
			
		}
		
		
	}
	
	
	   }
	   
	             else if(found==false)
					 
	   {
		   
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t ____________________________________________________ ");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                    Login Failed                    |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|____________________________________________________|");
				 
	   }

             }
                 catch(Exception e)

             {

                 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                       Error");
	
             }
 }
  }