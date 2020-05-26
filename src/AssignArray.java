public class AssignArray {
    public static void main(String[] args) {
        int[] books = new int[3];

        books[0] = 90;

        System.out.println("books的长度为：" + books.length + "，books[0]为：" + books[0]);

        books = new int[90];

        System.out.println("books的长度为：" + books.length + "，books[0]为：" + books[0]);
    }
}
