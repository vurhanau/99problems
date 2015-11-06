package problems99;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem8 {

//  P08 (**) Eliminate consecutive duplicates of list elements.

  public static void main(String[] args) {
    System.out.println(compress(asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')));
  }

  public static <T> List<T> compress(List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    if(items.isEmpty()) {
      return Collections.emptyList();
    }

    List<T> compressed = new ArrayList<>();
    T seqCursor = items.get(0);
    compressed.add(seqCursor);
    for(int i = 1; i < items.size(); i++) {
      if(!seqCursor.equals(items.get(i))) {
        seqCursor = items.get(i);
        compressed.add(seqCursor);
      }
    }

    return compressed;
  }
}