
//Singleton class
class Demo{
    private static Demo d=null;
    private Demo(){};//to avoid object creation by the user using new keyword
    public static Demo getDemo(){
        if(d==null){
            d=new Demo();
        }
        return d;
    }
}
// hello
class Test{
    public static void main(String[] args) {
        //static factory methods
        Demo d1=Demo.getDemo();
        Demo d2=Demo.getDemo();

        System.out.println(d1.hashCode()==d2.hashCode());
        System.out.println(d1.hashCode()+"_____"+d2.hashCode());

    }
}