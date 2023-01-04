package money;

public class Sum implements Expression { 
	//public Money augend1;
	//public Money addend;
	public Money augend;
	public Money addend;
	Sum(Money augend,Money addend) {
		//this.augend =augend1;
		this.augend =augend;
		this.addend = addend;
	}
	public Money reduce(String to) {
		int amount = augend.amount +addend.amount;
		return new Money(amount,to);
	}
	
}
