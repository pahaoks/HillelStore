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
public class FastCashier extends AbstractCashier implements Cashier {

    public FastCashier(String name) {
        this.speed = 60;
        this.name = name;
    }
    
    @Override
    public int ScanCart(Cart cart) {
        return super.ScanCart(cart);
    }

    @Override
    public int delay() {
        return 10;
    }

    @Override
    public String getName() {
        return this.name;
    }

    
}
