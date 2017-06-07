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
public class Check {
    public final int timeSec;
    public final double amount;
    public final String cashierName;
    
    public Check(int timeSec, double amount, String cashierName) {
        this.timeSec = timeSec;
        this.amount = amount;
        this.cashierName = cashierName;
    }
}
