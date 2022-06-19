package homework12_Files_and_Input_output.task2;

import java.io.*;

public class MainAppTask2 {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("D:\\JAVA\\HomeWork\\Lesson12\\src\\lesson12\\task2\\Dialog.txt"));
        String ln = lnr.readLine();
        FileWriter romeo = new FileWriter("D:\\JAVA\\HomeWork\\Lesson12\\src\\lesson12\\task2\\Romeo.txt");
        FileWriter juliet = new FileWriter("D:\\JAVA\\HomeWork\\Lesson12\\src\\lesson12\\task2\\Juliet.txt");

        while (ln != null) {
            if (ln.startsWith("ROMEO")) {
                while (!ln.startsWith("JULIET")) {
                    romeo.write(ln + "\n");
                    ln = lnr.readLine();
                    if (ln == null) {
                        break;
                    }
                }
            } else if (ln.startsWith("JULIET")) {
                while (!ln.startsWith("ROMEO")) {
                    juliet.write(ln + "\n");
                    ln = lnr.readLine();
                    if (ln == null) {
                        break;
                    }
                }
            }
        }

        lnr.close();
        romeo.close();
        juliet.close();

    }
}
