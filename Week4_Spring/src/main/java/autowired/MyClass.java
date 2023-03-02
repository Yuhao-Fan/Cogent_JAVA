package autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MyClass {
   @Autowired
   public MyDependency myDependency;
//   public MyClass(MyDependency myDependency) {
//	   this.myDependency = myDependency;
//	   System.out.println("created by constructor");
//	// TODO Auto-generated constructor stub
//	   
//   }
//   public MyClass() {
//	   System.out.println("created by constructor without parameter");
//   }

   public void doSomething() {
	  System.out.println("hi");
      System.out.println(myDependency.getMessage());
   }
}
