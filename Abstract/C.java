
import java.io.FileOutputStream;
import java.io.PrintStream;

class C extends A {
    void print(String msg){
        try{
           new PrintStream(new FileOutputStream("Output.txt"));
           return null;
        }
    }
}
