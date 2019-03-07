/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreview;


/**
 * A class that models vending machine items.
 * Items have a name and a price. The possible items are listed in the
 * array called Candies. Use this code to answer questions
 * B.1 and B.2 in the midterm review.
 * @author dancye, 2019
 * Another branch boys!
 */
public class VendingMachineItem 
{
    public double price;
    public final static String [] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public VendingMachineItem()
    {
        //intentionally left blank
    }
    
    /**
     * A getter method to return the item's price
     * @return the cost of the item
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * A setter for the price, allowing us to change the price of an item
     * @param givenPrice 
     */
    public void setPrice(double givenPrice)
    {
        price = givenPrice;
    }   
}
