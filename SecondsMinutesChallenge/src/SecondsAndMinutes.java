public class SecondsAndMinutes {

    private static String INVALID_VALUE_MESSAGE = "Invalid Value.";


    public static void main(String[] args) {


       String test1 =  getDurationString(-1,0);
       String test2 =  getDurationString(0,-1);
       String test3 =  getDurationString(0,60);
       String test4 =  getDurationString(62,34);
       String test5 =  getDurationString(128000,8);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);


        String test6 = getDurationString(125);
        System.out.println(test6);

    }


    public static String getDurationString(int minutes, int seconds){

        if (minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60 ;
        minutes %= 60;
        String hoursString = hours + "h ", minutesString = minutes+"m ", secondsString = seconds + "s ";
        //add a "0" if hours minutes or seconds are less than 10 to our string
        if (hours < 10){
             hoursString = "0" + hoursString;
        }
        if (minutes < 10){
            minutesString = "0" + minutesString;
        }
        if (seconds < 10){
            secondsString = "0" +secondsString;
        }
        return (hoursString + " " + minutesString + " " + secondsString);
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds /60;
        seconds %= 60;
        return getDurationString(minutes,seconds);
    }
}
