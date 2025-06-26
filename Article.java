import java.util.HashSet;
import java.util.Set;

public class Article {
    public static void main(String[] args) {
        int count = args.length;
        System.out.println(count);

        if (count == 0) {
            System.out.println("No arguments provided!");
            return;
        }

        Set<String> articles = new HashSet<>();
        articles.add("a");
        articles.add("an");
        articles.add("the");

        for (int i = 0; i < count; i++) {
            if (articles.contains(args[i].toLowerCase())) {
                System.out.println(args[i]);
            }
        }
    }
}

