import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;  // function.Predicate, function.Function

class Main{
    public static void main(String[] args){
        List<Integer>nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(5);
        // Stream<Integer>s1 = nums.stream();
        // s1.forEach(n -> System.out.println(n));
        
        // Functional Interface
        Predicate<Integer> p = new Predicate<Integer>(){
            public boolean test(Integer n){
                return n%2 == 0;
            }
        };
        //  Predicate<Integer> p = n -> n%2 == 0;


        // Functional Interface
        Function<Integer,Integer> func = new Function<Integer,Integer>(){
            public Integer apply(Integer n){
                return n*2;
            }
        };
        // Function<Integer,Integer> func = (n) -> n*2;


        int result = nums.stream().filter(p).map(func).reduce(0,(c,e)->c+e);
        System.out.println(result);

        Stream<Integer> st = nums.stream().filter(n -> n%2 != 0).map(n -> n*3).sorted();
        st.forEach(n -> System.out.println(n));
    }
}