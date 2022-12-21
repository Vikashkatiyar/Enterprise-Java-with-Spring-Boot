import java.io.*;

class Animal implements Serializable
{
    int i=10;
    Animal(){
        System.out.println("From Animal Constructor");
    }
    
}
class Dog extends Animal
{
   int j=20;
   Dog(){
    System.out.println("From Dog Constructor");
   }

}


class TestApp { 
    public static void main(String[] args)throws Exception
     {
        
       Dog d=new Dog();
        d.i=888;
        d.j=999;

        System.out.println("Serialization Started");
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
        System.out.println("Serialization ended");


        System.out.println();


        System.out.println("Deserialization Started");
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();
        System.out.println("Deserialization Ended");

        System.out.println(d1.i+" ---- "+d1.j);
        

    }
}