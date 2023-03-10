package com.userregistrationproblem;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	//Firstname validation
    public  void validFirstName() {
         Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Sumithra");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
        
    }   
    
  //lastname validation
    public  void validLastName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Buddareddy");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    //Emailid Validation
    public void  validEmail() {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher("sumpavib1302@gmail.com");
        if (matcher.matches()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    
  //contact number validation
    public  void validContactNumber() {
            Pattern pattern = Pattern.compile("^[0-9]{1,2}\\s{1}[0-9]{10}$");
            Matcher matcher = pattern.matcher("91 4567890987");
            if (matcher.matches()){
                System.out.println("valid");
            }else {
                System.out.println("invalid");
            }
        }
    
  //password validation rule1
    public void validPasswordRule1(){
        Pattern pattern = Pattern.compile("^[a-z]{8,}+$");
        Matcher matcher = pattern.matcher("sumithra");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    
    //password validation rule2
    public void validPasswordRule2() {
        Pattern pattern = Pattern.compile("^([A-Z]?[a-z]{8,})$");
        Matcher matcher = pattern.matcher("Sumithrabuddareddy");
        if (matcher.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
    
    //password validation rule3
    public void validPasswordRule3() {
        Pattern pattern = Pattern.compile("^([A-Z]?[a-z](?=.*[0-9]).{8,})$");
        Matcher matcher = pattern.matcher("Sumithra1222");
        if (matcher.matches()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
    //password validation rule4
    public void validPasswordRule4() {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])"
               + "(?=.*[a-z])(?=.*[A-Z])"
               + "(?=.*[@#$%^&+=])"
               + "(?=\\S+$).{8,20}$");
           Matcher matcher = pattern.matcher("Sumithra@123");
           if (matcher.matches()){
               System.out.println("true");
           }else {
               System.out.println("false");
           }
       }
    
    //email pattern
    public  void emailAllPattern(){
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc-100@yahoo.com");
        emails.add(" abc@yahoo.com,");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com,");
        //invalid emails
        emails.add(".abc123#gmail.a");
        emails.add("abc@*@gmail.com ");
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}
