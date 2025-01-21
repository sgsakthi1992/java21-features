import static java.util.FormatProcessor.FMT;

public static void main(String[] args) {
  var name = "Nyra";
  var msg = STR."Welcome \{name}";
  System.out.println(msg);

  var price = 28.567;
  var priceMsg = FMT."Price $%.2f\{price}";
  System.out.println(priceMsg);
}
