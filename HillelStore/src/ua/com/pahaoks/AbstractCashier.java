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
public abstract class AbstractCashier implements Cashier {
    public int speed; //Items per minute
    public String name;

    @Override
    public int ScanCart(Cart cart) {
        return cart.toList().size() * (60 / this.speed);
    }
    
    public abstract int delay();
 
}
