package khie;

/*
 * 스레드(Thread)?
 * =>process를 작은 단위로 쪼개어 놓은 작업단위.
 * =>실제 프로그램이 수행되는 작업의 최소 단위. 스레드는 병행 처리를 지원한다.(멀티 태스킹)
 * =>응용분야 : 게임, 채팅 등등
 */

/*
 * [스레드 클래스 작성하는 방법 - 2가지]
 * 1.Thread 라는 클래스를 상속(extends) 하여 사용하는 방법.
 * 2.Runnable 인터페이스를 구현(implements)하여 사용하는 방법.
 */

/*
 * 1.Thread라는 클래스를 상속(extends)하여 사용하는 방법.
 *  1) Thread라는 클래스를 상속(extends)을 받음.
 *  2) run() 메서드를 재정의 - 스레드 구현
 *  3-1) 스레드 클래스 객체 생성
 *  3-2) 참조변수.start() 메서드 호출 
 *   =>run() 메서드 실행
 */

//1) Thread라는 클래스를 상속(extends)을 받음.
class Thread1 extends Thread { // 1-1

	// 2) run() 메서드를 재정의 - 스레드 구현
	@Override
	public void run() {
		int i = 1;

		while (true) {
			System.out.println("i >>> " + i);
			i++;
		}
	}

}

class Thread2 extends Thread { // 1-1

	@Override
	public void run() {

		int j = 1;

		while (true) {

			System.out.println("j >>> " + j);

			j++;

		}
	}

}

public class Thread_02 {

	public static void main(String[] args) {

		// 3-1) 스레드 클래스 객체 생성.
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();

		// 3-2)참조변수.start()메서드 호출
		// run()메서드 실행됨
		t1.start();
		t2.start();

	}

}
