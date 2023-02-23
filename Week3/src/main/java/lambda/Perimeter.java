package lambda;


@FunctionalInterface 
public interface Perimeter {
	void parameter2(int a,int b);
	default void show() {
		System.out.println("default method");
	}
}
