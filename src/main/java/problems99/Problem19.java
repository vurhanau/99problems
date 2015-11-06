package problems99;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem19 {

//  P19 (**) Rotate a list N places to the left.

  public static void main(String[] args) {
    System.out.println(rotate(3, asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
    System.out.println(rotate(-2, asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
  }

  public static <T> List<T> rotate(int step, List<T> original) {
    if(original == null) {
      throw new IllegalArgumentException();
    }
    int len = original.size();
    List<T> rotated = new ArrayList<>(len);
    if(step >= 0) {
      rotated.addAll(original.subList(step, len));
      rotated.addAll(original.subList(0, step));
    } else {
      step = Math.abs(step);
      rotated.addAll(original.subList(len - step, len));
      rotated.addAll(original.subList(0, len - step));
    }

    return rotated;
  }
}
