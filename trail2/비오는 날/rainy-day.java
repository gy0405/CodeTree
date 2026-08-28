import java.util.Scanner;

//가장 이른 날짜에 비가 오는 날 찾기

class Weather{
    String date  = "9999-99-99";
    String day;
    String weather;

    public Weather(){};

    public Weather(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public void printWeather(){
        System.out.printf("%s %s %s", this.date, this.day, this.weather);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] arr = new Weather[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            arr[i] = new Weather(date, day, weather);
        }

        Weather answer = new Weather();

        for (int i = 0; i < n; i++){
            if (arr[i].weather.equals("Rain")){
                if (arr[i].date.compareTo(answer.date) < 0){ //arr[i] < answer
                    answer = arr[i];
                }
            }
        }

        answer.printWeather();
    }
}