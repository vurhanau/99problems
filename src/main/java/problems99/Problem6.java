package problems99;

import java.util.List;

import static java.util.Arrays.asList;

public class Problem6 {

//  P06 (*) Find out whether a list is a palindrome.

  public static void main(String[] args) {
    System.out.println(isPalindrome(asList(1, 2, 3, 2, 1)));
    System.out.println(isPalindrome(asList(1, 2, 2, 1)));
    System.out.println(isPalindrome(asList(1, 3, 3, 2, 1)));
    System.out.println(isPalindrome(asList(1, 3, 2, 1)));
  }

  public static <T> boolean isPalindrome(List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }

    int len = items.size();
    for (int i = 0; i < len / 2; i++) {
      if (!items.get(i).equals(items.get(len - 1 - i))) {
        return false;
      }
    }

    return true;
  }
}
