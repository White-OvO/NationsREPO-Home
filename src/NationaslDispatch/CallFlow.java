package NationaslDispatch;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CallFlow {

    public static void main(String[] args) {
        System.out.println("National Call Flow ");
        System.out.println("For Copesan / Terminix Inbound calls enter 1 : ");
        
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Format the current date as a string
        String formattedDate = currentDate.format(formatter);
        
        switch (input) {
            case 1:
        String brand = "terminix" ;
        
                System.out.println("\n\nStep1: Thank you for calling National Accounts. My name is Christopher. All of our dedicated National Account Specialists are currently assisting"
                        + " other customers. To expedite your request, I would like to gather some information to pass on to your dedicated customer service team."
                        + "\n May I please start with your service address?");
                
                // Gathering service address
                String serviceAddress = scanner.nextLine();
                System.out.println("\nConfirm service address : \n" + serviceAddress);
                
                // Gathering Pest concern
                System.out.println("\nStep2 : Perfect, what is the pest concern today?");
                String pestConcern = scanner.nextLine();
                System.out.println("\nOH GOTCHA ill make sure we get your concern for " + pestConcern + " addressed ");
                 
                
                //pest location 
               System.out.println("\nLOCATION OF PEST OR N/A ");
               String pestLocation = scanner.nextLine();
               System.out.println("\nPest Location: " + pestLocation);
               
                
                // Name of the account / buisness 
                System.out.println("\nStep3: Ok and what is the name of the account or name of the busniess  ");
                
                String nameOfBuisness = scanner.nextLine();
                
                System.out.println("\nname of buisness :" + nameOfBuisness);
                
                
                
                // person calling name fir and last name  
                System.out.println("\nStep4: What is your first and last name ? ");
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                String fullName = firstName + " " + lastName; 
                System.out.println("\nFull name : "+ fullName );
                
                
                
                //position of to the company 
                System.out.print("\nWhat is your occupation with the company? ");
                String occupaction = scanner.nextLine();
                System.out.println("\n"+ fullName + " is " + occupaction + " at " + nameOfBuisness);
                
                
                
                //Good Contact number
                System.out.println("\nThank you, and a good contact number?");
                String contactNumber = scanner.nextLine();
                System.out.println("\nContact number: " + contactNumber);
                //PO BOX info 
                System.out.println("\nAlright do you have a PO or work oder number that you need to assosicate for your service request? ");
                String PONum = scanner.nextLine();
                System.out.println("\n confirmation of PO number/ NA : " + PONum);
               
                // additional comments : 
                
                System.out.println(" Addition comments and concerns : ");
                String Details = scanner.nextLine(); 
                System.out.println(Details);
                System.out.println("\n\nEmail : nationalcallbacks@rentokil.com and intouchrentokildispatches@intouchcx.com *albersons, safeway, and publix have a personal 3rd email \n that needs to be attached as well.");
                System.out.println("Subject : "+ brand +  " " + fullName + formattedDate);
                System.out.println();
                System.out.println("\n\n\n\n\nCaller's First and Last Name: "+ fullName +
                		"\nPhone Number for Contact : "+ contactNumber + "\nFull Addresss of Location Needing Service: "+ serviceAddress 
                		+ "\nPest Concern: "+ pestConcern + "\nLocation of Pest : "+ pestLocation + "\nPO or Work order Number(if not N/A ): "+ PONum
                		+ "\nAdditional detailed comments provided by caller: "+ Details +" \n\n For AMAZON collect the point of contact email . ");
                System.out.println("\nFor CCM accounts EMAIL through PestPac . Close NOTES w/ SIGNATURE . Form Filled. Emailed dispatched. ");
                 System.out.println("\n\n\n\nAllright your addressed for success at this point ill get you sorted by sending this over to your dedicated national"
                		 
                 		+ "\nspecialist and get youy sorted from there. ");
                 System.out.println("\nIs there any general questions for me ? ");
                 System.out.println("\nGreat, We have a three question  survey that only affects and helps me at the end of the call \nGoodNight ");
                 
                 

                break;
                
            default:
                System.out.println("Invalid input");
                break;
        }
        
        scanner.close();
    }
}