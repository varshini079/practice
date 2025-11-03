class Calculator{
  int add(int n1,int n2){
    System.out.println("in Calcualtor class");
    return n1+n2;
 }
}
//u cannot write print staement directly in class use instance bloacks "{}"
public class classobj{
    public static void  main(String args[]){
        int num1=10;
        int num2=14;
      //  add() does not work
      //Calculator.add(num1,num2); Cannot make a static reference to the non-static method add(int, int) from the type Calculator
      //static methods no need obj reference but non static methods need it
      Calculator c=new Calculator(); //c is ref variable
      c.add(num1, num2); //only prints statements i.e is return is not stored so no display; but directly printing method also works
      System.out.println("hello");
      int result=c.add(num1, num2);
      System.out.println("result" +" "+result +" is "+c.add(15,20));
    }
}
