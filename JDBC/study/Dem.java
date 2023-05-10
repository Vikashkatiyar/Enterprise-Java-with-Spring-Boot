package study;

 class Solution {
      static int x=10;
      static {
    	  x=20;
    	 
      }
      {
     x=30;
      }
      public static void main(String[] args) {
    	  System.out.println(x);
      }
        
        
    
}
