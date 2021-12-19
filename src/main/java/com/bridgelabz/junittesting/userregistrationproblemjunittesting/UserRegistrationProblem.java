package com.bridgelabz.junittesting.userregistrationproblemjunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public static boolean isValidUserFirstName(String firstname)
    {
        // Regex to check valid userfirstname.
        String regex = "^[A-Za-z]\\w{3,29}$";
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
        // If the userfirstname is empty
        // return false
        if (firstname == null) {
            return false;
        }
        // Pattern class contains matcher() method
        // to find matching between given userfirstname
        // and regular expression.
        Matcher m = p.matcher(firstname);
        // Return if the userfirstname
        // matched the ReGex
        return m.matches();
    }
  	// Function to validate the userlastname
        public static boolean isValidUserLastName(String lastname)
        {
            // Regex to check valid userlastname.
            String regex = "^[A-Za-z]\\w{3,29}$";
      
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
      
            // If the userlastname is empty
            // return false
            if (lastname == null) {
                return false;
            }
            // Pattern class contains matcher() method
            // to find matching between given userlastname
            // and regular expression.
            Matcher m = p.matcher(lastname);
            // Return if the userlastname
            // matched the ReGex
            return m.matches();
        }
        // Function to validate the useremail
        public static boolean isValidUserEmail(String email)
        {
            // Regex to check valid useremail.
            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
      
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
      
            // If the useremail is empty
            // return false
            if (email == null) {
                return false;
            }
            // Pattern class contains matcher() method
            // to find matching between given useremail
            // and regular expression.
            Matcher m = p.matcher(email);
            // Return if the useremail
            // matched the ReGex
            return m.matches();
        }
        // Function to validate the usermobilenumnber
        public static boolean isValidMobileNo(String mobileNumber)  
        {  
        Pattern ptrn = Pattern.compile("^((\\+|00)(\\d{1,3})[\\s-]?)?(\\d{10})$");
        //the matcher() method creates a matcher that will match the given input against this pattern  
        Matcher match = ptrn.matcher(mobileNumber);  
        //returns a boolean value  
        return (match.find() && match.group().equals(mobileNumber));  
        }  
        // Function to validate the userpassword
     // Function to validate the password.
        public static boolean isValidPassword(String password)
        {
            // Regex to check valid password.
//        	^ represents starting character of the string.
//        	.{8, 20} represents at least 8 characters and at most 20 characters.
//        	(?=.*[a-z]) represents a lower case alphabet must occur at least once.
//        	 (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//        	 (?=.*[0-9]) represents a digit must occur at least once.
//        	$ represents the end of the string.
            String regex = "^(?=\\S+$).{8,20}$"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[0-9])";
            // Compile the ReGex
            Pattern p = Pattern.compile(regex);
            // If the password is empty
            // return false
            if (password == null) {
                return false;
            }
            // Pattern class contains matcher() method
            // to find matching between given password
            // and regular expression.
            Matcher m = p.matcher(password);
            // Return if the password
            // matched the ReGex
            return m.matches();
        }
      
    // main function
    public static void main(String[] args)
    {
        String str1 = "Neeta"; //firstname
        System.out.println(isValidUserFirstName(str1));
        String str2 = "Mourya"; //lastname
        System.out.println(isValidUserLastName(str2));
        String str3 ="neeta.mourya@bl.co.in"; //email
        System.out.println(isValidUserEmail(str3));  
        String str4 ="+91-9919819801"; //usermobilenumnber
        System.out.println(isValidMobileNo(str4));  
        String str5 ="BridgeLabz@123"; //userpassword
        System.out.println(isValidPassword(str5)); 
    }   
}