package pt.ual.pp.task1;

interface I {
    void m();
}

class A implements I {
    @Override
    public void m() {
        System.out.println("m implemented in A");
    }
}

class B {
    public void goal(I impl) {
        System.out.print("B is executing goal: ");
        impl.m();
    }
}

public class App {
    public static void main(String[] args) {
        new B().goal(() -> System.out.println("m implemented in lambda"));

    }
}
