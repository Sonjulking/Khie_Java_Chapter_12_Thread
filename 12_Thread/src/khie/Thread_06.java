package khie;
/*
 * 멀티 스레드와 스레드 이름 지정
 * => 멀티 스레드 : 하나의 스레드 클래스를 대상으로 2개 이상의 스레드 객체를 생성하는 기법.
 * => 스레드 이름 지정 : 멀티 스레드에서 생성한 스레드 객체에 이름을 부여하는 과정을 말함. 형식) super(name);
 * =>멀티 스레드는 자신의 이름을 가지고 있음. 
 * => 스레드의 이름이 스레드에서 큰 역할을 하지는 않지만, 디버깅을 할때 어떤 스레드가 실행이 되어 작업을 하고 있는지를 조사(확인) 하는 
 * 목적으로 많이 사용이 된다.
 */

class ThreadA extends Thread {
	public ThreadA() {
	} // 기본 생성자

	public ThreadA(String name) {

		super(name);

	} // 인자 생성자

	@Override
	public void run() {

		// getName() : 현재 run() 메서드를 실행 중인 스레드의 이름을 가져오는 메서드.

		System.out.println(this.getName());

	}

}

public class Thread_06 {

	public static void main(String[] args) {

		Thread t1 = new ThreadA("첫번째 스레드");
		Thread t2 = new ThreadA("두번째 스레드");
		Thread t3 = new ThreadA("세번째 스레드");
		Thread t4 = new ThreadA("네번째 스레드");
		Thread t5 = new ThreadA("다섯번째 스레드");
		Thread t6 = new ThreadA("여섯번째 스레드");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}
