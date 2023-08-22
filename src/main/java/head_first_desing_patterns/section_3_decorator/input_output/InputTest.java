package head_first_desing_patterns.section_3_decorator.input_output;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {

        int c;

        try(InputStream in =
           new LowerCaseInputStream(
           new BufferedInputStream(
           new FileInputStream("src/main/java/head_first_desing_patterns/section_3_decorator/input_output/test.txt")))){
            while ((c=in.read())>=0){
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
