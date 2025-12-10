package Java_8_Features.Functional_Interface;

/*  Definition
        A functional interface that takes no input and returns nothing.
    Use Case
        Threads
        Background tasks
        Asynchronous jobs
*/

@FunctionalInterface
interface MyRunnable {
    void run();
}
