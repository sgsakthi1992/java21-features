import static java.util.FormatProcessor.FMT;

public class SwitchPatternMatching {

  public static void main(String[] args) {
    System.out.println(classifyInput(new TransactionRecord("Credit", 1250.75)));
    System.out.println(classifyInput(2450.755678));
    System.out.println(classifyInput(new double[] {29.57, 76.48, 92.38}));
    System.out.println(classifyInput("Raw Data-1"));
    System.out.println(classifyInput(2450.75f));
  }

  private static String classifyInput(Object input) {
    return switch (input) {
      case Integer i -> STR."Single Integer: Processed : \{i}";
      case Double d -> FMT."Single Double: Rounded to 2 decimal places : %.2f\{d}";
      case int[] arr -> STR."Integer Array of size \{arr.length}";
      case double[] arr -> STR."Double Array of size \{arr.length}";
      case TransactionRecord(String type, double amount) -> STR."Transaction type: \{type}, amount: \{amount}";
      case String s -> STR."Raw Data: \{s}";
      default -> "Wrong input";
    };
  }

}

record TransactionRecord(String transactionType, double amount) {

}
