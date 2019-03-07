/*
 * Raymond Hua
 * Student ID: 991 485 288
 * SYST10199 - Web Programming
 */
package midtermreview;

import java.util.Scanner;
import static midtermreview.VendingMachineItem.candies;

/**
 *
 * @author raymo
 */
public class VendingMachineSimulator {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the vendin machine, here is a list of the possible candies");
        for(int i=0; i<candies.length; i++)
        {
            System.out.println(candies[i]);
        }
        System.out.println("To re-fill the vending machine, please follow instructions in program 2");
        //there is no program 2 because we haven't created an approprite design for this code yet!
    }
    
}
