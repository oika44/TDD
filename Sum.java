package TDD;

public class Sum implements Expression {
	//public Money augend1;
	//public Money addend;
	public Expression augend;
	public Expression addend;
	Sum(Expression augend,Expression addend) {
		//this.augend =augend1;
		this.augend =augend;
		this.addend = addend;
	}
	public Money reduce(Bank bank,String to) {
		int amount = augend.reduce(bank,to).amount +addend.reduce(bank,to).amount;
		return new Money(amount,to);
	}
	public Expression plus(Expression addend) {
		return null;
	}

}
