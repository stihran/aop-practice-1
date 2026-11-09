package homework.h06;

import java.util.Arrays;

public class T3 {

  static void handle(int a, int b, int c, int d) {}

  static void handle2(int[] as) {}


  static void main() {
    int[] history = new int[100];
    int pos = 0;

    history[pos] = 123;
    pos = pos + 1;

    history[pos] = 456;
    pos = pos + 1;



    int x1 = 5;
    int x2 = 16;
    int x3 = 27;
    int x4 = 58;

    int x12 = x1 *2;
    int x22 = x2 *2;
    int x32 = x3 *2;
    int x42 = x4 *2;

    handle(x1, x2, x3, x4);
    int[] data = new int[] {5, 16, 27, 58};
    handle2(data);

    System.out.println(Arrays.toString(data));
    //           0 .. 3
    for (int i = 0; i < data.length; i++) {
      data[i] = data[i]*2;
    };

    System.out.println(Arrays.toString(data));

  }
}
