package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheese;
    private int extraToppings;
    private int paperBag;
    private boolean checkExtraaCheese;
    private boolean checkExtraaToppings;

    private boolean checkTakeway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheese=80;
        if(isVeg){
            this.price=300;
            this.extraToppings=70;
        }
        else{
            this.price=400;
            this.extraToppings=120;
        }
        this.paperBag=20;
        this.bill="Base Price Of The Pizza: "+this.price;
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
            this.price=this.price+this.extraCheese;
            this.bill += "\nExtra Cheese Added: " + this.extraCheese;
            checkExtraaCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!checkExtraaToppings) {

            this.price=this.price+this.extraToppings;
            this.bill += "\nExtra Toppings Added: " + extraToppings;
            checkExtraaToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!checkTakeway) {
            this.price=this.price+this.paperBag;
            this.bill += "\nPaperbag Added: " +this.paperBag;
            checkTakeway=true;
        }

    }

    public String getBill(){
        // your code goes here
        this.bill += "\nTotal Price: " + this.price + "\n";
        return this.bill;
    }
}
