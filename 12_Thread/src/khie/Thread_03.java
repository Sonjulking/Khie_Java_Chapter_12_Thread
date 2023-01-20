package khie;

/*
 * 2.Runnable 인터페이스를 구현(implements)하여 사용하는 방법.
 *  1)Runnable 인터페이스를 구현(implements).
 *  2)run() 추상메서드를 재정의
 *  3) 스레드 클래스(자식 클래스)  객체 생성
 *  4)Thread 클래스 객체 생성.
 *   =>Thread 클래스의 생성자 인자에 스레드 클래스(자식 클래스) 의 참조 변수를 기재
 *  5)Thread 클래스의 참조변수.Start() 메서드 호출.
 */

//1)Runnable 인터페이스를 구현
class Runnable1 implements Runnable {

	// run() 추상메서드를 재정의
	@Override
	public void run() {

		int i = 1;

		while (true) {
			System.out.println("i >>> " + i);
			i++;
		}

	}

}

class Runnable2 implements Runnable {

	@Override
	public void run() {

		int j = 1;

		while (true) {

			System.out.println("j >>> " + j);
			j++;

		}

	}

}

public class Thread_03 {

	public static void main(String[] args) {

		// 3) 스레드 클래스(자식클래스) 객체 생성.
		Runnable1 r1 = new Runnable1();
		Runnable2 r2 = new Runnable2();

		// 4) Thread 클래스 생성
		Thread thread1 = new Thread(r1);

		Thread thread2 = new Thread(r2);

		// 5) Thread 클래스의 참조변수.start() 메서드 호출

		thread1.start();
		thread2.start();

	}

}
