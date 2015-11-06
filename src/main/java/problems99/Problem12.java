package problems99;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class Problem12 {

//  P12 (**) Decode a run-length encoded list.

  public static void main(String[] args) {
    System.out.println(decode(asList(asList(4, 'a'), asList(1, 'b'), asList(2, 'c'), asList(2, 'a'), asList(1, 'd'), asList(4, 'e'))));
  }

  public static <T> List<T> decode(List<List<Object>> packed) {
    return packed.stream().flatMap(tuple -> mul((T) tuple.get(1), (int) tuple.get(0)).stream()).collect(Collectors.toList());
  }

  private static <T> List<T> mul(T object, int count) {
    return IntStream.range(0, count).mapToObj(i -> object).collect(Collectors.toList());
  }
}
