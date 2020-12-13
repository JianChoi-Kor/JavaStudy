package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		div(10, 2);
	}
	
	public static int div(int n1, int n2) {
		try {
			return n1 / n2;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("!!Finally!!");
		}
		System.out.println("--- 종료 ---");
		return 0;
	}
}




