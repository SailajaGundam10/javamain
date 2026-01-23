
import java.util.LinkedList;
public class collections4 {
    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();

            list.add(10);
            list.add(20);
            list.addFirst(5);
            list.remove(20);

            System.out.println(list);

    }
}
