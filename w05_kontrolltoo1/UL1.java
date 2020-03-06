/**
 * UL1
 */
/*Kaalutud keskmine*/ 
public class UL1 {

    public static void main(String[] args) {
        int EAP1 = 6;
        String grade1 = "C";
        int EAP2 = 3;
        String grade2 = "A";
        float number1 = 0;
        float number2 = 0;

        /* Teisendan esimese tähena oleva hinde numbriks */

        if(grade1 == "A"){
            number1 = 5;
        }
        if(grade1 == "B"){
            number1 = 4;
        }
        if(grade1 == "C"){
            number1 = 3;
        }
        if(grade1 == "D"){
            number1 = 2;
        }
        if(grade1 == "E"){
            number1 = 1;
        }

        /* Teisendan teise tähena oleva hinde numbriks */

        if(grade2 == "A"){
            number2 = 5;
        }
        if(grade2 == "B"){
            number2 = 4;
        }
        if(grade2 == "C"){
            number2 = 3;
        }
        if(grade2 == "D"){
            number2 = 2;
        }
        if(grade2 == "E"){
            number2 = 1;
        }

        /* Arvutan välja kaalutud keskmise */

        double avg = ((number1 * EAP1) + (number2 * EAP2)) / (EAP1 + EAP2);
        System.out.println("Kaalutud keskmine hinne: " + avg);

    }
}