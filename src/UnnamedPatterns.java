public class UnnamedPatterns {

  public static void main(String[] args) {
    var house = new House("123 Main St", 3, true);
    printNoOfBedrooms(house);
  }

  private static void printNoOfBedrooms(Building building) {
    //if (building instanceof House(var address, var noOfBedrooms, var hasBasement)) {
    if (building instanceof House(_, var noOfBedrooms, _)) { //replace unused patterns to _
      System.out.println(STR."No. of bedrooms: \{noOfBedrooms}");
    }
  }

}

interface Building {

}

record House(String address, Integer noOfBedrooms, Boolean hasBasement) implements Building {

}

record Store(String address) implements Building {

}