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
public class PatientCustomer extends AbstractCustomer implements Customer{

    public PatientCustomer(Cart cart) {
        super(cart);
    }
    @Override
    public void addToCart() {
       
    }

    @Override
    public void pay() {
        System.out.println("Don't hurry, I can wait");
    }

    @Override
    public Cart getCart() {
        return super.getCart();
    }
    
}
