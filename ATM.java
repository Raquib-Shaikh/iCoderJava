package atmmachine;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ATMop obj = new ATMop();
    }
}
class Data{
//    variable
   float Balance;
}
class ATMop{
//    instance variable
//    float balance;
    Scanner sc = new Scanner(System.in);
    HashMap<Integer , Data> map = new HashMap<>();
//    create constructor
  ATMop(){
          System.out.println("***************************************************");
      System.out.println("welcome to our ATM");
      op();
      
  }
  public void op(){
          System.out.println("***************************************************");
      System.out.println("Enter Your Pin code:");
       System.out.println("Alert! Please DON'T Share Your 'PASSWORD' Or 'PIN':");
      int pincode = sc.nextInt();
      
      if(map.containsKey(pincode) == true){
      Data obj = map.get(pincode);
      menu(obj);
      }
      else{
          System.out.println("***************************************************");
          System.out.println("Please Create Account First");
          System.out.println("Set your Pin code");
          int pin = sc.nextInt();
          Data obj = new Data();
          map.put(pin , obj);
          menu(obj);
      }
  }
  public void menu(Data obj){
           System.out.println("***************************************************");
      System.out.println("Please Enter Valid Number");
      System.out.println("1, Check Balance");
      System.out.println("2, Deposit Money");
      System.out.println("3, Withdraw Money");
      System.out.println("4, Check another account");
      System.out.println("5. exit");
      
      int x=sc.nextInt();
      //          function call=-
      if(x==1){
      Check_Balance(obj);
     
      }
      else if (x==2){
           Deposit(obj);
      }
      else if(x==3){
            withdraw(obj);
            
      }
      else if(x==4){
         op();
         
      }
      else if(x==5){
          System.out.println("THANK YOU !");
      }
      else{
          System.out.println("Please Enter Valid NUMBER");
          menu(obj);
      }
      }
//  create method
  public void Check_Balance(Data obj){
          System.out.println("***************************************************");
            System.out.println("Your Blance " + obj.Balance);
                System.out.println("***************************************************");
                menu(obj);
  }
  public void Deposit(Data obj){
      System.out.println("Enter Your Deposit Amount");
      float a = sc.nextFloat();
      obj.Balance = obj.Balance + a;
      System.out.println("Amount Deposited Succesfully");
          System.out.println("***************************************************");
          menu(obj);
          
  }
  public void withdraw(Data obj){
  System.out.println("Enter Your Withdraw Amount");
      float a = sc.nextFloat();
      if(obj.Balance >= a){
      obj.Balance = obj.Balance-a;
      System.out.println("Amount Withdraw Succesfully");
      }
      else{
            System.out.println("***************************************************");
          System.out.println("Insuuficient Balance !");
          System.out.println("***************************************************");
      }
      
          System.out.println("***************************************************");
          menu(obj);
  }


  }

