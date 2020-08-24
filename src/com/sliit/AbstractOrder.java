package com.sliit;

public abstract class AbstractOrder implements Order {

    Menu menu;

    public AbstractOrder(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
