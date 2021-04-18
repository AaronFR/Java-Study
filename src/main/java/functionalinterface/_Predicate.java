package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

  public static void main(String[] args) {

    String phoneNumber1 = "0700000890";
    String phoneNumber2 = "07000000003";
    String phoneNumber3 = "09000038900";

    System.out.println(isPhoneNumberValid(phoneNumber1));
    System.out.println(isPhoneNumberValid(phoneNumber2));
    System.out.println(isPhoneNumberValid(phoneNumber3));

    System.out.println();
    System.out.println(isPhoneNumberValidPredicate.test(phoneNumber1));
    System.out.println(isPhoneNumberValidPredicate.test(phoneNumber2));
    System.out.println(isPhoneNumberValidPredicate.test(phoneNumber3));

    System.out.println();
    System.out.println(
        "Is phone number valid and contains number 3 : " +
        isPhoneNumberValidPredicate.and(containsNumber3).test(phoneNumber3)
    );
    System.out.println(
        "Is phone number valid and contains number 3 : " +
            isPhoneNumberValidPredicate.and(containsNumber3).test(phoneNumber2)
    );

  }

  public static boolean isPhoneNumberValid(String phoneNumber) {
    return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
  }

  static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
      phoneNumber.startsWith("07") && phoneNumber.length() == 11;

  static Predicate<String> containsNumber3 = phoneNumber ->
      phoneNumber.contains("3");
}
