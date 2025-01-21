public class ParseInputsPhoneEmail {

  public static void main(String[] args) {
    System.out.println(isValidInput("user@example.com"));
    System.out.println(isValidInput("1234567890"));
    System.out.println(isValidInput("invalid_input"));
  }

  private static String isValidInput(Object input) {
    return switch (input) {
      case String email when email.contains("@") -> "Valid Email";
      case String phoneNumber when phoneNumber.matches("\\d{10}") -> "Valid Phone Number";
      default -> "Not Valid";
    };
  }

}
