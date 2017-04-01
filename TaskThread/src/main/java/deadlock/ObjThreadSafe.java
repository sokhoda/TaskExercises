package deadlock;

public class ObjThreadSafe {

    public synchronized void meth(ObjThreadSafe objThreadSafe)  {
        System.out.println(Thread.currentThread() + " in meth();");
        try {
            Thread.sleep(100);
            objThreadSafe.nestedMethod();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void nestedMethod(){
        System.out.println(Thread.currentThread() + " in nestedMethod();");
    }
}
