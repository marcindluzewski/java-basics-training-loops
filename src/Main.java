import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//   int a = 3;
//   int b = 4;
//   a += 7; // dodanie wartości do zmiennej a -> a = a + 7
//        a++; // -> a = a + 1
//        b %= 2; //modulo dzielenie czyli dzieli przez 2 i pokazuje resztę
//           System.out.println(a);
//        System.out.println(b);
//
//        /*1*/ int x=3;
//        /*2*/ int y;
//        /*3*/ System.out.println(x++); // =3
//        /*4*/ System.out.println(++x); // =5
//        /*5*/ System.out.println(x); // =5
//        /*6*/ y = x++; // =5
//        /*7*/ System.out.println (y); // =5
//        /*8*/ y = ++x;
//        /*9*/ System.out.println (y); // =7
//        /*10*/ System.out.println (++y); // =8
//        int [] tablicaCyfr = new int[5];
//        tablicaCyfr = new int[]{1, 2, 3, 4, 5};
//        System.out.println(tablicaCyfr[2]);
        String [] tablicaPieskow = new String [4];
        tablicaPieskow = new String[]{"Azor", "Boss", "King", "Kudłaty"};
//        System.out.println(tablicaPieskow[2]);
        for (int i = 0; i < tablicaPieskow.length ; i++){
            System.out.println(tablicaPieskow[i]);
        }

    }
}


// Aplikacja bankowa
//        1. Ustawiamy saldo usera
//        2. Można wpłacić kase na konto
//        3. Można wypłacić kase z konta
//        4. Jeżeli wypłata będzie ponad stan konta to pokazuje error
