package problems99;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class Problem1 {

//  P01 (*) Find the last element of a list.

  public static void main(String[] args) {
    System.out.println(last(asList(1, 2, 3, 4, 5, 6, 6)));
    System.out.println(last(new ArrayList<Integer>()));
  }

  public static <T> Optional<T> last(List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    if (items.isEmpty()) {
      return Optional.empty();
    }

    return Optional.of(items.get(items.size() - 1));
  }
}
