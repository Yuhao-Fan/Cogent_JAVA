package p2;

  
// import all classes in package p1
import p1.*;
  
// Class B is a subclass of A
class D extends A {
    public static void main(String args[])
    {
        D d = new D();
//        d.display();
        d.protected_display();
    }
}