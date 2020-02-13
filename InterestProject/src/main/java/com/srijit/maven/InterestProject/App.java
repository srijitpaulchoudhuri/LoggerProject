package com.srijit.maven.InterestProject;
import java.util.*;
import java.io.*;

class simple_interest
{
   double p,r,t;
   simple_interest(double p,double r,double t)
   {
      
       this.p=p;
       this.r=r;
       this.t=t;
   }
   void result()
   {
       double result;
       result=p*(1+(r*t));
       
         System.out.format("Final Amount = %.2f", result);
       
   }
}
class compound_interest
{
   double p,r,t,n;
   compound_interest(double p,double r,double t,double n)
   {
      
       this.p=p;
       this.r=r;
       this.t=t;
       this.n=n;
   }
   void result()
   {
       double result;
       result= p*(Math.pow((1+(r/n)),(n*t)));
      
       System.out.format("Final Amount = %.2f", result);
       
   }
}
class house_cost
{
    double price,area;
    house_cost(double price,double area)
    {
        this.price=price;
        this.area=area;
    }
    void total_cost()
    {
        System.out.format("Price of the entire construction = %.2f" , (price*area));
    }
        
}
public class App 
{
    public static void main( String[] args )
    {
    	App.client_method();
    }
    static void client_method()
    {
        
        	
        Scanner scanner_object=new Scanner(System.in);
         System.out.append("Press 1 for simple interest" + "\n");
         System.out.append("Press 2 for compound interest");
        int input= scanner_object.nextInt();
        switch(input)
        {
            case 1:
                System.out.format("Enter Principal Amount");
                double principal_amount=scanner_object.nextDouble();
                 System.out.append("Enter annual rate of interest in decimal");
                double rate_of_interest=scanner_object.nextDouble();
                 System.out.append("Enter time period");
                double time_period=scanner_object.nextDouble();
                
                 simple_interest s=new simple_interest(principal_amount,rate_of_interest,time_period);
                 s.result();
                 break;
            case 2:
                 System.out.append("Enter Principal Amount");
                double principal_amount_compound=scanner_object.nextDouble();
                 System.out.append("Enter annual rate of interest in decimal");
                double rate_of_interest_compound=scanner_object.nextDouble();
                 System.out.append("Enter time period");
                double time_period_compound=scanner_object.nextDouble();
                 System.out.append("Enter number of compoundings");
                double compounding=scanner_object.nextDouble();
                
                 compound_interest c= new compound_interest(principal_amount_compound,rate_of_interest_compound,time_period_compound,compounding);
                 c.result();
                 break;
            default:
                 System.out.append("Wrong Input");
                break;
                
                
        }
   
        System.out.append("Press 1 if you want use standard building materials \n" );
        System.out.append("Press 2 if you want use above standard building materials \n");
        System.out.append("Press 3 if you want use high standard building materials without full automation \n");
        System.out.append("Press 4 if you want use high standard building materials and full automation \n");
        
        input=scanner_object.nextInt();
        System.out.append("Enter the area of the house");
        double area=scanner_object.nextInt();
        double cost;
        switch(input)
        {
            case 1:
              cost=1200;
              break;
            case 2:
                cost=1500;
                break;
            case 3:
                cost=1800;
                break;
            case 4:
                cost=2500;
                break;
            default:
                System.out.append("Wrong Input");
                cost=0;
                break;
                
        }
        if(cost!=0)
        {
        house_cost hc=new house_cost(cost,area);
        hc.total_cost();
        }
        
        
        
    }
}
