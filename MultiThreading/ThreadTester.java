package MultiThreading;

public class ThreadTester {

    public static void main(String[] args) {
        System.out.println("Main is Starting");

        Thread thread1 = new Thread1("Thread1");
//        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("inside : " + Thread.currentThread() +" : "+ i);
            }
        }, "Thread2");
        thread2.start();

        System.out.println("Main is Exiting");
    }

}
