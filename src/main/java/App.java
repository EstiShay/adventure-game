import models.Adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {

        Adventure newGame = new Adventure();

        System.out.println("Setting: August 1944 in partially occupied France.  You are Bessie Stringfield, the Motorcycle Queen of Miami, an African-American motorcycling pioneer. Your skills performing difficult stunts at carnivals and winning races has made you a legend. You are now a motorcycle dispatch rider with the U.S. Army. Your mission, should you choose to accept it, is to carry an encrypted message to the front lines.  Between you and your destination is war-torn country with damaged roads, desperate citizens, and partisan fighters.  And, unfortunately, the racism you have faced your whole life. Do you a) accept the mission, or b) reject it?");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            String lePuyInput = "";

            if (inputString.equals("a")){
                lePuyInput = newGame.acceptMission();
            } else if (inputString.equals("b")){
                newGame.rejectMission();
            } else {
                System.out.println("Error");
            }

            String hotelInput = "";
            String campingInput = "";
            String sleepOnBikeInput = "";
            String hotelOutcome = "";

            if (lePuyInput.equals("a")){
                hotelOutcome = newGame.tryHotel();
                if (hotelOutcome.equals("a")){
                    newGame.sleepOnBike();
                } else if (hotelOutcome.equals("b")){
//                    newGame.campInWoods();
                } else {
                    System.out.println("tryHotel error");
                }
//            } else if (lePuyInput.equals("b")){
//                    newGame.campInWoods();
            } else if (lePuyInput.equals("c")) {
                sleepOnBikeInput = newGame.sleepOnBike();
            } else {
                System.out.println("lePuyInput error");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
