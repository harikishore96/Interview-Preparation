package com.silentanonym.interviewprep.designpattern;

public class Singleton implements Cloneable {

    private static volatile Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                Thread.sleep(5000);
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Singleton clone() {
        try {
            return getInstance();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
