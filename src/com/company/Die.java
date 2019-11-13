package com.company;

public class Die {
    private int roll;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());


    }

    public int getNumDots() {
        return roll;
    }

    public void roll(){
        roll = (int)(Math.random()*6 +1);
    }
}

