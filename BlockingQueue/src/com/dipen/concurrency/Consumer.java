package com.dipen.concurrency;

import java.util.concurrent.BlockingQueue;

/**
 * Created by dipen on 4/4/2017.
 */
public class Consumer implements Runnable{
    BlockingQueue<Message> blockingQueue;

    public Consumer(BlockingQueue<Message> queue)
    {
        this.blockingQueue = queue;
    }

    public void run() {

        try {
            Message msg;
            //consuming messages until exit message is received
            while((msg =blockingQueue.take()).getMsg() != "exit"){
                Thread.sleep(10);
                System.out.println("Consumed "+msg.getMsg());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
