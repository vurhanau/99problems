package problems99;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem11 {

//  P11 (*) Modified run-length encoding.

  public static void main(String[] args) {
    System.out.println(encodeModified(asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')));
  }

  public static <T> List<Object> encodeModified(List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    if(items.isEmpty()) {
      return Collections.emptyList();
    }

    List<Object> encoded = new ArrayList<>();

    int freq = 1;
    T head = items.get(0);
    for(int i = 1; i < items.size(); i++) {
      T current = items.get(i);
      if(!current.equals(head)) {
        if(freq > 1) {
          encoded.add(asList(freq, head));
        } else {
          encoded.add(head);
        }
        head = current;
        freq = 1;
        continue;
      }
      freq++;
    }

    return encoded;
  }
}
