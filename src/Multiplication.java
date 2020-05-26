public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                if (i == j) {
                    System.out.println();
                    break;
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            String line = "";
            for (int j = 1; j < 10; j++) {
                line += i + "*" + j + "=" + i * j + "\t";
                if (i == j) {
                    System.out.println(line);
                    break;
                }
            }
        }
    }
}
