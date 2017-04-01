package deadlocksimple;

public class SimpleDeadLock {
    public static void main(String[] args) {
        String str1 = "String1";
        String str2 = "String2";

        new Thread (()->{
            synchronized (str1){
                System.out.println(Thread.currentThread() + " in parent.");
                try {Thread.sleep(100);}catch (InterruptedException e) {e.printStackTrace();}
                synchronized (str2){
                    System.out.println(Thread.currentThread() + " in sub.");
                }
            }
        }).start();

        new Thread (()->{
            synchronized (str2){
                System.out.println(Thread.currentThread() + " in parent.");
                try {Thread.sleep(100);}catch (InterruptedException e) {e.printStackTrace();}
                synchronized (str1){
                    System.out.println(Thread.currentThread() + " in sub.");
                }
            }
        }).start();
    }
}
