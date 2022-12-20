package kpo_task4;

import java.util.HashMap;

public class StoreHouse {
    private HashMap<String, Integer> storeHouse;

    public StoreHouse(HashMap<String, Integer> storeHouse) {
        this.storeHouse = storeHouse;
    }

    boolean checkProduct(String product) {
        if (storeHouse.size()==0) return false;
        else return storeHouse.get(product) > 0;
    }

    String passProduct(String product) {
        storeHouse.put(product, storeHouse.get(product) - 1);
        return product;
    }
}
