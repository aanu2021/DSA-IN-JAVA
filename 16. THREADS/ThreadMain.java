import java.io.*;
import java.util.*;

// start -> run
// When you call the start() method, a new thread is created and 
// the code inside the run() method is executed in the new thread. 
// The start() method returns immediately and the new thread normally 
// continues until the run() method returns.

// Highest Priority = 10
// Lowest Priority = 1
// Normal Priority = 5

// We can only suggest the scheduler regarding the priority of thread executions.
// But we can never take the final decision.

// sleep() = pause the execution of the current thread for a specifier number of times.

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("A");
            try{
                Thread.sleep(10); // 10 miliseconds
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("B");
            try{
                Thread.sleep(10); // 10 miliseconds
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class ThreadMain{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
        
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());

        obj1.setPriority(Thread.MIN_PRIORITY); // 10
        obj2.setPriority(Thread.MAX_PRIORITY); // 1
        // obj1.setPriority(Thread.NORM_PRIORITY); // 5

        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());

    }
}