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
public class AbstractCustomer {
    private Cart cart;
    
    public AbstractCustomer(Cart cart) {
        this.cart = cart;
    } 
    
    public Cart getCart() {
        return cart;
    }
}
