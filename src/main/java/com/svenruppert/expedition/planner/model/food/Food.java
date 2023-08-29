package com.svenruppert.expedition.planner.model.food;

import com.svenruppert.expedition.planner.model.Item;

import java.time.LocalDate;

public class Food extends Item {

    private LocalDate expiryDate;
    private int kcalPerHundredGramm;
    private int kcalInTotal;
    private boolean dehydrated;


    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getKcalPerHundredGramm() {
        return kcalPerHundredGramm;
    }

    public void setKcalPerHundredGramm(int kcalPerHundredGramm) {
        this.kcalPerHundredGramm = kcalPerHundredGramm;
    }

    public int getKcalInTotal() {
        return kcalInTotal;
    }

    public void setKcalInTotal(int kcalInTotal) {
        this.kcalInTotal = kcalInTotal;
    }

    public boolean isDehydrated() {
        return dehydrated;
    }

    public void setDehydrated(boolean dehydrated) {
        this.dehydrated = dehydrated;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expiryDate=" + expiryDate +
                ", kcalPerHundredGramm=" + kcalPerHundredGramm +
                ", kcalInTotal=" + kcalInTotal +
                ", dehydrated=" + dehydrated +
                '}';
    }
}
