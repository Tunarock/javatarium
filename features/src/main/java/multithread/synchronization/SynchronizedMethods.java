package multithread.synchronization;

public class SynchronizedMethods {

    public static int staticSum;
    public static int staticCount;

    public static synchronized void syncStaticCalculate() {
        staticSum = staticSum + 1;
    }

    private int sum = 0;
    private int count = 0;

    public void calculate() {
        setSum(getSum() + 1);
    }

    public synchronized void synchronisedCalculate() {
        setSum(getSum() + 1);
    }

    public void performSynchronisedTask() {
        synchronized (this) {
            setCount(getCount()+1);
        }
    }

    public static void performStaticSyncTask(){
        synchronized (SynchronizedMethods.class) {   //.class used for static accessing
            setStaticCount(getStaticCount() + 1);
        }
    }

    //while in a synchronized block, we can repeatedly acquire the same monitor lock.
    void performMultipleLocks(){
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("First time acquiring it");

            synchronized (lock) {
                System.out.println("Entering again");

                synchronized (lock) {
                    System.out.println("And again");
                }
            }
        }
    }

    public static int getStaticSum() {
        return staticSum;
    }

    public static void setStaticSum(int staticSum) {
        SynchronizedMethods.staticSum = staticSum;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public static void setStaticCount(int staticCount) {
        SynchronizedMethods.staticCount = staticCount;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
