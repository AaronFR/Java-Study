package combinatorPattern;

import static combinatorPattern.CustomerRegistrationValidator.ValidationResult.SUCCESS;
import static combinatorPattern.CustomerRegistrationValidator.isAdult;
import static combinatorPattern.CustomerRegistrationValidator.isPhoneNumberValid;

import combinatorPattern.CustomerRegistrationValidator.ValidationResult;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alic@egmail.com",
                "0898787879878",
                LocalDate.of(2000,1,1)
        );

//        System.out.println(new CustomerValidatorService().isValidCustomer(customer));

        // We can store customer in db providing the customer is valid

        // Using combinator pattern
        ValidationResult result = CustomerRegistrationValidator
                .isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
