package khie;

/*
 * 프로세스(process)?
 * =>현재 cpu에 의해서 처리되는 프로그램.
 * =>운영체제로부터 메모리를 할당을 받는다.
 * =>자바에서는 하나의 클래스를 말한다.
 * 
 */

/*
 * -무한 반복을 가진 프로세스를 실행할 경우는 CPU가 해당 프로세스를 놓지 않기 때문에 다음 프로세스를 실행할 수가 없게 된다.
 * =>이러한 문제점을 해결하기 위해서 Thread라는 개념이 도입이 되었다.
 */

class Process1 {

	void go() {

		int i = 1;

		while (true) {
			System.out.println("i >>> " + i);
			i++;
		}

	}

}

class Process2 {

	void go() {

		int j = 1;

		while (true) {

			System.out.println("j >>> " + j);

			j++;

		}

	}

}

public class Thread_01 {

	public static void main(String[] args) {

		Process1 p1 = new Process1();
		Process2 p2 = new Process2();

		p1.go();
		p2.go();

	}

}
