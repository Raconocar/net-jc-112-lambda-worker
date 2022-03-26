package training.netology;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OnTaskDoneListener doneListener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}
