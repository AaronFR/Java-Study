package other;

public class assignments {

    public static void main(String[] args) {
        // int arr[4] = new int[4]; // it is illegal to specify the length in the identifier
        int arr[] = new int[4];

        int arr1[] = new int[2]; // you might expect this code to fail, but the values ARE being initalised!
        System.out.println(arr1[0]);

        Test test = new Test();
        test.explanation = "The second constructor seems very weird, but it is none the less valid as you can see.";
        Test test2 = new Test(test);
        System.out.println(test2.explanation); // what do you think this will output? You remember why?
    }

    static class Test {
        String explanation;

        Test () {}
        Test (Test t) {}
    }
}
