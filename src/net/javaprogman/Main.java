package net.javaprogman;

import net.javaprogman.Thread.TalkThread;
import net.javaprogman.Thread.WalkRunnable;

public class Main {

    public static void main(String[] args) {

        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());

        talk.start();
        walk.start();
	// write your code here
    }
}
