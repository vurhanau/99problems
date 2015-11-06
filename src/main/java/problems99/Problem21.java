package problems99;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem21 {

//  P21 (*) Insert an element at a given position into a list.

  public static void main(String[] args) {
    System.out.println(insertAt("new", 1, asList("a", "b", "c", "d")));
  }

  private static List<String> insertAt(String str, int pos, List<String> strings) {
    List<String> ret = new ArrayList<>(strings);
    ret.add(pos, str);
    return ret;
  }


}
