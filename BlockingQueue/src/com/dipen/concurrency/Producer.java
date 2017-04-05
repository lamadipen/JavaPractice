package com.dipen.concurrency;

import java.util.concurrent.BlockingQueue;

/**
 * Created by dipen on 4/4/2017.
 */
public class Producer implements Runnable {

    BlockingQueue<Message> blockingQueue;

    public Producer(BlockingQueue<Message> queue)
    {
        this.blockingQueue = queue;
    }

    @Override
    public void run() {

        //produce messages
        for(int i=0; i<100; i++){
            Message msg = new Message(""+i);

            try {
                Thread.sleep(i);
                blockingQueue.put(msg);
                System.out.println("Produced "+msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //adding exit message
        Message msg = new Message("exit");
        try {
            blockingQueue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
