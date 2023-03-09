import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class CurrencyConverter{
   public static void main(String[] args){

    double INR,USD,Pound,code,EUR,KWD;
    DecimalFormat f=new DecimalFormat("##.###");
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Welcome to the currency converter!");
    
    System.out.println("Enter the currency code");
    System.out.println(" 1:INR (Indian Rupee) \n 2:USD (US Dollar) \n 3:Pound (Pound) \n 4:EUR (Euro) \n 5:KWD (Kuwaiti Dinar)");
    
    code=sc.nextInt();
    if(code==1)
    {
      System.out.println("Enter the amount in INR:");
      INR=sc.nextDouble();
     
      USD=INR/77.34;
      System.out.println("USD : " + f.format(USD));
     
      Pound=INR/94.46;
      System.out.println("Pound : " + f.format(Pound));
     
      EUR=INR/80.36;
      System.out.println("EUR : " +  f.format(EUR));
     
      KWD=INR/251.92;
      System.out.println("KWD : "  + f.format(KWD));
    }

    else if(code==2)
    {
      System.out.println("Enter the amount in USD:");
      USD=sc.nextDouble();
     
      INR=USD*77.34;
      System.out.println("INR : "  + f.format(INR));
     
      Pound=USD*0.82;
      System.out.println("Pound : "  + f.format(Pound));
     
      EUR=USD*0.96;
      System.out.println("EUR : " +  f.format(EUR));
     
      KWD=USD*0.31;
      System.out.println("KWD : " +  f.format(KWD));
    }

    else if(code==3)
    {
      System.out.println("Enter the amount in Pound:");
      Pound=sc.nextDouble();
     
      INR=Pound*94.43;
      System.out.println("INR : " +  f.format(INR));
     
      USD=Pound*1.22;
      System.out.println("Pound : " +  f.format(USD));
     
      EUR=Pound*1.17;
      System.out.println("EUR : " +  f.format(EUR));
     
      KWD=Pound*0.3748;
      System.out.println("KWD : " +  f.format(KWD));
    }

    else if(code==4)
    {
      System.out.println("Enter the amount in EUR:");
      EUR=sc.nextDouble();
      
      INR=EUR*80.43;
      System.out.println("INR : " +  f.format(INR));
     
      USD=EUR*1.04;
      System.out.println("USD : " +  f.format(USD));
     
      Pound=EUR*0.85;
      System.out.println("Pound : "  + f.format(Pound));
      
      KWD=EUR*0.318949;
      System.out.println("KWD : "  + f.format(KWD));
    }

    else if(code==5)
    {
      System.out.println("Enter the amount in KWD:");
      KWD=sc.nextDouble();
      
      INR=KWD*251.96;
      System.out.println("INR : "  + f.format(INR));
     
      USD=KWD*3.26;
      System.out.println("USD : "  + f.format(USD));
     
      Pound=KWD*2.67;
      System.out.println("Pound : "  + f.format(Pound));
      
      EUR=KWD*3.13;
      System.out.println("EUR : "  + f.format(EUR));
    }

    else{
        System.out.println("Invalid Code");
    }
    
    System.out.println("Thank you for using the currency converter!");
   }
}