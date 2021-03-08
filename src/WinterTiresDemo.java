public class WinterTiresDemo {
    public static void main(String[] args) {

        int temperature1 = 52; // °C
        int temperature2 = 28;
        int temperature3 = 8;
        int temperature4 = 4;
        int temperature5 = -15;
        boolean slippery1 = true;
        boolean slippery0 = false;


        System.out.println(temperature1 + "°C " + "slippery" + " = " + winterTiresCompulsory(temperature1, slippery1));
        System.out.println(temperature2 + "°C " + "slippery" + " = " + winterTiresCompulsory(temperature2, slippery1));
        System.out.println(temperature3 + "°C " + "not slippery" + " = " + winterTiresCompulsory(temperature3, slippery0));
        System.out.println(temperature4 + "°C " + "slippery" + " = " + winterTiresCompulsory(temperature4, slippery1));
        System.out.println(temperature4 + "°C " + "not slippery" + " = " + winterTiresCompulsory(temperature4, slippery0));
        System.out.println(temperature5 + "°C " + "slippery" + " = " + winterTiresCompulsory(temperature5, slippery1));
    }

    public static String winterTiresCompulsory(int temperature, boolean slipperyRoad) {
        if (temperature < -100 || temperature > 50) {
            return "error";
        } else if ((temperature < 10 && slipperyRoad) || temperature < 4) {
            return "Please use winter tires";
        } else {
            return "Winter tires are not necessary";
        }

    }
}
