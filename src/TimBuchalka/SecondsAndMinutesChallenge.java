package TimBuchalka;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(61,75));
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes>=0 && seconds >=0 && seconds<60) {
            int hour = minutes / 60;
            int refinedMinutes = minutes % 60;
            return hour+ "h " + refinedMinutes +"m " + seconds +"s";
        }
        return "INVALID VALUE";
    }
}
