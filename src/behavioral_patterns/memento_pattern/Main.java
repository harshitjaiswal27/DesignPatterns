package behavioral_patterns.memento_pattern;

public class Main {
    public static void main(String[] args) {
        EditorCareTaker editorCareTaker = new EditorCareTaker();
        editorCareTaker.write("Hey there!");
        editorCareTaker.write("Hey there, I'm memento pattern!");
        editorCareTaker.write("Mistake");
        editorCareTaker.display();
        editorCareTaker.undo();
        editorCareTaker.undo();
        editorCareTaker.display();
        editorCareTaker.undo();
        editorCareTaker.display();
        editorCareTaker.undo();
    }
}
