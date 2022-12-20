package kpo_task4;

import java.util.HashMap;

public class Store {
    private StoreHouse storeHouse;
    private Bank bank;
    private Delivery delivery;
    private Customer customer;

    void init(){ // Создаем HashMap ассортимента магазина, ценников и балансов клиентов, а затем подаем в соотв. конструкторы
        HashMap <String, Integer> assort = new HashMap<>();
        HashMap <String, Integer> prices = new HashMap<>();
        HashMap <String, Integer> balances = new HashMap<>();

        assort.put("Computer", 2);
        assort.put("Notebook", 1);
        prices.put("Computer", 200);
        prices.put("Notebook", 180);
        balances.put("123card", 200);

        storeHouse = new StoreHouse(assort);
        bank = new Bank(prices,balances,0);
        delivery = new Delivery();
        customer = new Customer("Notebook","Addres","123card");
    }

    void doSale() {
        init();

        if (storeHouse.checkProduct(customer.getProd())) {
            if (bank.makeTransaction(customer.getProd(), customer.getPayD())) {
                delivery.shipProduct(storeHouse.passProduct(customer.getProd()), customer.getAddr());
            } else {
                System.out.println("Not enough money");
            }
        } else {
            System.out.println("No product left");
        }
    }
}
