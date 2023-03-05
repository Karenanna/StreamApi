package sky.pro.streamapi;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;

public class Stream<T> {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);

        findMaxMin(list.stream(), (v1, v2) -> v2 - v1, (v1, v2) -> System.out.println(v1 + v2));
    }

    public static <T> void findMaxMin(Stream<? extends T> stream, Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T>
                                              maxMinConsumer) {
        List<? extends T> list = stream.sorted(order).toList;

        maxMinConsumer.accept(list.get(0), list.get(list.size() - 1));

    }

        private static void findMaxMin(java.util.stream.Stream<Integer> stream, Object o, Object o1) {

    }

    public static void findNumber(List<Integer> list) {
        System.out.println();
        System.out.println(list.stream().filter(x -> x % 2 == 0).count() + "из" + list.size() + "четные");




    }
}
