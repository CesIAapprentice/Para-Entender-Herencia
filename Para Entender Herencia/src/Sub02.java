
public class Sub02 extends Super {

	public Sub02(Integer amount) {
		super(amount);
	}
	
	public Integer testMethod() {
		return super.getAmount();
	}
}