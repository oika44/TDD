/**
 * 
 */
package TDD;

/**
 * @author oika
 *
 */
public interface Expression {
	Expression plus(Expression addend);
	Object reduce(Bank bank, String to);
	
}
