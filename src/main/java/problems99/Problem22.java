package problems99;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem22 {

//  P22 (*) Create a list containing all integers within a given range.

  public static void main(String[] args) {
    System.out.println(range(4, 9));
  }

  private static List<Integer> range(int a, int b) {
    return IntStream.rangeClosed(a, b).boxed().collect(Collectors.toList());
  }
}
