public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int outputNum;

        if (n % 5 == 0 && n % 3 == 0){
            outputNum = (n-1)/5 + (n-1)/3;
        } else if (n % 5 == 0) {
            outputNum = (n-1)/5 + n/3;
        } else if (n % 3 == 0) {
            outputNum = n/5 + (n-1)/3;
        }else {
            outputNum = n/5 + n/3;
        }

        System.out.println(outputNum);
    }
}
