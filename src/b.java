import java.io.BufferedReader;
import java.io.FileReader;
public class b {
    String[] line = new String[10];
    public static void main(String[] args) throws Exception {
        FileReader fReader = new FileReader("/Users/Dark/desktop/menu.txt");
        BufferedReader bReader = new BufferedReader(fReader);
//        String[] str = new String[10];
        String str = null;
        String[] line = new String[10];
        while ((str = bReader.readLine())!=null) {
            /*System.out.println(str);*/
            line= str.split(" ");
            System.out.println(line[1]);
        }
/*        for (int i = 0; i < 6; i++) {
            while ((str[i] = bReader.readLine())!=null) {
                System.out.println(str[i]);
                line[i] = str[i];
                System.out.println(line[i]);
            }
        }*/
        /*System.out.println(line[1]);*/
    }
}
