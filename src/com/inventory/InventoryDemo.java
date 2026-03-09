package com.inventory;

public class InventoryDemo
{
     void main()
     {
        
        String itemName = IO.readln();
        double pricePerUnit=Double.parseDouble(IO.readln());
        int quantityInStock=Integer.parseInt(IO.readln());
        String updation=IO.readln().toUpperCase();

        Inventory A = new Inventory(itemName,pricePerUnit,quantityInStock);
        IO.println("Inventory Item Details:");
        IO.println(A);
        IO.println("Total Inventory Value: "+String.format("%.2f",A.calculateTotalValue()));
        IO.println("Any updation in Stock Price OR Quantity :"+updation);
        if (updation.equalsIgnoreCase("yes"))
        {
            double updatedPricePerUnit=Double.parseDouble(IO.readln());
            int updatedQuantityInStock=Integer.parseInt(IO.readln());
            A.setPricePerUnit(updatedPricePerUnit);
            A.setQuantityInStock(updatedQuantityInStock);
            IO.println("\nUpdated Inventory Item Details:");
            IO.println(A);
            IO.println("Total Inventory Value: "+String.format("%.2f",A.calculateTotalValue()));





        }

     }
}

class Inventory
{
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;

    public Inventory(String itemName,double pricePerUnit,int quantityInStock)
    {
        this.itemName=itemName;
        this.pricePerUnit=pricePerUnit;
        this.quantityInStock=quantityInStock;
    }

    public String getItemName()
    {
        return itemName;
    }
    public void setItemName(String itemName)
    {
        this.itemName=itemName;
    }
    public double  getPricePerUnit()
    {
        return pricePerUnit;
    }
    public void setPricePerUnit(double pricePerUnit)
    {
        this.pricePerUnit=pricePerUnit;
    }
    public int getQuantityInStock()
    {
        return quantityInStock;
    }
    public void setQuantityInStock(int quantityInStock)
    {
        this.quantityInStock=quantityInStock;
    }

    public double calculateTotalValue()
    {
        return pricePerUnit*quantityInStock;
    }

    public String toString()
    {
        return "Item Name: "+itemName+"\nPrice Per Unit: "+pricePerUnit+"\nQuantity in Stock: "+quantityInStock;
    }
}