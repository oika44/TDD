package TDD;
class Money implements Expression  {
	protected int amount;
	protected String currency;
	
	Money(int amount ,String currency) {
		this.amount =amount ;
		this.currency = currency;
	}
	public static Money franc(int amount) {
		return new Money(amount,"CHF");
	}
	public boolean equals(Object object) {
		Money money=(Money)object;
		return amount == money.amount
				&& currency().equals(money.currency());
	}
	public String toString() {
		return amount + " " + currency;
	}
	public Money reduce(String to) {
		int rate = (currency.contentEquals("CHF")&& to.contentEquals("USD"))?2:1;
		return new Money(amount/rate,to);
		//return this;
	}
//abstract Money times(int multiplier);
	String currency() {
		return currency;
	}
	public static Money dollar(int amount) {
		return new Money(amount,"USD");
	}
	//abstract Money times(int multiplier);
	Money times(int multiplier) {
		return new Money(amount * multiplier,currency);
	}
	Expression plus(Money addend) {
		return new Money(amount + addend.amount ,currency) ;
	}
}
