package khie;
/*
 *[문제] 숫자(1~100)를 생성하는 스레드 클래스와 영문자(A~Z)를 생성하는 스레드 클래스를 각각 정의하여 스레드가 수행되도록 해보자.
 *=>숫자 생성 스레드 : NumberThread => Thread 클래스를 상속하여 생성. 
 *=>영문자 생성 스레드 : AlphaThread =>Runnable 인터페이스를 구현하여 생성.
 */

class NumberThread extends Thread {
	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println("number>>> " + i);
		}

	}

}

class AlphaThread implements Runnable {

	@Override
	public void run() {

		for (char c = 'A'; c <= 'Z'; c++) {

			System.out.println("alpha >>> " + c);

		}

	}
}

public class Thread_05 {

	public static void main(String[] args) {

		NumberThread nt = new NumberThread();

		AlphaThread at = new AlphaThread();

		Thread thread = new Thread(at);

		nt.start();
		thread.start();

	}

}
