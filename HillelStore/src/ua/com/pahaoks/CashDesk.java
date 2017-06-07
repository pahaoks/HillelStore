/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks;

import java.util.ArrayList;

/**
 *
 * @author lutsishinpa
 */
public class CashDesk {
    
    private final byte number;
    private Cashier cashier;
    private final ArrayList<Check> checkList = new ArrayList<>();
    private CashDeskState state;
    
    public CashDesk(byte number, Cashier cashier) {
        this.cashier = cashier;
        this.number = number;
        this.state = CashDeskState.opened;
    }
    
    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }
    
    public Cashier getCashier() {
        return this.cashier;
    }
    
    public CashDeskState getState() {
        return state;
    }
    
    private Check checkCart(Cart cart) {
        return null;
    }
    
    public Check handleCustomer(Customer customer) throws Exception {
        this.state = CashDeskState.closed;
        
        Check check = null;
        Cart cart = customer.getCart();
        int timeInterval = this.cashier.ScanCart(cart);
        double cartAmount = cart.getAmount();
        
        if (this.cashier != null) {
            check = new Check(timeInterval, cartAmount, this.cashier.getName(), this.number);
        } else {
            throw new Exception("Кассир не инициализирован");
        }
        
        this.state = CashDeskState.opened;
        
        return check;
    }
}
