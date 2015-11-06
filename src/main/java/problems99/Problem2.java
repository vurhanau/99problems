package problems99;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class Problem2 {

//  P02 (*) Find the last but one element of a list.

  public static void main(String[] args) {
    System.out.println(penultimate(asList(1, 1, 2, 3, 5, 8)));
    System.out.println(penultimate(asList(1, 2)));
    System.out.println(penultimate(asList(1)));
    System.out.println(penultimate(new ArrayList<Integer>()));
  }

  public static <T> Optional<T> penultimate(List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    if(items.size() < 2) {
      return Optional.empty();
    }

    return Optional.of(items.get(items.size() - 2));
  }

}
