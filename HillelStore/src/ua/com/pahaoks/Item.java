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
public class Item {
    public String name;
    public float price;
    public int qty;
    
    public Item(String name, int qty, float price) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
}
