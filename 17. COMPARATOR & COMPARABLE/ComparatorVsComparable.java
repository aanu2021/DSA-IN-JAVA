import java.io.*;
import java.util.*;

// Comparator -> override compare(o1,o2) method 
// Comparable -> implements compareTo(o2) method

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override     // Annonations
    public String toString(){
        return new String("Name : " + name + ", Age : " + age);
    }
    public int compareTo(Student s){
        return this.age - s.age;
    }
}

class ComparatorVsComparable{
    public static void main(String[] args){
        List<Integer>nums = new ArrayList<>();
        nums.add(45);
        nums.add(27);
        nums.add(42);
        nums.add(18);
        nums.add(67);
        nums.add(65);
        System.out.println(nums);

        // Collections.sort(nums);

        // Comparator is an interface, which helps to sort on the basis of some customized logic.
        nums.sort(new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                return (i%10)-(j%10);
            }
        });

        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                return (i%10)-(j%10);
            }
        };
        Collections.sort(nums, comp);

        System.out.println(nums);

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20,"Anumoy"));
        students.add(new Student(22,"Kunal"));
        students.add(new Student(21,"Manas"));
        students.add(new Student(20,"Rohit"));

        // System.out.println(students);

        // for(Student s : students){
        //     System.out.println(s.toString());
        // }

        // students.sort(new Comparator<Student>(){
        //     public int compare(Student s1, Student s2){
        //         return s1.age - s2.age;
        //     }
        // });

        Collections.sort(students);

        // for(Student s : students){
        //     System.out.println(s.toString());
        // }

        int[] arr = {10, 2, 5, 3, 7};

        // Create a custom comparator
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // Sort in descending order
            }
        };

        // Sort the array using the custom comparator
        // Arrays.sort(arr, comparator);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}