package com.sliit;

public class JuiceOrder extends AbstractOrder {

    public JuiceOrder(Menu menu) {
        super(menu);
    }

    @Override
    public void execute () {
        menu.prepareMenu();
    }
}
