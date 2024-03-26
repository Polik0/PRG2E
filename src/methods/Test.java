package methods;

import java.lang.reflect.Array;

public class Test {
    static void checkPulse(int[] pulses) {
        int currentPulse = pulses[0];
        for (int i = 1; i < pulses.length+1; i++) {
            if (Math.abs(pulses[i] - currentPulse)>30) {
                System.out.println("danger");
                return;
            } else if (Math.abs(pulses[i] - currentPulse)==0){
                System.out.println("dead");
                return;
            }
            currentPulse = pulses[i];
        }
        System.out.println("ok");
    }

    static int random(int places, int price, int days) {
        int res = places*days*price;
        if (places > 10) {
            res -= res*0.9;
        }
        return res;
    }

    static void newerDate(String date, String otherDate) {
        String[] dateOne = date.split(".");
        String[] dateTwo = otherDate.split(".");
            if (Integer.parseInt(dateOne[2]) < Integer.parseInt(dateTwo[2])) {
                System.out.println("date rwo je starsi");
            } else if (Integer.parseInt(dateOne[2]) == Integer.parseInt(dateTwo[2])) {
                if (Integer.parseInt(dateOne[1]) < Integer.parseInt(dateTwo[1])) {
                    System.out.println("date two je starsi");
                } else {
                    System.out.println("date one je starsi");
                }
            }
    }
    public static void main(String[] args) {

    }
}
