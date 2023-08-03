package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        int answer;
        answer = (a*a*9 - 5*b + 2 + a - 7)*((a+b-(a*b*4))/2);
        System.out.println(answer);
    }
}
