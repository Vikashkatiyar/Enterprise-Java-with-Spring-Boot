package com.api_stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.*;

//1.Stream is faster than other  normal Collections
//2.one object of Stream does not used second time 
//3.Stream make sure to work with multiple threads 
//4.Stream also make sure to do not change the original data 

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> nums=Arrays.asList(6,7,3,2,5,7,9,10,3);
  
     
//Stream comes into picture java 1.8     
//     Stream<Integer> stream=nums.stream();
     
//     Consumer<Integer> consumer=new Consumer<Integer>(){
//    	 public void accept(Integer i){
//    		 System.out.print(i+"->");
//    	 }
//     };
//     stream.forEach(consumer);
     
     
     
//     Predicate<Integer> predicate=new Predicate<Integer>(){
//    	public boolean test(Integer n){
//    		return n%2==1;
//    	}
//     };
//     >>>this code written with the help of lambda function
//       Predicate<Integer> predicate=n->n%2==1;
     
     
//     Stream<Integer> stream1=nums.stream();
//     //second time stream1 does not use so we create Stream2
//     Stream<Integer> stream2=stream1.filter(n->n%2==1);
//     Stream<Integer> stream3=stream2.map(n->n*2);
//     int res=stream3.reduce(0,(s,e)->s+e);
//     System.out.println(res);
     
     
//  parallelStream()-> used multiple thread for finish his work
//  stream() -> it is bit slower than parallelStream() method
     //it also used single thread to finish his work
     int res=nums.parallelStream()
    		 .filter(n-> n%2==1)
    		 .map(n-> n*2).reduce(0, (s,e)->s+e);
     System.out.println(res);
     
     //1.Intermediate function -> ex.filter,map > function which output is dependent on other work
                    //chilling function
     //2.Terminate function-> ex.reduce > it give you value it does own work on time
     
     //stream3.forEach(n-> System.out.print(n+" "));
//     System.out.println(stream);
	}

}
