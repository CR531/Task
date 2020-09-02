package com.example.Task.RestController;

public class Grocery {
    private int coconuts;
    private int potatoes;

    public Grocery(int coconuts, int potatoes) {
        this.coconuts = coconuts;
        this.potatoes = potatoes;
    }
    @Override
    public String toString() {
        return "Grocery{" +
                "coconuts=" + coconuts +
                ", potatoes=" + potatoes +
                '}';
    }

    public int getCoconuts() {
        return coconuts;
    }

    public void setCoconuts(int coconuts) {
        this.coconuts = coconuts;
    }

    public int getPotatoes() {
        return potatoes;
    }

    public void setPotatoes(int potatoes) {
        this.potatoes = potatoes;
    }




}
