package calculater;

public class Div extends Arith {

	@Override
	public int calculate() {

		return (this.getlValue()-this.getrValue());
	}

}
