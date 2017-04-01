package deadlock;

public class Runner {
    public static void main(String[] args) {
        ObjThreadSafe myObject = new ObjThreadSafe();
        ObjThreadSafe hisObject = new ObjThreadSafe();

        new Thread(new Thread1(myObject, hisObject)).start();
        new Thread(new Thread2(myObject, hisObject)).start();
    }
}
