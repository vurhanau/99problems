package problems99;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class Problem16 {

//  P16 (**) Drop every Nth element from a list.

  public static void main(String[] args) {
    System.out.println(drop(3, asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
  }

  public static <T> List<T> drop(int nth, List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    if(items.size() < nth) {
      return new ArrayList<>(items);
    }

    return IntStream.range(0, items.size()).filter(i -> (i + 1) % nth != 0).mapToObj(i -> items.get(i)).collect(Collectors.toList());
  }

}
