
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20, 0.25F);

        hs.add(12);
        hs.add(20);
        hs.add(20);
        hs.add(40);
        hs.add(50);

        System.out.println(hs);

    }
}
