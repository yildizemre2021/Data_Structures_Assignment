import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
/**
 * 190315003 - Zülfükar Minaz
 * 200315092 - Emre Yýldýz
 * 200315070 - Eren Çetiner
 */
public class Question4 {

    public static void main(String[] args) throws IOException {
        
        String fileName = "sample.txt";
        String line;
        HashSet<String> set = new HashSet<>();
        try {
            FileReader read = new FileReader(fileName);
            BufferedReader bRead = new BufferedReader(read);
            while ((line = bRead.readLine()) != null) {
                line = line.toLowerCase();
                String[] arr = line.split(" ");
                for (String s : arr) {
                    if (s.equalsIgnoreCase(""));
                    else 
                        set.add(s);   
                }
            }
            bRead.close();
            System.out.println(set.size());
        }
        catch (IOException iox) {
            System.out.println(fileName + " could not read.");
        }
    }
}