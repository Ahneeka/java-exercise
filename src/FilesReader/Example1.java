package FilesReader;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try{
            reader = new FileReader("C:\\Users\\user\\IdeaProjects\\JavaProjectDeitelBook\\src\\FilesReader\\Cohort13");
            bufferedReader = new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());

        }catch (IOException exception){
        System.out.println(exception.getMessage());
    }finally{
        if(reader != null)
            reader.close();
    }
    if(bufferedReader != null){
    bufferedReader.close();
}
 }
   }
