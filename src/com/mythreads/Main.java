/**
 * Java program to create, start, and get states of threads.
 */

package com.mythreads;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating threads.
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyThreadOne());

        // Starting threads.
        t1.start();
        t2.start();

        // Checking states of threads.
        System.out.println("Thread t1 is alive: " + t1.isAlive());
        System.out.println("State of thread t1: " + t1.getState());
        System.out.println("Thread t2 is alive:  " + t2.isAlive());
        System.out.println("State of thread t2: " + t2.getState());

        // Stopping threads for 30 mls.
        if (t1.isAlive()) {
            t1.interrupt();
        }

        if (t2.isAlive()) {
            t2.interrupt();
        }

        // Checking states of threads.
        System.out.println("Thread t1 is alive: " + t1.isAlive());
        System.out.println("Thread t2 is alive: " + t2.isAlive());

    }
}

// MyThread class.
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread extends example.");
    }

}

// MyThreadOne class.
class MyThreadOne implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread implements example.");
    }
}