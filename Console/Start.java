import Domestic.*;
import Default.*;
import International.*;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.Console;
import java.util.*;
import java.util.stream.*; 
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;



    public class Start extends Verifylogin {
	public static void main(String [] args) throws IOException, InterruptedException{
		
		int num;
		
		
		
		
		         RunPackage obj3= new RunPackage();
		         Germany obj2= new Germany();
		         Rangamati obj1= new Rangamati();
		         Start obj = new Start ();
		         Scanner sc = new Scanner(System.in);
				 
				 
				 			
	
			     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			     System.out.println("\t\t\t\t\t\t\t\t*****************************************************************************************************");
			     System.out.println("\t\t\t\t\t\t\t\t*                                             Welcome!                                              *");
			     System.out.println("\t\t\t\t\t\t\t\t*                                  Travel anywhere in the world!                                    *");
			     System.out.println("\t\t\t\t\t\t\t\t*****************************************************************************************************");
			     System.out.println("\t\t\t\t\t\t\t\t                                                                                                     ");
			     System.out.println("\t\t\t\t\t\t\t\t                                   ______________________________                                    ");
			     System.out.println("\t\t\t\t\t\t\t\t                                  |                              |                                   ");
			     System.out.println("\t\t\t\t\t\t\t\t                                  |         1. Admin             |                                   ");
			     System.out.println("\t\t\t\t\t\t\t\t                                  |         2. Login             |                                   ");
			     System.out.println("\t\t\t\t\t\t\t\t                                  |         3. Register          |                                   ");
			     System.out.println("\t\t\t\t\t\t\t\t                                  |         4. Exit              |                                   ");
			     System.out.println("\t\t\t\t\t\t\t\t                                  |______________________________|                                   ");
			     System.out.println("\t\t\t\t\t\t\t\t                                                                                                     ");
			     System.out.println("\t\t\t\t\t\t\t\t                                                                                                     ");
			     System.out.println("\t\t\t\t\t\t\t\t                                                                                                     ");
			     System.out.println("\t\t\t\t\t\t\t\t   ______________________________                                  ______________________________    ");
			     System.out.println("\t\t\t\t\t\t\t\t  | Project tile : Travel agency |                                |          Contributors        |   ");
			     System.out.println("\t\t\t\t\t\t\t\t  |                              |                                |      Moshiur Rahman Nahin    |   ");
			     System.out.println("\t\t\t\t\t\t\t\t  | Team name    : Sqaure        |                                |      Farhan Sadik Ferdous    |   ");
			     System.out.println("\t\t\t\t\t\t\t\t  |                              |                                |      Tapu Biswas             |   ");
			     System.out.println("\t\t\t\t\t\t\t\t  | Group number : 6             |                                |      Zaid Amin Rawfin        |   ");
			     System.out.println("\t\t\t\t\t\t\t\t  |______________________________|                                |______________________________|   ");
			     System.out.println("\t\t\t\t\t\t\t\t                                                                                                     ");
			     System.out.println("\t\t\t\t\t\t\t\t                                                                                                     ");
			     System.out.print  ("\t\t\t\t\t\t\t\t                                       Select an Option : ");num = sc.nextInt(); 
		
		         Console console = System.console();
		
	

		
		         switch(num)
		
		{
			case 1:
			             
			     int ad;
				
				
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                    Admin Panel                    *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Username : ");
				 String admin =sc.next();
			     char[] passArray = console.readPassword("\t\t\t\t\t\t\t\t\t\t\t                 Password : ");
				 
				 
				 
			
			     if( admin.equals("admin") && (new String(passArray).equals(admin)))
				
			{
				 System.out.println("\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t ____________________________________________________ ");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                  Login Successful                  |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|____________________________________________________|\n");
			}
			
			     else
				
			{
				 System.out.println("\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t ____________________________________________________ ");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                    Login Failed                    |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|____________________________________________________|\n");
				 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t           Enter 0 To Back to the Main Menu : ");
				 int Main;
				 Main = sc.nextInt();
				 if(Main==0)
					{
						obj.GoBack();
					}

	break;
			}
					
                 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                    1. Add User");
	             System.out.println("\t\t\t\t\t\t\t\t\t\t\t                    2. Remove User");
			     System.out.println("\t\t\t\t\t\t\t\t\t\t\t                    3. User List");
			 
		         System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");			
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Select an Option : ");
		         ad = sc.nextInt();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------------------------\n");
			 
			     switch(ad)
			 
			 {
				 
				 
			case 1:
				 
				 System.out.println("\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                    Add An User                    *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 
				 
				 try{{FileWriter myWriter2 = new FileWriter("users.txt",true);
				 
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Username : ");

				 String adduser = sc.next();
			 
				 myWriter2.write(adduser);
				 
				 String s=",";
				 myWriter2.write(s);
				 
				 
				 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Password : ");
				 String addpass = sc.next();
			 
				 myWriter2.write(addpass);
				 
				 String s1="\n";
				 myWriter2.write(s1);
				 
				 
				 myWriter2.close();
				 
				 
				 }}
				   
				 
				 catch(Exception g)
				 
				 {
			     System.out.println(g);
				 }
				 
				 
				 
	 

				 finally
				 
				 { 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t ____________________________________________________ ");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|             User Created Successfully              |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|____________________________________________________|\n");
				 
			     }
				 
				 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 
				 int Main2;
				 Main2 = sc.nextInt();
				 if(Main2 ==0)
					{
						obj.GoBack();
					}
			 
			 
    break;
			 
			 
				 
		    case 2:
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                  Remove An User                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");		 
				 
				 {
					 
				 String removeuser,record;	 
				 Scanner strInput =  new Scanner(System.in);
    		     
    		
    		
    		     File tempDB = new File("users_temp.txt");
    		     File db = new File("users.txt");
    		
    		
    		     BufferedReader br = new BufferedReader( new FileReader( db ) );
    		     BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
    		
				 System.out.println("\n");
    		     System.out.println("\t\t\t\t\t\t\t\t\t\t\t              Enter User Name To Delete\n");
    		     System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Username : ");
    		     removeuser =  strInput.nextLine();
    		
    		
    		     while( ( record = br.readLine() ) != null ) 
			 
			 {
    			
    			
    		     if( record.contains(removeuser) ) 
    				continue;
   
    			 bw.write(record);
    			 bw.flush();
    			 bw.newLine();
				
			
 
    		 }
    		
    		     br.close();
    		     bw.close();
    		
    		     db.delete();
    		
    		     tempDB.renameTo(db);
			     System.out.println("\n");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t ____________________________________________________ ");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|             User Removed Successfully              |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|____________________________________________________|\n");
				 
				 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main3;
				 Main3 = sc.nextInt();
				 if(Main3==0)
					{
						obj.GoBack();
					}
                }
	break;
				 
				
			 
			case 3:
			
			
			 
	         try 
			 
			 {
				 
                 File myObj = new File("users.txt");
                 Scanner myReader = new Scanner(myObj);
			 
			 
                 while (myReader.hasNextLine()) 
			 
			 {
				 
				 
                 String data = myReader.nextLine();
			 
                 System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+data);
				 
			 
			 
             }
			 
			 
                 myReader.close();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main4;
				 Main4 = sc.nextInt();
				 if(Main4==0)
					{
						obj.GoBack();
					}
			 
             }
		   
		   
		         catch (FileNotFoundException e) 
		   
		   
		     {
			   
			   
                 System.out.println("\t\t\t\t\t\t\t\t\t\t\t              An error occurred.");
                 e.printStackTrace();
				
				
		     }
		   
    break;
		   
		   
    }
			 
	break;
			 
	

			
	    case 2:
			
			     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                       Login                       *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");				
			 
			     obj.CallVerifylogin();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main5;
				 Main5 = sc.nextInt();
				 if(Main5==0)
					{
						obj.GoBack();
					}
			 
			 
	break;

			
		case 3:
			
			     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			     try{FileWriter myWriter3 = new FileWriter("users.txt",true);
				
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                Registration Panel                 *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*                                                   *");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t*****************************************************");					
			
			

			     System.out.println("\n");
			     System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Username : ");
                 String newname = sc.next();
			     myWriter3.write(newname);
			 
			     String s2=",";
		         myWriter3.write(s2);
			

			     System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Email : ");
			     String email = sc.next();
			 
			     char[] passwrdArray = console.readPassword("\t\t\t\t\t\t\t\t\t\t\t                 Password : ");
			     myWriter3.write(passwrdArray);
			 
			     String s3="\n";
		         myWriter3.write(s3);
			     console.printf("\t\t\t\t\t\t\t\t\t\t\t                 Password is: %s%n", new String(passwrdArray));	
			
			     myWriter3.close();
				 
				 					
			       
			 
			 
			     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		         System.out.println("\n");
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
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main6;
				 Main6 = sc.nextInt();
				 if(Main6==0)
					{
						obj.GoBack();
					}
				 
				 
				 
			
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
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main7;
				 Main7 = sc.nextInt();
				 if(Main7==0)
					{
						obj.GoBack();
					}
		}
		
		         else if(chooseCountry==2)
				 
		{
		         obj2.InternationalItaly();	
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main8;
				 Main8 = sc.nextInt();
				 if(Main8==0)
					{
						obj.GoBack();
					}
		}
		
		         else if(chooseCountry==3)
		{
		         obj2.InternationalSouthAfrica();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main9;
				 Main9 = sc.nextInt();
				 if(Main9==0)
					{
						obj.GoBack();
					}
		}
		
		         else if(chooseCountry==4)
		{
		         obj2.InternationalGreece();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main10;
				 Main10 = sc.nextInt();
				 if(Main10==0)
					{
						obj.GoBack();
					}
		}
		
		         else if(chooseCountry == 5)
		{
			     obj2.InternationalGermany();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main11;
				 Main11 = sc.nextInt();
				 if(Main11==0)
					{
						obj.GoBack();
					}
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
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main12;
				 Main12 = sc.nextInt();
				 if(Main12==0)
					{
						obj.GoBack();
					}
			 
			}
			
			     else if(chooseCity == 2)
			{
				
			     obj1.DomesticSajek();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main13;
				 Main13 = sc.nextInt();
				 if(Main13==0)
					{
						obj.GoBack();
					}
			 
			}
			
			     else if(chooseCity == 3)
			{
				
			     obj1.DomesticSreemangal();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main14;
				 Main14 = sc.nextInt();
				 if(Main14==0)
					{
						obj.GoBack();
					}
			 
			}
			
			     else if(chooseCity == 4)
			{
				
				 obj1.DomesticBandarban();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main15;
				 Main15 = sc.nextInt();
				 if(Main15==0)
					{
						obj.GoBack();
					}
				
			}
			
			     else if(chooseCity == 5)
			{
				
				 obj1.DomesticRangamati();
				 System.out.println("\n");
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Enter 0 To Back to the Main Menu/SignOut : ");
				 int Main16;
				 Main16 = sc.nextInt();
				 if(Main16==0)
					{
						obj.GoBack();
					}
				
				
			}
			
		}
		
		       
	}
			
	
		}
		
		
		         catch(FileNotFoundException e)
				 
			 {
				 
			     System.out.println(e);
			 
		     }

	break;
			
			
		case 4:
					
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t ____________________________________________________ ");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|          Successfully exited from program          |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|____________________________________________________|\n");
			
	break;
		
}
		
	
	}
}	
	
	
	
			