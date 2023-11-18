import java.io.*;
import java.util.*;

// Race Condition -> Multiple thread accessing same shared resouces 
//                   at the same point of time, causing issues.
// join()  =  it is used to stop the execution of further mentioned
//            statements, before the execution of multiple threads (main thread is waiting here)
// synchronized  =  given function can be used by exactly one thread at any instance. 

class Counter{
    int counter;
    Counter(){
        counter = 0;
    }
    public synchronized void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
}

class RaceCondition{
    public static void main(String[] args) throws Exception{

         Counter c = new Counter();

        // Anonymous Inner Class -> Functional Interface -> Lambda Expression
         Runnable obj1 = () -> 
         {
            for(int i=0;i<10000;i++){
                c.increment();
            }
         };  
         Runnable obj2 = () -> {
            for(int i=0;i<10000;i++){
                c.increment();
            }
         };
         // As Runnable interface doesn't have the start() method in it.
         Thread t1 = new Thread(obj1); // constructor with runnable object
         Thread t2 = new Thread(obj2); // constructor with runnable object

         t1.start();
         t2.start();

         t1.join();  // wait before executing the below codes
         t2.join();  // let thread t1, t2 complete their execution first.

         System.out.println(c.getCounter());
        //  System.out.println(c.getCounter());
        //  System.out.println(c.getCounter());
    }
}