

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class jaga {

    public static void main(String[] args) throws IOException {
    
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));
        ArrayList<Integer> korvid = new ArrayList<Integer>();
        String line;

        int sum = 0;
        int koht = 0;

        line = reader.readLine();

        while(line != null){
            korvid.add(Integer.valueOf(line));
            line = reader.readLine();
        }

        reader.close();

        int kogus = korvid.get(0);

        for (int i=1; i <= kogus; i++){
            sum += korvid.get(i);

        }

        if (sum / 2 == korvid.get(1) ){
            koht = 1;
        }

        if (sum / 2 == (korvid.get(1) + korvid.get(2))){
            koht = 2;
        }

        if (sum / 2 == (korvid.get(1) + korvid.get(2) + korvid.get(3))){
            koht = 3;
        }

        if (sum / 2 == (korvid.get(1) + korvid.get(2) + korvid.get(3)) + korvid.get(4)){
            koht = 4;
        }


        

        





        

}
}



    