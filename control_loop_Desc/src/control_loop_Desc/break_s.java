package control_loop_Desc;

public class break_s {

	public static void main(String[] args) {
		
		outerLoop:
			for(int i =1; i <= 3; i++) {
				System.out.println("Outer Loop Iterations:"+i);
				
				for(int j = 1; j <= 3; j++) {
					System.out.println("Inner Loop Iterations:"+j);
					
					if(i == 2 && j == 2) {
						System.out.println("Breaking Both Loops!");
						break outerLoop;
					}
				}
			}

	}

}
