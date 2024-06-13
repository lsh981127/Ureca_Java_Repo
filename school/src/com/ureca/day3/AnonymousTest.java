package com.ureca.day3;


interface Run {
	void go();
	void stop();
}


public class AnonymousTest {
	static class Car implements Run {		// 중첩 클래스
		// 이거는 AnonymousTest의 Car 인거야
		// AnonymousTest 안에서만 쓰도록 안에다가 써둔거야
		

		@Override
		public void go() {
			System.out.println("go");
		}
		
		@Override
		public void stop() {
			System.out.println("stop");
		}
		
	}
	// 왜 static을 넣어줘야 동작하는 거지??
	// main이 static이기 때문에
	
	public static void main(String[] args) {
		Run r1 = new Car();
		r1.go();
		System.out.println(r1.getClass().getName());
		System.out.println();
		
		
		Run r2 = new Run(){		// 중첩 클래스. 이름은 1부터 순차적으로 붙는다.
			
			// new class ? implements Run 이 원래 생략된 것이다
			// class ser implements Serializable (){}  
			@Override
			public void go() {
				System.out.println("go");
			}
			
			@Override
			public void stop() {
				System.out.println("stop");
			}
			
		};
		System.out.println(r2.getClass().getName());

		Run r3 = new Run() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void go() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
