package other;

public class practice {

    String text = "without intialiser blocks";
    { String text = "with intisaliser blocks"; }

    public static void main(String[] args) {

        InitalizerTest practice = new InitalizerTest();
        System.out.println(practice.text);

    }

    private static class InitalizerTest {
        String text = "without intialiser blocks";
        { String text = "with intisaliser blocks"; }

    }
}
