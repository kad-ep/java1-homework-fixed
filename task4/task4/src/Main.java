public class Main {
    public static void main(String[] args) {
        int[] numsArr = {5,6,7,12,-5,32,43};
        int result = 0;
        for (int num : numsArr) {
            result += num;
        }
        System.out.println(result);

    }
}