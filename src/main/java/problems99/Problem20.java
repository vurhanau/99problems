package problems99;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem20 {

//  P20 (*) Remove the Kth element from a list.

  public static void main(String[] args) {
    System.out.println(removeAt(1, asList('a', 'b', 'c', 'd')));
  }

  public static <T> List<Object> removeAt(int i, List<T> characters) {
    List<Object> ret = new ArrayList<>(characters);
    Object removed = ret.remove(i);
    return asList(ret, removed);
  }
}
