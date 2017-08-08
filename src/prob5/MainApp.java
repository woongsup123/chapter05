package prob5;

public class MainApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			MyStack<? extends Number> stack = new MyStack(3);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(9.6);
			stack.push(10);

			while (stack.isEmpty() == false) {
				// 런타임 에러
				// generic을 사용하지 않으면 코드 작성시 타입 체크를 하지 않음
				// Integer s = (Integer)stack.pop();
				Object s = stack.pop();
				
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack<>(3);
			stack.push(43);

			System.out.println(stack.pop());
			System.out.println(stack.pop()); // exception occurs here
			
			
		} catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}
