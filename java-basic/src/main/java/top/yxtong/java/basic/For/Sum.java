package top.yxtong.java.basic.For;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int i= 1;
        for (; i <= 100; i++){
            if (!(i % 3 == 0)) {
                sum+=i;
            }
        } System.out.println(sum);
    }
}
