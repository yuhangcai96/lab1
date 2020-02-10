
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class cookie {
     public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        JOptionPane.showMessageDialog(null,"Enter the number of cookies you ate");
        
        float numberofCookies= keyboard.nextFloat();
        float theTotalnumberofcalories = ( 300/(40/10)*numberofCookies);
        
        System.out.println("Each cookie contains 75 calories");
        
        System.out.println("The number of cookies you ate:"+numberofCookies);
         
        System.out.println("The total number of calories consumed:"+theTotalnumberofcalories);
}
}
