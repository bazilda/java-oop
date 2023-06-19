package telran.numbers;
import java.util.function.BinaryOperator;

public class OperatorChar {
	DoubleBinaryOperator operator;
	char charOp;
	public OperatorChar(char c, DoubleBinaryOperator operator) {
		this.operator = operator;
		this.charOp = c; 
	}
	public char getCharOp() { return charOp; }
	public DoubleBinaryOperator getOperator() { return operator; }
}


interface DoubleBinaryOperator extends BinaryOperator<Double> {
}
