package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String string = "())(())";

        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            int count = 0;
            Parentheses p = new Parentheses();
            do {
                if (string.charAt(i+count) == '(') {
                    p.addOpening();
                } else {
                    p.addClosing();
                }
                count++;
            } while (p.getNumOpening() > p.getNumClosing() && i+count < string.length());

            if (p.getNumOpening() == p.getNumClosing()) {
                counts.add(count);
            }
        }

        //get max count from counts
        int max = 0;
        for (Integer i : counts) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("max count: " + max);
    }
}


class Parentheses {
    private int numOpening;
    private int numClosing;

    public Parentheses() {
        this.numOpening = 0;
        this.numClosing = 0;
    }

    public int getNumOpening() {
        return numOpening;
    }

    public int getNumClosing() {
        return numClosing;
    }

    public void addOpening() {
        this.numOpening++;
    }

    public void addClosing() {
        this.numClosing++;
    }
}
