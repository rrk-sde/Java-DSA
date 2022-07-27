
class Test extends Thread {
    public void run() {
        System.out.println("Inside Test Thread");
    }
}

public class Multithread {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.start();
        System.out.println("Inside Main Thread");
    }

}
