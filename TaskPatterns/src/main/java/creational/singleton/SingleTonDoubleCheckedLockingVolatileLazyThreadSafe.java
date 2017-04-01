package creational.singleton;

public class SingleTonDoubleCheckedLockingVolatileLazyThreadSafe implements Singleton {
    private static volatile Singleton instance;

    private SingleTonDoubleCheckedLockingVolatileLazyThreadSafe(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (SingleTonDoubleCheckedLockingVolatileLazyThreadSafe.class){
                if (instance == null){
                    instance = new SingleTonDoubleCheckedLockingVolatileLazyThreadSafe();
                }
            }
        }
        return instance;
    }
}
