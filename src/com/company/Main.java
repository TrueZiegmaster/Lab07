package com.company;

import Lab07_tasks.*;

public class Main {

    public static void main(String[] args) {
        //region TASK_1
        TextSuperClass parent = new TextSuperClass("Hello!");
        System.out.println(parent.toString());
        TextSuperClassChild child1 = new TextSuperClassChild("Hello");
        System.out.println(child1.toString());
	    TextSuperClassChild child2 = new TextSuperClassChild("Hello", "world!");
	    System.out.println(child2.toString());
        //endregion

        //region TASK_2
        StringSuperClass ssc = new StringSuperClass("Hello");
        System.out.println(ssc.Length());
        StringSuperClassChild ssc_child = new StringSuperClassChild("Hello", 5);
        ssc_child.Set(0);
        ssc_child.Set("Bye");
        //endregion

        //region TASK_3
        ClassChainParent cc_p = new ClassChainParent(6);
        ClassChainFirstChild cc_fc = new ClassChainFirstChild(7, 'C');
        ClassChainSecondChild cc_sc = new ClassChainSecondChild(-3, 'F', "Hello!");
        System.out.println(cc_p.toString());
        System.out.println(cc_fc.toString());
        System.out.println(cc_sc.toString());
        //endregion

        //region TASK_4
        InheritClassChainParent icc_p = new InheritClassChainParent('A');
        InheritClassChainParent icc_p1 = new InheritClassChainParent(icc_p);
        InheritClassChainFirstChild icc_fc = new InheritClassChainFirstChild('B', "Hello");
        InheritClassChainFirstChild icc_fc1 = new InheritClassChainFirstChild(icc_fc);
        InheritClassChainSecondChild icc_sc = new InheritClassChainSecondChild('C', "World!", 100);
        InheritClassChainSecondChild icc_sc1 = new InheritClassChainSecondChild(icc_sc);

        System.out.println(icc_p1.CharValue);
        System.out.println(icc_fc1.CharValue + " " + icc_fc1.StringValue);
        System.out.println(icc_sc1.CharValue + " " + icc_sc1.StringValue + " " + icc_sc1.IntValue);
        System.out.println();
        //endregion

        //region TASK_5
        ClassTreeParent ct_p = new ClassTreeParent("Hello World!");
        ClassTreeFirstChild ct_fc = new ClassTreeFirstChild("I am", 19);
        ClassTreeSecondChild ct_sc = new ClassTreeSecondChild("Letter ", 'F');
        System.out.println(ct_p.toString());
        System.out.println(ct_fc.toString());
        System.out.println(ct_sc.toString());

        ct_p = new ClassTreeFirstChild("I am", 19);
        System.out.println(ct_p.toString());
        ct_p = new ClassTreeSecondChild("Letter", 'F');
        System.out.println(ct_p.toString());
        //endregion
    }
}
