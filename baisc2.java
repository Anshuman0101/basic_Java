package week_2;

import java.util.Scanner;

public class basic {


     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);





/* QUESTION_1......................
//  1. Income Tax Calculator

// Input: Annual income.

// Logic:

// Income ≤ 2.5 lakhs → No tax

// 2.5L–5L → 5%

// 5L–10L → 20%

// 10L → 30%

// Output: Print tax amount.

// */



//         // System.out.println("Enter the Income :-");
//         // int income = sc.nextInt();
//         // int p = 250000;

//         // if (income <= p) {
//         //     System.out.println("No tax");

//         // } else if (income > p && income <= (p * 2)) {
//         //     System.out.println("5% tax");

//         // } else if (income > (p * 2) && income <= (p * 4)) {
//         //     System.out.println("20% tax");

//         // } else if (income > (p * 4)) {
//         //     System.out.println("30% tax");

//         // } else {
//         //     System.out.println("Invalid income");
//         // }






// /*QUESTION_2..................................
// 2. Electricity Bill Calculator
// Input: Units consumed.

// Slabs:

// First 100 units: ₹1.50/unit

// 101–300 units: ₹2.00/unit

// Above 300 units: ₹3.00/unit

// Add ₹50 fixed charge if usage > 200 units.

// Output: Total bill amount. */
//         // System.out.println("Enter the unit :-");
//         // int unit=sc.nextInt();

//         // if(unit>0&&unit<=100){
//         //     System.out.println(unit*1.50);

//         // }else if(unit>101&&unit<=300){
//         //    if(unit>200){
//         //       System.out.println((unit*2)+50);
//         //    }
//         // }else if(unit<300){
//         //      System.out.println((unit*3)+50);
//         // }

       







// /*3.QUESTION_3
        
//         ATM Withdrawal Logic
// Input: Balance and withdrawal amount.

// Conditions:

// Withdrawal amount must be a multiple of 100.

// Balance must be sufficient (including ₹5 service charge).

// Output: Updated balance or error message. */




//         // int saving = 0; 

//         // System.out.println("You want withdrawal amount or balance check");
//         // System.out.println("If withdrawal press: 1");
//         // System.out.println("If balance check press: 2");
//         // System.out.println("If deposit amount press: 3");
//         // int num = sc.nextInt(); 

       
//         // if (num == 1) {
           
//         //     System.out.println("Enter the withdrawal amount:");
//         //     int with = sc.nextInt();

           
//         //     if (with % 100 != 0) {
//         //         System.out.println(" Withdrawal amount must be a multiple of 100");
//         //     } 
           
//         //     else if (saving >= (with + 5)) {
//         //         saving = saving - with - 5;
//         //         System.out.println(" Withdrawal successful.");
//         //         System.out.println("₹5 service charge applied.");
//         //         System.out.println("Remaining balance: ₹" + saving);
//         //     } 
//         //     else {
//         //         System.out.println(" Insufficient balance (including ₹5 charge).");
//         //     }

//         // } else if (num == 2) {
          
//         //     System.out.println(" Your account balance: ₹" + saving);

//         // } else if (num == 3) {
           
//         //     System.out.println("Enter the amount to deposit:");
//         //     int deposit = sc.nextInt();
//         //     saving += deposit; 
//         //     System.out.println("Amount deposited. Updated balance: ₹" + saving);
//         // } else {
           
//         //     System.out.println(" Invalid option. Please select 1, 2, or 3.");
//         // }



 
    
// /*QUESTION4.
//  Password Strength Checker
// Input: A string (password).

// Logic:

// Must have ≥ 8 characters

// Must contain uppercase, lowercase, digit, and special character

// Output: "Strong", "Moderate", or "Weak" */



// // System.out.println("Enter the Password:-");
// // String pass=sc.nextLine();
// // int num=pass.length();
// // boolean  uppercase=false;
// // boolean  lowercase=false;
// // boolean  digit=false;
// // boolean specialCharacter=false;

// // for(int i=0;i<num;i++){
// // char ch=pass.charAt(i);
// // if(ch>='A'&&ch<='Z'){
// //   uppercase=true;

    
// // } else
// // if(ch>='a'&&ch<='z'){
 
// //   lowercase=true;

    
// // }
// // else
// // if(ch>='0'&&ch<='9'){

  
// //  digit=true;

    
// // }
// // else
// // {

// //  specialCharacter=true;
    
// // }


// // }

// // int count=0;
// // if(uppercase)count++;
// // if(lowercase)count++;
// // if(  digit)count++;
// // if(specialCharacter)count++;

// // if(num<8){
// //     System.out.println("Password will to short ..  it must be 8 character \n and it is a weak password "+pass);


// // }else if(count==4){
// //     System.out.println("Strong password"+pass);
// // }else if(count==3){
// //     System.out.println("Medium  Strong password"+pass);
// // }else{
// //     System.out.println("Weak password"+pass);
// // }




//         /*5.QUESTION_5..................
        
//         Student Result System
// Input: Marks in 5 subjects.

// Logic:

// If any subject has < 35 marks → Fail

// Average ≥ 90 → Grade A

// 75–89 → Grade B

// 60–74 → Grade C

// Below 60 → Grade D

// Output: Grade or Fail */


// //  System.out.println("Enter the Marks:-1");
// //         int n1 = sc.nextInt();

// //         System.out.println("Enter the Marks:-2");
// //         int n2 = sc.nextInt();

