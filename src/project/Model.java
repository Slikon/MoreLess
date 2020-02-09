package project;

import java.util.ArrayList;

public class Model {
    public int min;
    public int max;
    public int randNum;
    public int currNum;
    public ArrayList<Integer> numHistory;

    public boolean numIsValid(int num){
        return num > min | num < max;
    }
    public ArrayList<Integer> getNumHistory(){
        return numHistory;
    }

    public void setCurrNum(int currNum) {
        this.currNum = currNum;
    }

    public int getCurrNum() {
        return currNum;
    }

    public boolean gameWon(){
        return currNum == randNum;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setRandNum(int randNum) {
        this.randNum = randNum;
    }

    public int getRandNum() {
        return randNum;
    }
}
