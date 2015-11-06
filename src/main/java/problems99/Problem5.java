package problems99;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem5 {

//  P05 (*) Reverse a list.

  public static void main(String[] args) {
    System.out.println(reverse(asList(1, 1, 2, 3, 5, 8)));
  }

  public static <T> List<T> reverse(List<T> original) {
    if(original == null) {
      throw new IllegalArgumentException();
    }

    List<T> reversed = new ArrayList<T>(original);
    Collections.reverse(reversed);
    return reversed;
  }
}
