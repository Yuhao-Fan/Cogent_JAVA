package exam;

public class ExamPortal {
	static int noq;
	public ExamPortal() {
		super();
		System.out.println(this.type);
		System.out.println(this.result);
	}
	int type;
	int result;
	void addques(int q) {
		if(q>100) {
			for (int i = 1; i < 100; i++) {
				System.out.println(i);
			}
		}
	}
	void displayques(boolean odd){
		for (int i = 500; i < 1000; i++) {
			if(i%2==(odd ? 1 : 0)) {
				System.out.println(i);
			}
		}
	}
	static void showresult(int num) {
		noq = num;
		if(noq>=40) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
	}
}
