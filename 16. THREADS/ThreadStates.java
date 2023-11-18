import java.io.*;
import java.util.*;

class ThreadStates{
    public static void main(String[] args){

        There are 5 different states of threads :--

                1. New        (Thread is created) 
                2. Runnable   (Waiting for the scheduler to schedule its execution)
                3. Running    (Actual execution is done in this state through processors)
                4. Waiting    (When the thread is in need of some file, or some external resources)
                5. Dead       (Stops its execution forever)


        Transitions between states and method calls :--

                New -> start() -> Runnable 
                Runnable -> run() -> Running 
                Running -> sleep() -> Waiting 
                Running -> wait() -> Waiting -> notify() -> Runnable -> run() -> Running 
                Running -> stop() -> Dead 
                Runnable -> stop() -> Dead 

    }
}