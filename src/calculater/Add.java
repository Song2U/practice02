package calculater;

public class Add extends Arith {

	@Override
	public int calculate() {

		return (this.getlValue()+this.getrValue());
	}

}
