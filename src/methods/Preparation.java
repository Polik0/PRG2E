package methods;

import java.util.Arrays;

public class Preparation {
    public static int hosts(String ip) {
        String[] parts = ip.split("/");
        System.out.println(Arrays.toString(parts));
        int power = Integer.parseInt(parts[1]) - 16;
        int result = (int)(Math.pow(2, power));
        return result;
    }

    public static void main(String[] args) {
        hosts("192.168.1.8/24");
    }
}
