package com.company;

public class Account<N> {
    protected N id;
    protected double sum;

    public Account(N id, double sum) {
        this.id = id;
        this.sum = sum;
    }

    public N getId() {
        return id;
    }

    public void setId(N id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "com.company.Account [" + "id = " + id + ", sum = " + sum + ']';
    }
}
