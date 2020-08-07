package com.severin.homework_6;

import java.util.Random;


public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    public Random random = new Random();

    public Animal(String name){
        this.name = name;
    }

    public void run(int distance) {
        if (this.maxRun >= distance) System.out.println(this.type + " " + this.name + " run " + distance + " m.");
        else System.out.println(this.type + " " + this.name + " can't run so far.");
    }

    public void swim(int distance) {
        if (this.maxSwim >= distance) System.out.println(this.type + " " + this.name + " swim "
                + distance + " m.");
        else System.out.println(this.type + " " + this.name + " can't swim so far.");
    }

    public void jump(double height) {
        if (this.maxJump >= height)
            System.out.println(this.type + " " + this.name + " jump " + height + " m.");
        else System.out.println(this.type + " " + this.name + " can't jump so high.");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " meters, Swim: "
                + this.maxSwim + " meters, Jump: " + this.maxJump + " meters.");
    }
}