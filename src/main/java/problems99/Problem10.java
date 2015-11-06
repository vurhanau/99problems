package problems99;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Problem10 {

//  P10 (*) Run-length encoding of a list.

  public static void main(String[] args) {
    System.out.println(encode(asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')));
  }

  public static <T> List<List<Object>> encode(List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }
    return Problem9.pack(items).stream().map(list -> asList(list.size(), list.get(0))).collect(Collectors.toList());
  }
}
