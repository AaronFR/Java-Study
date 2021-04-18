package finalSection;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        String input = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";

        System.out.println(getSmallestAndLargest(input, 30));
    }

    public static String getSmallestAndLargest(String s, int k) {
        // CAN'T USE ARRAYLIST AND LIST IN THIS CHALLENGE

        String[] subStrings = new String[s.length() - k + 1];
        for (int start = 0; start <= s.length() - k; start++) {
            subStrings[start] = s.substring(start, start + k);
        }

        int counter = 0;
        String smallest = subStrings[0];
        String largest = subStrings[0];
        for (String s1 : subStrings) {
            if (subStrings[counter].compareTo(smallest) < 0) {
                smallest = subStrings[counter];
            }
            if (subStrings[counter].compareTo(largest) > 0) {
                largest = subStrings[counter];
            }
            counter++;
        }

//        ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
//        sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs

        return smallest + "\n" + largest;
    }

    public static String yourMethod(String s, int k) {
        // CAN'T USE ARRAYLIST AND LIST IN THIS CHALLENGE
        // Yours worked but failed for 2 tests.
        // Can't really tell why though, without digging into the sets

        // Best way I would say you could have predicted it given another try was CODE SMELLS
        // 1 : smallest and largest should have been set to values in the array, not empty lists.
        // 2 : You shouldn't define an arbitrarily high and arbitrarily low value for comparison.

        String smallest = "";
        String largest = "";

        String[] subStrings = new String[s.length() - k + 1];
        for (int start = 0; start < s.length() - k + 1; start++) {
            subStrings[start] = s.substring(start, start + k);
        }

        Integer lowestValue = 1000;
        int lowestValueIndex = 0;
        Integer highestValue = 0;
        int highestValueIndex = 0;
        int counter = 0;
        for (String s1 : subStrings) {
            if (Integer.valueOf(s1.charAt(0)) < lowestValue) {
                lowestValue = Integer.valueOf(s1.charAt(0));
                lowestValueIndex = counter;
            }
            if (Integer.valueOf(s1.charAt(0)) > highestValue) {
                highestValue = Integer.valueOf(s1.charAt(0));
                highestValueIndex = counter;
            }
            counter++;
        }

        smallest = subStrings[lowestValueIndex];
        largest = subStrings[highestValueIndex];
//        ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
//        sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

}
