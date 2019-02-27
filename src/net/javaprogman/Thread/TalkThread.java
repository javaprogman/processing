package net.javaprogman.Thread;

public class TalkThread extends  Thread {

    @Override
    public void run() {
        for (int i=0; i < 10; i++) {
            System.out.println("Talking");

            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
