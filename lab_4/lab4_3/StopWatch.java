public class StopWatch
{
    private double startTime, endTime;
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        return (endTime-startTime);
    }
}
