/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lutsishinpa
 */
public class Main {
    public static void main(String[] args) {
        AbstractStore store = AbstractStore.construct(StoreType.grocery, 1);
        store.open();
        
        LinkedList<Customer> customers = new LinkedList<>(); 
        int customersQty = 10;
        
        for (int i = 0; i < customersQty >> 1; i++) {
            customers.add(
                new PatientCustomer(
                    new Cart(
                        new Item[] { new Item("Картошка", 1, 9.99f),
                                     new Item("Хлеб", 2, 7.56f),
                                     new Item("Молоко", 1, 18.0f) })));
        }
        
        for (int i = 0; i < 10; i++) {
            customers.add(
                new ShortTemperedCustomer(
                    new Cart(
                        new Item[] { new Item("Мясо", 1, 100.99f),
                                     new Item("Водка", 2, 70.56f),
                                     new Item("Колбаса", 1, 120.00f) })));
        }
        
        store.handleCustomer(customers);
        
    }
}
