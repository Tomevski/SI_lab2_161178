import java.util.ArrayList;
import java.util.List;



class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) {                                                   //A
        List<Integer> result = new ArrayList<>();                                                           //B

        for (int i = 0; i < timesList.size(); i++) {                                                        //C1 C2 C3
            int hr = timesList.get(i).getHours();                                                           //D
            int min = timesList.get(i).getMinutes();                                                        //E
            int sec = timesList.get(i).getSeconds();                                                        //F
            if (hr < 0 || hr > 24) {                                                                         //G
                if (hr < 0) {                                                                                //H
                    throw new RuntimeException("The hours are smaller than the minimum");                   //I
                } else {                                                                                      //J
                    throw new RuntimeException("The hours are grater than the maximum");                    //K
                }
            } else if (hr < 24) {                                                                             //L
                if (min < 0 || min > 59)                                                                    //M
                    throw new RuntimeException("The minutes are not valid!");                               //N
                else {                                                                                      //O
                    if (sec >= 0 && sec <= 59)                                                              //P
                        result.add(hr * 3600 + min * 60 + sec);                                             //Q
                    else                                                                                    //R
                        throw new RuntimeException("The seconds are not valid");                            //S
                }
            } else if (hr == 24 && min == 0 && sec == 0) {                                                    //T
                result.add(hr * 3600 + min * 60 + sec);                                                     //U
            } else {                                                                                          //V
                throw new RuntimeException("The time is greater than the maximum");                         //W
            }
        }                                                                                                   //X
        return result;                                                                                      //Y
    }                                                                                                       //Z

    public static void main(String[] args) {
        System.out.println("app");
    }
}

