/**
 * UL2
 */
public class UL2 {

    public static void main(String[] args) {

        /* hinnete ja ainepunktide massiivid*/
        
        String grade[] = {"A", "C", "D", "B", "B", "E", "D"};
        float EAP[] = {3, 3, 5, 4, 6, 2, 4};

        float number = 0; 
        float total = 0;
        float EAPtotal = 0;
    
        /* Tähtedes oleva hinde numbriks teisendamine ning vastava EAP-ga kokku korrutamine, liidan kõigi hinnete ja EAP korrutised kokku*/

        for(int i = 0; i < grade.length; i++){
            if(grade[i] == "A"){
                number = 5;
                total = total + (number * EAP[i]);
            }
            if(grade[i] == "B"){
                number = 4;
                total = total + (number * EAP[i]);
            }
            if(grade[i] == "C"){
                number = 3;
                total = total + (number * EAP[i]);
            }
            if(grade[i] == "D"){
                number = 2;
                total = total + (number * EAP[i]);
            }
            if(grade[i] == "E"){
                number = 1;
                total = total + (number * EAP[i]);
            }

            /* Arvutan palju on ainepunkte kokku*/

            EAPtotal = EAPtotal + EAP[i];
        }

        /*Arvutan kaalutud keskmise hinde*/
        
        double avg = total / EAPtotal;

        System.out.println("Kaalutud keskmine hinne: " + avg);
    }

}