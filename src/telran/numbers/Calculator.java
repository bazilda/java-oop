package telran.numbers;

public class Calculator {
	
	static OperatorChar[] operators = new OperatorChar[] {
		new OperatorChar('+', (a, b) -> a + b),
		new OperatorChar('-', (a, b) -> a - b),
		new OperatorChar('*', (a, b) -> a * b),
		new OperatorChar('/', (a, b) -> a / b),
		new OperatorChar('%', (a, b) -> a % b)
	};
	
	
	static public double calculate(CalcData cd) {
		for (int i = 0; i < operators.length; i++)
		{
			if (operators[i].getCharOp() == cd.getOperation())
				return operators[i].getOperator().apply(cd.getOp1(), cd.getOp2());
		}

		return Double.NaN;
	}
}
