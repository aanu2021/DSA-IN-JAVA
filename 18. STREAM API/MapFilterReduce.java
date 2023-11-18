import java.io.*;
import java.util.*;
import java.util.stream.Stream;        // Mandatory to import it.
import java.util.function.Predicate;  // Mandatory to import it.
import java.util.function.Function;  // Mandatory to import it.

// Stream -> once used, further can't be used again.
// map
// filter
// reduce

class MapFilterReduce{
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(2,4,3,1,5,7,6);
        int total = 0;
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0,(c,e)->c+e);
        System.out.println(result);

        // one liner code to implement all map, filter, reduce methods
        int answer = nums.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0,(c,e)-> c+e);
        System.out.println(answer);

        // Analyze all the inner-conceptions behind the implementation of map, filter, reduce methods
        
        // Predicate -> is used inside filter method
        // Functional Interface -> Lambda Expression
        Predicate<Integer> p = new Predicate<Integer>(){
            public boolean test(Integer n){
                if(n%2 == 0) return true;
                else return false;
            }
        };

        // Function -> is used inside map method
        // Functional Interface -> Lambda Expression
        Function<Integer,Integer> func = new Function<Integer,Integer>(){
            public Integer apply(Integer n){
                return n*2;
            }
        };

        int ans = nums.stream().filter(p).map(func).reduce(0,(c,e)->c+e);
        System.out.println(ans);

        // for(int n : nums){
        //     if(n%2 == 0){
        //         n *= 2;
        //         total += n;
        //     }
        // }
        // System.out.println(nums);
        // System.out.println(total);
    }
}