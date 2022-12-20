package kpo_task4;

import java.util.HashMap;

public class Bank {
    private HashMap<String, Integer> prices;
    private HashMap<String, Integer> balances;

    private Integer sellerBalance;

    public Bank(HashMap<String, Integer> prices, HashMap<String, Integer> balances, Integer sellerBalance) {
        this.prices = prices;
        this.balances = balances;
        this.sellerBalance = sellerBalance;
    }

    boolean makeTransaction(String product, String paymentData) {
        Integer price = prices.get(product);
        Integer balance = balances.get(paymentData);
        if (balance - price < 0) {
            return false;
        } else {
            balances.put(paymentData, balance - price);
            sellerBalance += price;
            return true;
        }
    }
}
