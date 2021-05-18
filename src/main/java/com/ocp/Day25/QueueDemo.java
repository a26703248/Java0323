package com.ocp.Day25;

import java.util.LinkedList;
import java.util.Queue;


//佇列FIFO(Frist In Frist Out先進先出)
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("John");
        queue.offer("Mary");
        queue.offer("Helen");
        System.out.println("目前排隊的人: "+queue);
        String name=queue.poll();
        System.out.println("目前排隊的人: "+name);
        System.out.println("目前排隊的人: "+queue);
        
        name=queue.poll();
        System.out.println("目前排隊的人: "+name);
        System.out.println("目前排隊的人: "+queue);
        
        name=queue.poll();
        System.out.println("目前排隊的人: "+name);
        System.out.println("目前排隊的人: "+queue);
        
        System.out.println(queue.isEmpty());
        
        
        
        
        
        
        
        
    }
}
