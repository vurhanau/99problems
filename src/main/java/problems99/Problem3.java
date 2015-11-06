package problems99;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class Problem3 {

//  P03 (*) Find the Kth element of a list.

  public static void main(String[] args) {
    System.out.println(nth(2, asList(1, 1, 2, 3, 5, 8)));
  }

  public static <T> Optional<T> nth(int n, List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    if(items.size() < n + 1) {
      return Optional.empty();
    }

    return Optional.of(items.get(n));
  }
}
