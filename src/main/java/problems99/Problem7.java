package problems99;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem7 {

//  P07 (**) Flatten a nested list structure.

  public static void main(String[] args) {
    System.out.println(flatten(asList(asList(1, 1), 2, asList(3, asList(5, 8)))));
  }

  public static List<Object> flatten(List<Object> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    List<Object> flattened = new ArrayList<>();
    flatten0(items, flattened);
    return flattened;
  }

  private static void flatten0(List<Object> original, List<Object> flattened) {
    for(Object object : original) {
      if(object instanceof List) {
        flatten0((List<Object>) object, flattened);
      } else {
        flattened.add(object);
      }
    }
  }
}
