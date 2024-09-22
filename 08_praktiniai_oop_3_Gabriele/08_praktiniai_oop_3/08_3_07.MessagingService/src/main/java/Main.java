
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();

        Message message1 = new Message("Tom", "This is a short message.");
        Message message2 = new Message("Ben", "In today's fast-paced world, staying connected with friends, family, and colleagues is more important than ever. Whether through social media platforms, messaging apps, or emails, people are constantly sharing updates, ideas, and experiences. However, it is crucial to be mindful of the content we share, ensuring that it is accurate, respectful, and contributes positively to the conversations we are part of. With the rise of misinformation, taking a moment to verify sources and think before posting can make a significant difference in fostering a more informed and considerate online community");

        System.out.println(message1);
        System.out.println(message2);

    }
}