// //         System.out.println("Enter the Marks:-3");
// //         int n3 = sc.nextInt();

// //         System.out.println("Enter the Marks:-4");
// //         int n4 = sc.nextInt();

// //         System.out.println("Enter the Marks:-5");
// //         int n5 = sc.nextInt();

// //         int average = (n1 + n2 + n3 + n4 + n5) / 5;

// //         if (n1 < 35 || n2 < 35 || n3 < 35 || n4 < 35 || n5 < 35) {
// //             System.out.println("Fail");
// //         } else {
// //             if (average >= 90) {
// //                 System.out.println("Average: " + average + " ... Grade A");
// //             } else if (average >= 75 && average <= 89) {
// //                 System.out.println("Average: " + average + " ... Grade B");
// //             } else if (average >= 60 && average <= 74) {
// //                 System.out.println("Average: " + average + " ... Grade C");
// //             } else {
// //                 System.out.println("Average: " + average + " ... Grade D");
// //             }
//     //    }
    


// /* Question_6
//  . Online Shopping Discount System
// Input: Total purchase amount and customer type (New/Returning).

// Logic:

// If amount > ₹10,000 and customer is Returning → 20% discount

// If amount > ₹10,000 and customer is New → 15% discount

// Else if amount > ₹5,000 → 10% discount

// Else → No discount

// Output: Final payable amount. */


// // System.out.println("if you are New Customer press:-1\n else press:- 2 :");
// // int cus=sc.nextInt();

// // System.out.println("Enter the amount of total purchase :");
// // int pur=sc.nextInt();
// // if(pur>10000){
// //     if(cus==1){
// //     int  ans=    pur*15/100;
// //     ans=pur-ans;
// //         System.out.println("Amount to be paid :-"+ans);
// //     }else{
// //         if(cus==2){
// //     int  ans=    pur*20/100;
// //     ans=pur-ans;
// //         System.out.println("Amount to be paid :-"+ans);
// //     }
// //     }

// // }else if(pur>5000){

// //      int  ans=    pur*10/100;
// //     ans=pur-ans;
// //         System.out.println("Amount to be paid :-"+ans);


// // }else{
// //     System.out.println("Amount to be paid :-"+pur);
// // }







// /*7. Train Ticket Fare System
// Input: Age and travel distance.

// Logic:

// Children (<5): Free

// Senior citizens (>60): 50% discount

// Regular: ₹5 per km

// Output: Fare amount */

// // System.out.println("Enter your age :-");
// // int age=sc.nextInt();
// // System.out.println("Enter your travel distance :-");
// // int distance=sc.nextInt();
// // if(age<5){
// //     System.out.println("Free");
// // }else if(age>60){

// //     int  ans=(distance*5)*50/100;
// //      System.out.println("amount :-"+ans); 
// // }else{
// //   System.out.println("amount :-"+distance*5);
// // }






// /*QUESTION8....................................
//  Login Authentication System
// Input: Username and password.

// Logic:

// If both match → "Login successful"

// If username correct but password wrong → "Incorrect password"

// Else → "Invalid username"
//  */


// // System.out.println("Enter Name:-");
// // String name=sc.nextLine();
// // System.out.println("Enter the Password:-");
// // String pass=sc.nextLine();
// // String name1="Anshuman Singh";
// // String pass1="0z18wb5p54";
// // if(name.equals(name1)){
// //     if(pass.equals(pass1)){
// //         System.out.println("Wlecome ");
// //     }else{
// //         System.out.println("Invalid password..");
// //     }
// // }else{
// //     System.out.println("Invalid Username");
// // }



// /*9. Traffic Light Simulation
// Input: Color as a string (red, yellow, green).

// Logic:

// Red → "Stop"

// Yellow → "Wait"

// Green → "Go"

// Invalid → "Invalid color" */

// // System.out.println("Enter the color:red,yellow,green");
// // String s=sc.nextLine();
// // String s1="red";
// // String s2="green";
// // String s3="yellow";
// // if(s.equals(s1)){
// // System.out.println("Stop");
// // }
// // else if(s.equals(s2)){
// // System.out.println("go");
// // }
// // else if(s.equals(s3)){
// // System.out.println("wait");
// // }else{
// //     System.out.println("Invalid color..");
// // }






// // /*QUESTION..10.

// // Loan Eligibility (Multiple Nested Conditions)
// // Input: Age, monthly income, job type (salaried/self-employed), credit score.

// // Logic:

// // Age > 21

// // Income ≥ ₹25,000

// // Salaried: credit score ≥ 650

// // Self-employed: credit score ≥ 700

// // Output: "Eligible" or "Not Eligible" */





// //    System.out.println("Enter Age:-");
// //     int  age=sc.nextInt();

    
   
// // if(age>21){

// //     System.out.println("Enter salary amount:-");
// //     int  mony=sc.nextInt();
// //     System.out.println("Enter job type :- 1. for self-employed \n 2.salaried ");
// //     int sel=sc.nextInt();
// //     System.out.println("Enter creadit score :-");
// //     int score=sc.nextInt();
// //     if(mony>=25000){
// //         if(sel==1&& score>=700){
// // System.out.println("Eligible");
// //         }else if(sel==2&& score>=650)
// // System.out.println("Eligible");
// //     }else{
// //         System.out.println("Not qualified");
// //     }
// // }else{
// //     System.out.println("not qualified..");
// // }








    







    
//     }}
