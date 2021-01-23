package com.lab4;

public class TextLogic {

    private static TextLogic instance;
    private TextLogic(){}
    public static TextLogic getInstance(){
        if (instance == null){
            instance = new TextLogic();
        }
        return instance;
    }

    public void ander(String name, String ... args) throws ParameterException{
        class LogicAnd{
            LogicAnd(){
                String text;
                text = name;
                int size = args.length;
                int i = 0;
                text += " " + args[0];

                if (size <= 2) {
                    for(i = 1; i < size; i++){
                        text += " и " + args[i];
                    }
                }
                else {
                    for(i = 1; i < size; i++){
                        text += ", и " + args[i];
                    }
                }
                text += ".";
                System.out.println(text);
            }
        }

        for (int j = 0; j < args.length; ++j) {
            if(args[j] == ""){
                throw new ParameterException("Uncorrect array input");
            }
        }

        LogicAnd logicAnd = new LogicAnd();
    }

    public void act(String move, String nameMover, String moveNarrator, String nameNarrator){
        System.out.println( " - " + move + " " + nameMover + "! - " + moveNarrator + " " + nameNarrator + ".");
    }
}
