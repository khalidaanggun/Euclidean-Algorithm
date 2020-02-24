package com.euclidean.kodillacourse;

public class GCD {
    public int numberA=0;
    public int numberB=0;
    public GCD(int numberA, int numberB){
        this.numberA= numberA;
        this.numberB= numberB;
    }
    public void countGCD(){
        int numberC=numberA % numberB;
            while(numberC!=0) {
            numberA=numberB;
            numberB=numberC;
            numberC=numberA%numberB;
            }
            System.out.println("GCD:"+numberB);
    }
}
