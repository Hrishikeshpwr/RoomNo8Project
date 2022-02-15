import java.util.Scanner;
class TestBox
{
  public static void main(String[] args)
  {
//   Edit testBox class  by saurabh 

 //create scanner's instance to wrap std i/p
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter Box dimensions : w d h");
//int data=100;
    Box box1;//box1 : ref type of var(class type of ref), no obj created so far, method local var : 
//mem allocated on the stack : how many bytes : as per JVM spec.
  //  System.out.println(box1); javac err
     box1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//Box class gets loaded in meth area //it's instance is created in the heap.
     //print box dims
     System.out.println("Box 1 dims "+box1.getBoxDimensions());
    //print box volume
//askfnasjfsjhfsjfhsdjkfskfsdkjfdsj
//sdfsdfjfs fkeq,vk'pitc,gunkljdrf,eomckkf, hc,kocjjh
   //  System.out.println("Box 1 dims "+box1.getBoxDimensions());//java.lang.NullPointerException

    //close scanner 
    sc.close();
System.out.println("Name :");
     System.out.println("main over...");
  }
}