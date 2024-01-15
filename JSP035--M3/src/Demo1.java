public class Demo1 {

    public static void main(String[] args) {
    	
        Thread myCarThread = new Thread( 
        		() -> {
        			for (int i = 0; i < 5; i++) {
        				System.out.println("Hello Mom");
        			}
        		}
        	);

        Thread mySuperCarThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Mom_PAPA");
            }
        });

        myCarThread.start();
        mySuperCarThread.start();
    }

}
