public class ValidateUserCredentials {

  public static void main(String[] args) {
    System.out.println(isCredentialsValid("admin_1", "123456789"));
  }

  private static boolean isCredentialsValid(String username, String password) {
    return switch(username) {
      case String u when u.startsWith("admin_") && password.length() >= 8 -> true;
      default -> false;
    };
  }
}
