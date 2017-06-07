/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks;

/**
 *
 * @author lutsishinpa
 */
public class LazyCashier extends AbstractCashier {
    
    public LazyCashier(String name) {
        this.speed = 10;
        this.name = name;
    }
    
    @Override
    public int ScanCart(Cart cart) {
        return super.ScanCart(cart) + delay();
    }

    @Override
    public int delay() {
        return 30;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
