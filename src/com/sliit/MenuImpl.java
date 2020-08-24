package com.sliit;

public class MenuImpl implements Menu {

    private String name;

    public MenuImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void prepareMenu() {
        System.out.println("Preparing " + getName() + " for the customer");
    }
}
