
class Test extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Test Thread");
        }
    }
}

public class Multithread {
    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Main Thread");
            Thread.sleep(1);
        }

    }

}
