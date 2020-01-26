package Lab07_tasks;

public class TextSuperClassChild extends TextSuperClass {
    private String Text1;
    private String Text2;

    public TextSuperClassChild(String input){
        super(input);
    }

    public TextSuperClassChild(String input1, String input2){
        Text1 = input1;
        Text2 = input2;
    }

    @Override
    public String toString(){
        return "Class: " + getClass().getSimpleName() + "\nText1: " + Text1 + "\nText2: " + Text2 + "\n";
    }
}
