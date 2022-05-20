package Task2;

import java.io.*;

public class MainAppTask2 {
    public static void main(String[] args) throws IOException {
        Reader dialogReader = new FileReader("D:\\JAVA\\HomeWork\\Lesson12\\src\\Task2\\Dialog.txt");
        LineNumberReader lnr = new LineNumberReader(dialogReader);
        String ln = lnr.readLine();
        FileWriter romeo = new FileWriter("D:\\JAVA\\HomeWork\\Lesson12\\src\\Task2\\Romeo.txt");
        FileWriter juliet = new FileWriter("D:\\JAVA\\HomeWork\\Lesson12\\src\\Task2\\Juliet.txt");

        while (ln != null) {
            if (ln.startsWith("ROMEO")) {
                do {
                    romeo.write(ln + "\n");
                    ln = lnr.readLine();
                    if (ln == null) {
                        break;
                    }
                } while (!ln.startsWith("JULIET"));
            } else if (ln.startsWith("JULIET")) {
                do {
                    juliet.write(ln + "\n");
                    ln = lnr.readLine();
                    if (ln == null) {
                        break;
                    }
                } while (!ln.startsWith("ROMEO"));
            }
        }

        dialogReader.close();
        lnr.close();
        romeo.close();
        juliet.close();

    }
}
