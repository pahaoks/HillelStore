/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lutsishinpa
 */
public abstract class AbstractStore implements Store {
    private String name;
    private StoreState state;
    private StoreType type;
    private final ArrayList<CashDesk> cashDesks = new ArrayList<>();
    private final ArrayList<Check> checks = new ArrayList<>();
    
    public AbstractStore(int cashDesksQty) {
        for (int i = 0; i < cashDesksQty; i++) {
            cashDesks.add(new CashDesk((byte)(i + 1), new FastCashier("Вася")));
        }
    }
    
    public static AbstractStore construct(StoreType type, int cashDesksCount) {
        switch (type) {
            case grocery: return new GroceryStore(cashDesksCount);
            default: return null;
        }
    }
    
    @Override
    public void open() {
        this.state = StoreState.open;
    }

    @Override
    public void close() {
        this.state = StoreState.close;
    }

    @Override
    public void handleCustomer(Customer customer) {
        for (CashDesk cd : cashDesks) {
            if (cd.getState() == CashDeskState.opened) {
                try {
                    checks.add(cd.handleCustomer(customer));
                } catch (Exception ex) {
                    Logger.getLogger(AbstractStore.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void handleCustomer(Collection<Customer> customers) {
        customers.forEach((c) -> {
            this.handleCustomer(c);
        });
    }
    
    public abstract boolean printCheck();
    public abstract String getStoreType();
    
    public double getAmount() {
        double ret = 0;
        for (Check c : checks) {
            ret += c.amount;
        }
        return ret;
    }
    
}
