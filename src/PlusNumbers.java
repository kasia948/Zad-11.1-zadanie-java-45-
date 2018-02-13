import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusNumbers {
    public static void main(String[] args) {
        List<Integer> plusNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int liczba;

        do {
            System.out.println("Podaj liczbę dodatnią");
            liczba = input.nextInt();
            if (liczba > 0)
                plusNumbers.add(liczba);
            }while (liczba > 0) ;

        System.out.println(plusNumbers.toString());

        System.out.print("Lista od końca: ");
        for (int i = plusNumbers.size() - 1; i >= 0; i--) {
            System.out.print(" " + plusNumbers.get(i));
        }
        System.out.println();
        System.out.println("Suma wszsytkich elementów:" );

        int x=0;
        for (int i = 0; i < plusNumbers.size(); i ++) {
            x= x+plusNumbers.get(i);
            System.out.print(plusNumbers.get(i));
            System.out.print("+");
        }
        System.out.println("="+x);


        int maxNumber=plusNumbers.get(0);
        for (int i = 0; i <plusNumbers.size() ; i++) {
            if (maxNumber<plusNumbers.get(i)){
                maxNumber=plusNumbers.get(i);
            }
        }
        System.out.println("Największa wartość :"+maxNumber);

        int minNumber=plusNumbers.get(0);
        for (int i = 0; i <plusNumbers.size() ; i++) {
            if (minNumber>plusNumbers.get(i)){
                minNumber=plusNumbers.get(i);
            }
        }
        System.out.println("Najmniejsza wartość :"+minNumber);

    }

}

//        do {
//                System.out.println("Podaj kolejny element (lub stop):");
//                tekst = input.nextLine();
//                if (!tekst.equals("stop"))
//                lista.add(tekst);
//
//                } while (!tekst.equals("stop"));
