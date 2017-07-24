package WarmUp;
import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {
		String[] inputTimeArray  = s.split(":");
		String AMPM = inputTimeArray[2].substring(2);
		Integer hours = Integer.parseInt(inputTimeArray[0]);
		if((hours == 12)&&(AMPM.equalsIgnoreCase("AM"))){
			hours = 00;
		} else if((hours < 12)&&(AMPM.equalsIgnoreCase("PM"))){
			hours = hours+12;
		}
		String time = hours.toString().format("%02d", hours)+":"+inputTimeArray[1]+":"+inputTimeArray[2].substring(0, 2);
		return time;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
