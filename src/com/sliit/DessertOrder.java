package com.sliit;

public class DessertOrder extends AbstractOrder {

    public DessertOrder(Menu menu) {
        super(menu);
    }

    @Override
    public void execute() {
        menu.prepareMenu();
    }
}
