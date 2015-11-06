package problems99;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Problem23 {

//  P23 (**) Extract a given number of randomly selected elements from a list.

  public static void main(String[] args) {
    System.out.println(randomSelect(3, asList('a', 'b', 'c', 'd', 'f', 'g', 'h')));
  }

  public static <T> List<T> randomSelect(int count, List<T> items) {
    List<T> ret = new ArrayList<>(count);
    Random rand = new Random();

    for(int i = 0; i < count; i++) {
      List<Object> randItem = Problem20.removeAt(rand.nextInt(items.size()), items);
      items = (List<T>) randItem.get(0);
      ret.add((T)randItem.get(1));
    }

    return ret;
  }
}
