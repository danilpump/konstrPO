package kpo_task4;

public class Customer {
    private String prod;
    private String addr;
    private String payD;

    public Customer(String prod, String addr, String payD) {
        this.prod = prod;
        this.addr = addr;
        this.payD = payD;
    }

    public String getProd() {
        return prod;
    }

    public String getAddr() {
        return addr;
    }

    public String getPayD() {
        return payD;
    }
}
