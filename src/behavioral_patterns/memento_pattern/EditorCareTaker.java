package behavioral_patterns.memento_pattern;

import java.util.Stack;

public class EditorCareTaker {
    private final Stack<TextEditorOriginator.Memento> history = new Stack<>();
    private final TextEditorOriginator textEditorOriginator = new TextEditorOriginator();
    public void write(String text){
        textEditorOriginator.setText(text);
        history.add(textEditorOriginator.takeSnapshot());
    }
    public void display(){
        System.out.println(textEditorOriginator.getText());
    }
    public void undo(){
        if(history.empty()){
            System.out.println("Nothing to undo!");
            return;
        }
        textEditorOriginator.restore(history.pop());
    }
}
