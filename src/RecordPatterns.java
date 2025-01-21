public class RecordPatterns {

  public static void main(String[] args) {
    System.out.println(calculateSum(new Point(1, 2)));
    System.out.println(calculateSum(new Object()));
  }

  private static int calculateSum(Object obj) {
    if (obj instanceof Point(int x, int y)) {
      return x+y;
    }
    return 0;

  }
}

record Point(int x, int y) {

}
