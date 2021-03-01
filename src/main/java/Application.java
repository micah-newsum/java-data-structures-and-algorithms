import java.util.Arrays;

/**
 * Partitions the array into two sections: sorted and unsorted.
 */
public class Application {
  public static void main(String[] args) {
    // unsorted array
    int[] ints = {20, 35, -15, 7, 55, 1, -22};

    // starts with the understanding that the first element of an array with length 1 is already sorted.
    for (int firstUnsortedIndex = 1; firstUnsortedIndex < ints.length; firstUnsortedIndex++){
      int temp = ints[firstUnsortedIndex];

      int i;

      for (i = firstUnsortedIndex; i > 0 && ints[i - 1] > temp; i--){
        ints[i] = ints[i - 1]; // shift from left to right
      }

      ints[i] = temp;
    }

    // print sorted array
    Arrays.stream(ints)
        .forEach(System.out::println);
  }

}

