package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

  public static void main(String[] args) {
    // normal java functions
    greetCustomer(new Customer("Maria", "99999"));

    // Consumer approach
    greatCustomerConsumer.accept(new Customer("Marsha", "696969"));

    // BiConsumer
    greatCustomerConsumerV2.accept(new Customer("Martial", "484844"), true);
    greatCustomerConsumerV2.accept(new Customer("Mr X.", "000111000"), false);
  }

  static Consumer<Customer> greatCustomerConsumer = customer -> System.out.println(
      "Hello " + customer.customerName +
      ", thanks for registering phone number " + customer.customerPhoneNumber
  );

  static BiConsumer<Customer, Boolean> greatCustomerConsumerV2 = (customer, showPhoneNumber)
      -> System.out.println(
        "Hello " + customer.customerName +
        ", thanks for registering phone number " +
        (showPhoneNumber ? customer.customerPhoneNumber : "-HIDDEN NUMBER-")
      );

  static void greetCustomer(Customer customer) {
    System.out.println(
        "Hello " + customer.customerName +
        ", thanks for registering phone number " + customer.customerPhoneNumber
    );
  }

  static class Customer {
    private final String customerName;
    private final String customerPhoneNumber;

    Customer(String customerName, String customerPhoneNumber) {
      this.customerName = customerName;
      this.customerPhoneNumber = customerPhoneNumber;
    }
  }
}
