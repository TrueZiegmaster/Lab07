package Lab07_tasks;

public class InheritClassChainParent {
    public char CharValue;

    public InheritClassChainParent(){

    }

    public InheritClassChainParent(char value){
        CharValue = value;
    }

    public InheritClassChainParent(InheritClassChainParent obj){
        CharValue = obj.CharValue;
    }
}
