package com.sliit;

public class Customer {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        Menu juice   = new MenuImpl("Orange Juice");
        Menu meal    = new MenuImpl("Noodle");
        Menu dessert = new MenuImpl("Ice cream");

        Order juiceOrder   = new JuiceOrder(juice);
        Order mealOrder    = new MealOrder(meal);
        Order dessertOrder = new DessertOrder(dessert);

        waiter.setOrder(juiceOrder, mealOrder, dessertOrder);
        waiter.selectJuice();
        waiter.selectMeal();
        waiter.selectDessert();

    }
}
