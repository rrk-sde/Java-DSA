
class Super {
    void myth1() {
        System.out.println("Super: Myth one");
    }

    void myth2() {
        System.out.println("Super: Myth Two");
    }
}

class Sub extends Super {
    void myth2() {
        System.out.println("sub: Myth 2");
    }

    void myth3() {
        System.out.println("sub: Myth 3");
    }
}

public class DyMethodDispatch {
    public static void main(String[] args) {
        Super t = new Sub();
        t.myth1();
        t.myth2();
    }
}