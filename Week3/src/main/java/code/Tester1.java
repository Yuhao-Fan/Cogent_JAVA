package code;

class A  
{  
 protected String msg="Try to access the private variable outside the class";  
       
}  

class B extends A{
	
}
public class Tester1 {  
public static void main(String[] args) {  
    B a=new B();  
   System.out.println(a.msg);  
      
}  
}  