package misc.interfaces;

public class DefaultImpl implements Default {

    public static void main(String[] args) {
        Default.stMeth();
        new DefaultImpl().task();
    }

    public void task() {

        Default.super.runner();
        Default.stMeth();
    }


//    @Override
//    public void runner() {
//        System.out.println("over");
//    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }

}
