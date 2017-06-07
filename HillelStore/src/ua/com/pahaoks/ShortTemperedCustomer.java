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
public class ShortTemperedCustomer extends AbstractCustomer implements Customer {

    public ShortTemperedCustomer(Cart cart) {
        super(cart);
    }
    
    @Override
    public void addToCart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pay() {
        System.out.println("You asshole. Hurry up, I'm late");
    }

    @Override
    public Cart getCart() {
        return super.getCart();
    }
    
}
