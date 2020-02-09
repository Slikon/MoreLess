package project;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void execute(){
        Scanner sc = new Scanner(System.in);
        scanMinMax(sc);
        model.setRandNum((int) Math.random()*(model.max-model.min) + model.min);
        view.printMessge(view.gameStarted);
        while (!model.gameWon()){
            view.printMessge(view.giveNum);
            model.setCurrNum(sc.nextInt());
            if (model.numIsValid(model.getCurrNum())){
                if(model.gameWon()){

                }
                if (model.getCurrNum() > model.getRandNum()){
                    view.printMessge(view.less);
                    model.setMax(model.getCurrNum());
                    model.numHistory.add(model.getCurrNum());
                }
                else if (model.getCurrNum() < model.getRandNum()){
                    view.printMessge(view.more);
                    model.setMin(model.getCurrNum());
                    model.numHistory.add(model.getCurrNum());
                }
            }
            else{
                view.printMessge(view.incorrectNum);
            }
        }
        //view.printHistory(model.numHistory);
        view.printMessge(view.gameFinished);
        sc.close();

    }

    private void scanMinMax(Scanner sc) {
        view.printMessge(view.giveMin);
        model.setMin(sc.nextInt());
        view.printMessge(view.giveMax);
        model.setMax(sc.nextInt());
    }
}
