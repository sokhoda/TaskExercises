package deadlocksimple;

public class JoinExample extends Thread {
    private int x = 2;

    public static void main(String[] args) throws Exception {
        JoinExample thread = new JoinExample();
        thread.start();
        thread.join();
        thread.makeItSo();
    }

    public JoinExample() {
        x = 5;
    }

    public void makeItSo() throws Exception {
        x = x - 1;
        System.out.println(x);
    }

    public void run() {
        x *= 2;
    }
}
