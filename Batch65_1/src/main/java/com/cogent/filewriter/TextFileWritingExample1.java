package com.cogent.filewriter;
import java.io.FileWriter;
import java.io.IOException;
 

public class TextFileWritingExample1 {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/Users/fan/eclipse-workspace/Batch65_1/src/main/java/com/cogent/filewriter/MyFileAmit.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
           
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}
