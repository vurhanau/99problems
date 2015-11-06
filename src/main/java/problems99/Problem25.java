package problems99;

import java.util.List;

import static java.util.Arrays.asList;

public class Problem25 {

//  P25 (*) Generate a random permutation of the elements of a list.

  public static void main(String[] args) {
    System.out.println(randomPermute(asList('a', 'b', 'c', 'd', 'e', 'f')));
  }

  private static <T> List<T> randomPermute(List<T> items) {
    return Problem23.randomSelect(items.size(), items);
  }
}
