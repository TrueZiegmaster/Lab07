package Lab07_tasks;

public class ClassTreeSecondChild extends ClassTreeParent {
    protected char CharValue;

    public ClassTreeSecondChild(String text, char value){
        StringValue = text;
        CharValue = value;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nStringValue: " + StringValue + "\nCharValue: " + CharValue + "\n";
    }
}
