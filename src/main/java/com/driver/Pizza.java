package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int totalBill;
    private boolean checkExtraaCheese;
    private boolean checkExtraaToppings;

    private boolean checkTakeway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        this.bill="Base Price Of The Pizza: "+getPrice();
        this.totalBill=this.price;
        this.checkExtraaCheese=false;
        this.checkExtraaToppings=false;
        this.checkTakeway=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!checkExtraaCheese) {
            price = 80;
            totalBill += price;
            this.bill += "\nExtra Cheese Added: " + getPrice();
            checkExtraaCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!checkExtraaToppings) {
            if (isVeg) {
                price = 70;
            } else {
                price = 120;
            }
            totalBill += price;
            this.bill += "\nExtra Toppings Added: " + getPrice();
            price=totalBill;
            checkExtraaToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!checkTakeway) {
            price = 20;
            totalBill += price;
            this.bill += "\nPaperbag Added: " + getPrice();
            checkTakeway=true;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill+="\nTotal Price: "+totalBill+"\n";
        return this.bill;
    }
}
