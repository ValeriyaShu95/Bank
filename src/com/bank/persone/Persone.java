package com.bank.persone;

public class Persone {
    private int id;
    private String name;
    public Bill[] bills;

    public Persone(int id, String name, Bill[] bills) {
        this.id = id;
        this.name = name;
        this.bills = bills;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bill[] getBills() {
        return bills;
    }

    public void setBills(Bill[] bills) {
        this.bills = bills;
    }
}
