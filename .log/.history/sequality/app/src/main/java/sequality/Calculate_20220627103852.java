package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum2(int x, int y) {
    int s = 0;
    for (int i = x; i <= y; i++) {
      s = s + i;
    }
    return s;
  }

  public int suma(int x, int y) {
    int s = 0;
    for (int i = x; i <= y; i++) {
      s = s + i;
    }
    return s;
  }

  public int sumeven(int x, int y) {
    int s = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        s = s + i;
      }
    }
    return s;
  }
}
