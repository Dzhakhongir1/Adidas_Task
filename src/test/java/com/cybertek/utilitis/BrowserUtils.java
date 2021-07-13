package com.cybertek.utilitis;

public class BrowserUtils {
    /*
     method that will accept integer
     wait for given seconds duration
      */
    public static void sleep(int seconds)  {
        seconds*=1000;

        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Something happened ");
        }
    }
}
