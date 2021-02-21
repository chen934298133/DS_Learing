package Design_Pattern.Pattern_3_DecoratorPattern.IO_3;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;

        try {
            in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("H:\\Git\\design_pattern\\Head-First-Design-Patterns-master\\Head-First-Design-Patterns-master\\src\\headfirst\\designpatterns\\decorator\\io\\test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) { in.close(); }
        }

        // -------------------------------有什么大的区别？--------------------------------
        System.out.println();

        try (InputStream in2 =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream("H:\\Git\\design_pattern\\Head-First-Design-Patterns-master\\Head-First-Design-Patterns-master\\src\\headfirst\\designpatterns\\decorator\\io\\test.txt")))) {
            while ((c = in2.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
