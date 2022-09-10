package com.example.demo.model;

public class Amount {
    private Long id;

    private Long id2;

    private int amount;

    public Amount() {
    }

    public Amount(Long id, Long id2, int amount) {
        this.id = id;
        this.id2 = id2;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId2() {
        return id2;
    }

    public void setId2(Long id2) {
        this.id2 = id2;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
