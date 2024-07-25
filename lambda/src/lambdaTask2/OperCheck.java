package lambdaTask2;

@FunctionalInterface
public interface OperCheck {
	String[] getOpers(String formula);
//	계산식을 입력받으면 split으로 나눠서 문자열 배열로 리턴 후 Calc인터페이스를 통해
//	정수로 리턴하고 그 값을 계산해서 OperCheck에서 문자값으로 리턴
}
