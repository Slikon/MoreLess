package project;

import java.util.ArrayList;

public class View {
    public String more = "More";
    public String less = "Less";
    public String gameStarted = "Game started! Number generated!";
    public String gameFinished = "You win!";
    public String giveMin = "Enter min value : ";
    public String giveMax = "Enter max value : ";
    public String giveNum = "Enter value : ";
    public String incorrectNum = "Number is not valid";



    public void printMessge(String message){
        System.out.println(message);
    }

   /* public void printHistory(ArrayList<Integer> list){
        for(int num : list)
            System.out.print(num + ", ");
    }*/

}
