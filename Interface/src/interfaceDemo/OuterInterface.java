package interfaceDemo;

public interface OuterInterface {
	
	void calcArea();
	
	interface InnerInterface{
		int id=20;
		void print();
	}

}
