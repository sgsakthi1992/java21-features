import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class UnnamedVariables {

  public static void main(String[] args) {
    var items = List.of("1", "2", "3", "hi");
    AtomicInteger basketTotal = new AtomicInteger();
    //items.forEach(item -> basketTotal.getAndIncrement());
    items.forEach(_ -> basketTotal.getAndIncrement()); //unused item is replaced to _
    System.out.println(STR."Total: \{basketTotal}");

    var lastItem = items.getLast();
    try {
      var item = Integer.parseInt(lastItem);
      System.out.println(STR."Last item: \{item}");
    } catch (NumberFormatException _) { //replaced unused exception with _
      System.out.println("Not a number");
    }
  }

}
