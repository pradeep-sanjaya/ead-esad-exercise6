package com.sliit;

public class MealOrder extends AbstractOrder {

    public MealOrder(Menu menu) {
        super(menu);
    }

    @Override
    public void execute () {
        menu.prepareMenu();
    }
}
