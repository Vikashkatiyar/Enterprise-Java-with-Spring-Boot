package com.boot.methodRef;

import java.util.Arrays;

public class SampleTest {
   public static void test(String ... args) {
	   System.out.println("FROM methodRef:: "+Arrays.asList(args));
   }
}
