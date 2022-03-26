package training.netology;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
