package sec04;

/**
 * 키보드에서 캐릭터(char)를 읽어들이는 예제
 * import 구문으로 자바 API사용
 */
import java.io.IOException;

public class Read01KeyCode { // class s

	public static void main(String[] args) throws IOException { // main s
		int keCode;
		
		keCode = System.in.read();		// key 하나의 값을 받아드리는것
		System.out.println("keyCode: " + keCode);
		
		keCode = System.in.read();
		System.out.println("keyCode: " + keCode);
		
		keCode = System.in.read();
		System.out.println("keyCode: " + keCode);
		
		
	} // main e

} // class e
