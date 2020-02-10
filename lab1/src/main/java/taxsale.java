
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class taxsale {
     public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the amount of a purchase");
        
        float theAmountofapurchase= keyboard.nextFloat();
        
        float thestatesalesTax = (float) ( 0.04*theAmountofapurchase);
        
        float thecountysalesTax = (float) (0.02*theAmountofapurchase);
        
        float thetotalsalesTax = (thestatesalesTax+thecountysalesTax);
        
        float thetotaloftheSale = (theAmountofapurchase+thestatesalesTax+thecountysalesTax);
        
        System.out.println("The amount of the purchase: "+ theAmountofapurchase);
        
        System.out.println("The state sales tax: "+thestatesalesTax);
        
        System.out.println("The county sales tax: "+thecountysalesTax);
        
        System.out.println("The total sales tax: "+ thetotalsalesTax);
        
        System.out.println("The total of the sale: "+ thetotaloftheSale);
}
}
