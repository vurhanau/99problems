package problems99;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem24 {

//  P24 (*) Lotto: Draw N different random numbers from the set 1..M.

  public static void main(String[] args) {
    System.out.println(lotto(6, 49));
  }

  public static List<Integer> lotto(int count, int limit) {
    return IntStream.range(0, count).map(i -> ThreadLocalRandom.current().nextInt(limit)).boxed().collect(Collectors.toList());
  }

}
