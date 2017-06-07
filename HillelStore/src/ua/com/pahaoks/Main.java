/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks;

import java.util.LinkedList;

/**
 *
 * @author lutsishinpa
 */
public class Main {
    public static void main(String[] args) {
        AbstractStore store = AbstractStore.construct(StoreType.grocery, 1);
        store.open();
        
        store.getCashDesk(0).setCashier(new FastCashier("Вася"));
        
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
        
        store.handleCustomer(customers);
        customers = new LinkedList<>();
        store.getCashDesk(0).setCashier(new LazyCashier("Петя"));
        
        for (int i = 0; i < customersQty >> 1; i++) {
            customers.add(
                new ShortTemperedCustomer(
                    new Cart(
                        new Item[] { new Item("Мясо", 1, 100.99f),
                                     new Item("Водка", 2, 70.56f),
                                     new Item("Колбаса", 1, 120.00f) })));
        }
        
        store.handleCustomer(customers);
        
        System.out.println("Общая выручка магазина: " + store.getAmount() + " грн.");
        System.out.println("Время Васи за кассой: " + store.getCashierTimeInterval("Вася") + " c.");
        System.out.println("Время Пети за кассой: " + store.getCashierTimeInterval("Петя") + " c.");
        
        store.close();
    }
}
