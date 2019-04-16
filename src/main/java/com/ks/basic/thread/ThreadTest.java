package com.ks.basic.thread;

/**
 * @author Ahil
 */
public class ThreadTest
{
    public static void main(String[] args)
            throws InterruptedException
    {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        Thread thread3 = new Thread(new MyThread());

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();
    }
}

class MyThread implements Runnable
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println("Thread started, name: " + name);
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread ended, name: " + name);
    }
}
