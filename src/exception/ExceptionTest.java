package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 2;
		
		try {
			System.out.println(n1 / n2);
			System.out.println("에러가 발생하지 않았습니다.");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("!!에러 발생!!");
		} finally {
			System.out.println("Finally는 반드시 실행");
		}
		System.out.println("Finally와는 다르다.");
	}
}



