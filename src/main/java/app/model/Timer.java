package app.model;

public class Timer {

    private Long nanoTime = System.nanoTime();

    public Timer(Long nanoTime) {
        this.nanoTime = nanoTime;
    }

    public Timer() {

    }

    public Long getTime() {
        return nanoTime;
    }
}
