package org.example;
import java.util.Scanner;

public class PassWordValidation {

    public static void main(String[] args) {

        String password;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Password");
        password = scan.nextLine();
        passlength(password);



    }
    public static void passlength(String pass){
        int min = 8;
        int max =16;
        if ( pass.length() >= min && pass.length() < max){
           int digitCounter=0;
           int upperCaseCounter=0;
           int lowerCaseCounter=0;
           for(int i=0 ; i < pass.length() ; i++){
               char c =pass.charAt(i);
               if(Character.isDigit(c)){
                   digitCounter++;
               }
               if(Character.isUpperCase(c)){
                   upperCaseCounter++;
               }
               if(Character.isLowerCase(c)){
                   lowerCaseCounter++;
               }
           }
               if(digitCounter > 0 && upperCaseCounter >0 && lowerCaseCounter >0){
                   System.out.println("Password  is strong !!");
               }else if (digitCounter <= 0){
                   System.out.println(" password  must have digits");
                   String password;
                   Scanner scan = new Scanner(System.in);
                   System.out.println("Enter your Password");
                   password = scan.nextLine();
                   passlength(password);
               }else if (upperCaseCounter <= 0){
                   System.out.println(" password  must have UpperCase char");
                   String password;
                   Scanner scan = new Scanner(System.in);
                   System.out.println("Enter your Password");
                   password = scan.nextLine();
                   passlength(password);
               }else if (lowerCaseCounter <= 0){
                   System.out.println(" password  must have LowerCase char");
                   String password;
                   Scanner scan = new Scanner(System.in);
                   System.out.println("Enter your Password");
                   password = scan.nextLine();
                   passlength(password);
               }

           } else{
           System.out.println("Enter min 8 char password ");
           String password;
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter your Password");
           password = scan.nextLine();
           passlength(password);
       }
    }

}