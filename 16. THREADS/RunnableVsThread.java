import java.io.*;
import java.util.*;

// Runnable -> interface, containing only run() method, which is also 
//             the entry point of a new thread execution.
// When we want to inherit some properties from the parent class
// in our current class, along with extending the Thread class, then
// to avoid multiple inheritance situation, we can implement from the 
// Runnable interface. (Thread implements Runnable interface),

class P{

}

// Functional Interface
// class A extends P implements Runnable{     
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("A");
//             try{
//                 Thread.sleep(50);
//             }catch(Exception e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }

// Functional Interface
// class B extends P implements Runnable{     
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("B");
//             try{
//                 Thread.sleep(50);
//             }catch(Exception e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }

class RunnableVsThread{
    public static void main(String[] args){
        //  A obj1 = new A();
        //  B obj2 = new B();
        // Anonymous Inner Class -> Functional Interface -> Lambda Expression
         Runnable obj1 = () -> 
         {
            for(int i=0;i<5;i++){
                System.out.println("A");
                try{
                    Thread.sleep(50);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
         };  
         Runnable obj2 = () -> {
            for(int i=0;i<5;i++){
                System.out.println("B");
                try{
                    Thread.sleep(50);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
         };
         // As Runnable interface doesn't have the start() method in it.
         Thread t1 = new Thread(obj1); // constructor with runnable object
         Thread t2 = new Thread(obj2); // constructor with runnable object
         t1.start();
         t2.start();
    }
}