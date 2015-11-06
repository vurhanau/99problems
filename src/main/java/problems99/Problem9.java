package problems99;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class Problem9 {

//  P09 (**) Pack consecutive duplicates of list elements into sublists.

  public static void main(String[] args) {
    System.out.println(pack(asList('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')));
  }

  public static <T> List<List<T>> pack(List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    if(items.isEmpty()) {
      return Collections.emptyList();
    }

    List<List<T>> compressed = new ArrayList<>();
    T seqCursor = items.get(0);
    compressed.add(new ArrayList<T>(singletonList(seqCursor)));
    for(int i = 1; i < items.size(); i++) {
      T current = items.get(i);
      if(!seqCursor.equals(current)) {
        seqCursor = current;
        compressed.add(new ArrayList<T>(singletonList(seqCursor)));
        continue;
      }
      compressed.get(compressed.size() - 1).add(current);
    }

    return compressed;
  }

}
