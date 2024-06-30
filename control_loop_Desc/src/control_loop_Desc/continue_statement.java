package control_loop_Desc;

public class continue_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++) {
			
			if(i == 5) {
				
				System.out.println("The continue statement executes!");
				continue;
			}
			System.out.println("i = " +i);
		}

	}

}
