package control_loop_Desc;

public class Break_statement {
	
	public static void main(String[] args) {
		
        // Simple example: Break out of loop when condition is met
        for (int i = 1; i <= 5; i++) {
        	
            if (i == 4) {
            	
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
