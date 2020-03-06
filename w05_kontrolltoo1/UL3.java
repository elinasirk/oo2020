import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * UL3
 */
public class UL3 {

    public static void main(String[] args) throws IOException {
        List<String> ained = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("ained.txt"));
        String line = reader.readLine();

        while(line != null){
            ained.add(line);
            line = reader.readLine();
        }

        float number = 0; 
        float total = 0;
        float EAPtotal = 0;
    
        /* Tähtedes oleva hinde numbriks teisendamine ning vastava EAP-ga kokku korrutamine, liidan kõigi hinnete ja EAP korrutised kokku*/

        for(int i = 0; i < ained.size(); i++){
            String[] lineContent = ained.get(i).split(" ");

            String grade = lineContent[1];
            System.out.println(grade);

            if(grade.equals("A")){
                number = 5;
                total = total + (number * Float.parseFloat(lineContent[2]));
            }
            if(grade.equals("B")){
                number = 4;
                total = total + (number * Float.parseFloat(lineContent[2]));    
            }
            if(grade.equals("C")){
                number = 3;
                total = total + (number * Float.parseFloat(lineContent[2]));
            }
            if(grade.equals("D")){
                number = 2;
                total = total + (number * Float.parseFloat(lineContent[2]));
            }
            if(grade.equals("E")){
                number = 1;
                total = total + (number * Float.parseFloat(lineContent[2]));
            }

            /* Arvutan palju on ainepunkte kokku*/

            EAPtotal = EAPtotal + Float.parseFloat(lineContent[2]);

            reader.close();
        
    }
            /*Arvutan kaalutud keskmise hinde*/

            double avg = total / EAPtotal;

            System.out.println();

            BufferedWriter writer = new BufferedWriter (new FileWriter("keskmine.txt"));
            writer.write("Kaalutud keskmine hinne: " + avg);
            writer.close();

}
}
