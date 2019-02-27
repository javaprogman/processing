package net.javaprogman.Thread;

import java.util.Date;

public class T1 {

    public static void main(String[] args) {

        int i;
        int j;

        Tr t1 = new Tr("Thread1");
        Tr t2 = new Tr("Thread2");


        t1.start();
        t2.start();


    }


}


class Tr extends Thread {

    public Tr(String name) {
        super(name);
    }

    public void run() {

        Date date = new Date();
        for (int i = 0; i < 10; i++) {
            try {
                this.sleep(500);
                System.out.println("Time : " + date.getTime());

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


}
