/*
 * Raymond Hua
 * Student ID: 991 485 288
 * SYST10199 - Web Programming
 * Removed the scanner.
 * The VendingMachineItems classes are loosely coupled because the simulator is only focusing on being the interface for the user, while 
 * VendingMachineItem classs is the system that provides the items and specfies the prices. Because they are polarizing functionalites in 
 * the system, they become dependent on each other because they each other speciality in order for the entire program function as a unit. 
 * Also, because each class as different responsibilites, then the entire program is highly cohesive since each class is only performing tasks
 * related to it's concept/main responsibility, and will therefore allow for more flexibility since adding features won't change the entire 
 * implementation of the VendingMachine object. 
 * Fetch boy!
 */
package midtermreview;

import static midtermreview.VendingMachineItem.candies;

/**
 *
 * @author raymo
 */
public class VendingMachineSimulator {
     public static void main(String[] args)
     {
        System.out.println("Welcome to the vendin machine, here is a list of the possible candies");
        for(int i=0; i<candies.length; i++)
        {
            System.out.println(candies[i]);
        }
        System.out.println("To re-fill the vending machine, please follow instructions in program 2");
        //there is no program 2 because we haven't created an approprite design for this code yet!
    }
    
}
