package lambdaTask2;

@FunctionalInterface
public interface Calc {
//	정수가 들어오면 Calc 람다식으로 더하기 뺄셈 메소드 구현
	public int calc(int number1, int number2);
}
