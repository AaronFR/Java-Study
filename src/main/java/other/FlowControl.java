package other;

public class FlowControl {

    public static void main(String[] args) {
        System.out.println("While Loops");
        int x = 4;
        //while(x << 5) { } // '<<' is the boolean bitwise left shift operator, remember?
        while(1 < x--){
            System.out.println(x);
        }

        System.out.println();
        do { // this is the correct use of a 'do-while' loop
            System.out.println(x);
        }
        while (3 > x++);

        System.out.println("\nBreaks and Continues");
        inner: for (int i = 0; i < 4; i++) {
            if (i == 2) {
                continue inner; // note the use of labels (superfluous in this example)
            }
            System.out.println(i);

            if (i == 4) {
                break; // breaks 'break' the entire loop
            }
        }
    }
}
