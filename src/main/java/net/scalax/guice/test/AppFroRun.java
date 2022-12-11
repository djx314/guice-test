package net.scalax.guice.test;

public abstract class AppFroRun implements ResourceForApp {

    public void run() {
        System.out.println("Student Names:" + names().toString());
        System.out.println("Url Links:" + links().toString());
        System.out.println("Number Counts:" + counts().toString());
    }

}