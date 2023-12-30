/*
 * @FunctionalInterface interface DemoF{ abstract void display(); } public class
 * demo1 {
 * 
 * public static void main(String[] args) {
 * 
 * DemoF od=new DemoF()->{
 * 
 * }
 * 
 * } }
 */

@FunctionalInterface
interface DemoF {
    void display();
}

public class demo1 {

    public static void main(String[] args) {

        DemoF od = () -> {
            System.out.println("Hello @FunctionalInterface");
        };

        od.display();
    }
}
