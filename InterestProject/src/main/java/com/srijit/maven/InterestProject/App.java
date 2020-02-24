package com.srijit.maven.InterestProject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.io.*;

class simple_interest
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);  
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
       
         //System.out.format("Final Amount = %.2f", result);
         LOGGER.info("Final Amount = " + result + "\n");
       
   }
}
class compound_interest
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
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
      
       //System.out.format("Final Amount = %.2f", result);
       LOGGER.info("Final Amount = " + result + "\n");

       
   }
}
class house_cost
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    double price,area;
    house_cost(double price,double area)
    {
        this.price=price;
        this.area=area;
    }
    void total_cost()
    {
        //System.out.format("Price of the entire construction = %.2f" , (price*area));
        LOGGER.info("Price of the entire construction = " + (price*area));
    }
        
}
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
    	App.client_method();
    }
    static void client_method()
    {
        
        	
        Scanner scanner_object=new Scanner(System.in);
        // LOGGER.info("Press 1 for simple interest" + "\n");
         //LOGGER.info("Press 2 for compound interest");
         LOGGER.info("Press 1 for simple interest" + "\n");
         LOGGER.info("Press 2 for compound interest" + "\n");
        int input= scanner_object.nextInt();
        switch(input)
        {
            case 1:
               // System.out.format("Enter Principal Amount");
            	LOGGER.info("Enter Principal Amount");
                double principal_amount=scanner_object.nextDouble();
                 //LOGGER.info("Enter annual rate of interest in decimal");
                LOGGER.info("Enter annual rate of interest in decimal");
                double rate_of_interest=scanner_object.nextDouble();
                 //LOGGER.info("Enter time period");
                LOGGER.info("Enter time period");
                double time_period=scanner_object.nextDouble();
                
                 simple_interest s=new simple_interest(principal_amount,rate_of_interest,time_period);
                 s.result();
                 break;
            case 2:
                 //LOGGER.info("Enter Principal Amount");
                 LOGGER.info("Enter Principal Amount");
                double principal_amount_compound=scanner_object.nextDouble();
                // LOGGER.info("Enter annual rate of interest in decimal");
                LOGGER.info("Enter annual rate of interest in decimal");
                double rate_of_interest_compound=scanner_object.nextDouble();
                // LOGGER.info("Enter time period");
                LOGGER.info("Enter time period");
                double time_period_compound=scanner_object.nextDouble();
                 //LOGGER.info("Enter number of compoundings");
                LOGGER.info("Enter number of compoundings");
                double compounding=scanner_object.nextDouble();
                
                 compound_interest c= new compound_interest(principal_amount_compound,rate_of_interest_compound,time_period_compound,compounding);
                 c.result();
                 break;
            default:
                 //LOGGER.info("Wrong Input");
            	LOGGER.info("Wrong Input");
                break;
                
                
        }
   
        LOGGER.info("Press 1 if you want use standard building materials \n" );
        LOGGER.info("Press 2 if you want use above standard building materials \n");
        LOGGER.info("Press 3 if you want use high standard building materials without full automation \n");
        LOGGER.info("Press 4 if you want use high standard building materials and full automation \n");
        
        input=scanner_object.nextInt();
        LOGGER.info("Enter the area of the house");
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
                LOGGER.info("Wrong Input");
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
