package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adventure {


    public Adventure() {

    }

    public String rejectMission() {
        System.out.println("You've rejected the mission and will be court-martialed for insubordination and sent back to the U.S.  Game over.");
        return null;
    }
    public String acceptMission() {
        String answer = "";
        System.out.println("You've accepted the mission. Your motorcycle panniers are packed with two days of food and water, an extra set of clothes, a map and compass, and the encrypted message hidden in a bundle of love letters from your husband, Arthur. You hit the road riding through fields and bombed villages that are no more than piles of rubble. You can hear the planes flying overhead. You stop to wash the road dirt off your face in the stream before you pull into the town of Le Puy where you to plan to stay overnight. Where will you sleep? a) Approach a small inn beside the filling station. b) Camp in the woods. c) Sleep on your bike at the filling station. ");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            if (inputString.equals("a")) {
                answer = "a";
            } else if (inputString.equals("b")){
                answer = "b";
            } else {
                answer = "error";
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

    public String sleepOnBike(){
        String answer = "";
        System.out.println("You sleep, uninterrupted, on your motorcycle at the filling station and wake at sunrise.  You eat breakfast, fill your gas tank, and continue on your way. You drive for hours...");

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String inputString = bufferedReader.readLine();
//
//            if (inputString.equals("a")) {
//                answer = "a";
//            } else if (inputString.equals("b")){
//                answer = "b";
//            } else {
//                answer = "error";
//            }
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }
        return answer;

    }

    public String tryHotel() {
        String answer = "";
        System.out.println("You walk up to the inn and knock on the door. You don't speak French, but you're sure you'll be able to negotiate something. The door opens. 'Qu'est-ce que tu veux? Nous n'avons pas de chambres pour des personnes comme vous.' The anger in their voice makes the meaning clear; you're not welcome.  You turn back.  Do you a) sleep at the filling station or b) camp in the woods? ");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            if (inputString.equals("a")) {
                answer = "a";
            } else if (inputString.equals("b")){
                answer = "b";
            } else {
                answer = "error";
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

//    public String testMethod() {
//        System.out.println("Hi");
//        return null;
//    }
}
