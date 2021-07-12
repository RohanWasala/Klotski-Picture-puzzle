import java.util.*;
interface mertix {
    int n = 4;
    int[][] ma = new int[n][n];
    int[][] maog = new int[n][n];
    int size = n * n;
  
    default void perpare() {
      ArrayList<Integer> list = new ArrayList<Integer>(size);
      for (int i = 0; i < size; i++) {
        list.add(i);
      }
      int k = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (k == size)
            break;
          maog[i][j] = list.get(k);
          k++;
        }
      }
      Random s = new Random();
      for (int i = size - 1; i > 0; i--) {
        int j = s.nextInt(i + 1);
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
      }
      int q = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (q == size)
            break;
          ma[i][j] = list.get(q);
          q++;
        }
      }
      System.out.println(" ");
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(ma[i][j] + " ");
        }
        System.out.println();
      }
    }
  }