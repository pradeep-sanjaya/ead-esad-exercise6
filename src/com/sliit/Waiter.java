package com.sliit;

public class Waiter {

    private Order juice;
    private Order meal;
    private Order dessert;

    void setOrder(Order juice, Order meal, Order dessert) {
        this.juice   = juice;
        this.meal    = meal;
        this.dessert = dessert;
    }

    void selectJuice() {
        juice.execute();
    }

    void selectMeal() {
        meal.execute();
    }

    void selectDessert() {
        dessert.execute();
    }
}
