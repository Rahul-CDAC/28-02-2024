/*class Demo{
 void Demo(){
  System.out.println("inside zero parameter constructor");

}

   public static void main(String args[]){

    Demo obj = new Demo();
     obj.Demo();




}

} */

// void demo hai to call karna hai obj.Demo ke sth nahi to blank output hga.
//  sirf Demo constructor me aise hi ho jyega.





class Demo{

   int a=10;
   float b=20.0f;
   double c = 20.5;

   static int var1;

   


   Demo(){
   System.out.println("inside zero parameter constructor");
   a=100;
   b=100.5f;
}


   Demo(int a1,float b1, double c1){
   System.out.println("inside first parameter constructor");
   a=a1;
   b=b1;
   c=c1; 

  

}

//init block

{
System.out.println("inside init block");
a=1000;
b= 2000.0f;

var1=5000; 

}


  static    // ye ek baar execute hta hai wo bhi pahle.
{
  System.out.println("inside static block");
  var1=5;

  //a=10000;(nom static variable ko assign nahi kar skte.)
}
  

   //int a;

   public static void main(String args[]){

    Demo obj = new Demo();
    Demo obj1 = new Demo(5,5.5f,5.87);

   //System.out.println(a);

    System.out.println(obj.a);
    System.out.println(obj.b);
    System.out.println(obj.c);
    System.out.println(obj.var1);

    //obj.Demo();





}

}
