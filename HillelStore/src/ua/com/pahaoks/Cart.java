/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lutsishinpa
 */
public class Cart {
    private final ArrayList<Item> items = new ArrayList<>();
    
    public Cart(Item[] items) {
        this.items.addAll(Arrays.asList(items));
    }
  
    public void addToCart(Item item) {
        items.add(item);
    }
    
    public void removeFromCart(Item item) {
        items.remove(item);
    }
    
    public List<Item> toList() {
        return items;
    }
    
    public double getAmount() {
        double result = 0;
        for (Item item : items) {
            result += item.price * item.qty;
        }
        return result;
    }
    
    
}
