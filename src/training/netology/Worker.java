package training.netology;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) { // в задании не указано - по счёту или по номеру 33я таска должна выпасть. потому - пусть будет по номеру.
                errorCallback.onError("ERROR - This is 33th task!!!");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }

    }
}
