public class NotenDemo {
    public static void main(String[] args) {

        int points1 = 49;
        int points2 = 53;
        int points3 = 76;
        int points4 = 100;
        int points5 = 103;

        System.out.println(getGradesText(points1));
        System.out.println(getGradesText(points2));
        System.out.println(getGradesText(points3));
        System.out.println(getGradesText(points4));
        System.out.println(getGradesText(points5));


    }

    public static String getGradesText(int points) {
        if (points > 100 || points < 0)  {
            return "Error";
        } else if (points >= 90) {
            return "Very Good";
        } else if (points >= 78) {
            return "Good";
        } else if (points >= 65) {
            return "Satisfying";
        } else if (points >= 51) {
            return "Sufficient";
        } else if (points <= 50) {
            return "Nope";
        } else {
            return "Error";
        }
    }

}
