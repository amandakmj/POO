public class Main {
    public static void main(String[] args) {
        PhotoPost p1 = new PhotoPost("Alice","ABC", "apagou");
        MessagePost m1 = new MessagePost("Marcos", "sai fora");
        NewsFeed n1 = new NewsFeed();
        n1.addPost(m1);
        n1.addPost(p1);
        m1.addComment("foto top");
        m1.like();
        n1.show();

    }
}
