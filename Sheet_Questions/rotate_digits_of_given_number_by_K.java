package Sheet_Questions;
import java.util.*;

public class rotate_digits_of_given_number_by_K {

  public static void rotateNumberByK(int N, int K)
  {
   
    String num = Integer.toString(N);
    int len = num.length();

   
    if (K > 0) {
      String rotated
        = num.substring(K) + num.substring(0, K);
      System.out.print(Integer.parseInt(rotated));
    }
    else {
      K = Math.abs(K);
      String rotated = num.substring(len - K)
        + num.substring(0, len - K);
      System.out.print(Integer.parseInt(rotated));
    }
  }

 
  public static void main(String[] args)
  {
    int N = 12345, K = 2;

   
    rotateNumberByK(N, K);
  }
}

