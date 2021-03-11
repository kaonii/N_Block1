package Calculate;

public class TowerDemoFor {
    public static void main(String[] args) {

        long startValue = 202103;


        for (int i = 2; i <= 9 ; i++) {

            System.out.println(startValue + " * " + i);
            startValue = startValue * i;
        }

        for (int i = 2; i <= 9 ; i++) {

            System.out.println(startValue + " / " + i);
            startValue = startValue / i;
        }
    }

}
