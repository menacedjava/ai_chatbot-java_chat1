import java.util.*;

public class ChatBot {
    static Map<String, String> memory = new HashMap<>();

    static String reply(String input) {
        if (input.toLowerCase().contains("hello"))
            return "Hello there!";
        if (input.toLowerCase().contains("weather"))
            return "I don't know, but probably sunny!";
        return "Hmm... tell me more.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AI ChatBot ready!");
        while (true) {
            System.out.print("You: ");
            String msg = sc.nextLine();
            System.out.println("Bot: " + reply(msg));
        }
    }
}
