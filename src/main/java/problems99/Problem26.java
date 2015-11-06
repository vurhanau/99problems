package problems99;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Problem26 {

//  P26 (**) Generate the combinations of K distinct objects chosen from the N elements of a list.

  public static void main(String[] args) {
    System.out.println(combinations(3, asList('a', 'b', 'c', 'd', 'e', 'f')));
  }

  private static <T> List<List<T>> combinations(int k, List<T> items) {
    if(items.size() == 0) {
      return new ArrayList<>();
    }

    if(k == 0) {
      return new ArrayList<>(asList(new ArrayList<>()));
    }

    List<T> slice = items.subList(1, items.size());
    List<List<T>> part1 = combinations(k - 1, slice);
    part1.stream()
        .map(list -> {
          list.add(0, items.get(0));
          return list;
        }).collect(Collectors.toList());

    List<List<T>> part2 = combinations(k, slice);
    part1.addAll(part2);

    return part1;
  }
}
