package func.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

  public static void main(String[] args) {
    System.out.println(getDBConnectionUrl());
    System.out.println(getDBConnectionUrlSupplier.get());
  }

  static String getDBConnectionUrl () {
    return "jdbc://localhost:5423/users";
  }

  static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
      Arrays.asList(
          "jdbc://localhost:5423/users",
          "jdbc://localhost:5423/customers"
      );

}
