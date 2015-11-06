package problems99;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem13 {

//  P13 (**) Run-length encoding of a list (direct solution).

  public static void main(String[] args) {
    System.out.println(encodeDirect(asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')));
  }

  public static <T> List<List<Object>> encodeDirect(List<T> items) {
    if (items == null) {
      throw new IllegalArgumentException();
    }

    if (items.isEmpty()) {
      return Collections.emptyList();
    }

    List<List<Object>> encoded = new ArrayList<>();
    T head = items.get(0);
    int freq = 1;
    encoded.add(asList(freq, head));
    for (int i = 1; i < items.size(); i++) {
      T current = items.get(i);
      if (!head.equals(current)) {
        List<Object> tuple = encoded.get(encoded.size() - 1);
        tuple.set(0, freq);
        encoded.add(asList(1, current));
        head = current;
        freq = 1;
        continue;
      }
      freq++;
    }

    return encoded;
  }
}
