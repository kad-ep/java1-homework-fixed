public class Main {
    public static void main(String[] args) {
        int[] numsArr = {5,6,7,12,-5,32,43,6,12};
        String result = "";
        for (int i = 0; i < numsArr.length; i++) {
            for (int j = i+1; j < numsArr.length; j++) {
                if (numsArr[i] == numsArr[j] ) {
                    if (result.length()>0 ){
                        result += ", " + numsArr[j];
                    }
                    else{
                        result += numsArr[j];
                    }
                }
            }
        }

        System.out.println(result);

    }
}