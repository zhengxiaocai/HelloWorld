package codewars;

public class FindDivisor {

    public long numberOfDivisors(int n) {
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindDivisor findDivisor = new FindDivisor();
        System.out.println(findDivisor.numberOfDivisors(4)  == 3);
        System.out.println(findDivisor.numberOfDivisors(5)  == 2);
        System.out.println(findDivisor.numberOfDivisors(12) == 6);
        System.out.println(findDivisor.numberOfDivisors(30) == 8);
    }

}