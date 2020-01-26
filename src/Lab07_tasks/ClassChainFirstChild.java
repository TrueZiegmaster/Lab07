package Lab07_tasks;

public class ClassChainFirstChild extends ClassChainParent {
    public char CharValue;

    public ClassChainFirstChild(){

    }

    public ClassChainFirstChild(int input){
        super(input);
    }

    public ClassChainFirstChild(int input, char value){
        Set(input, value);
    }

    public void Set(int input, char value){
        IntValue = input;
        CharValue = value;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nIntValue: " + IntValue + "\nCharValue: " + CharValue +"\n";
    }
}
