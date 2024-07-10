package interfaceDemo;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inner Interface");
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Outer Interface");
	}
	

}
