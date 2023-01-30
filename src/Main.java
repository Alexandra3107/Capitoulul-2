import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Exercitiul b.1
        /*int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Introdu un numar de la tastura: ");
        number = input.nextInt();

        System.out.println("Calculatorul va genera un numar random intre 1 si 100.");

        Random randomNumber = new Random();

        int numarGenerat = randomNumber.nextInt(100);
        System.out.println(numarGenerat);

        if (number<numarGenerat){
            System.out.println("Numarul introdus este mai mic decat " + numarGenerat);
        }*/

        // Exercitiul b.2
       /*nt numar1;
        int numar2;
        String caracter;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti doua numere ");
        numar1 = input.nextInt();
        numar2 = input.nextInt();
        System.out.println("Introducteti prima litera de la operatatia care doriti sa fie efectuata cu cele doua numare ");
        caracter = input.next();
        System.out.println("Ati introdus " + caracter);

        switch (caracter) {
            case "a":
                System.out.println(numar1 + " + " + numar2 + " = " + (numar1+numar2));
                break;
            case "s" :
                System.out.println(numar1 + " - " + numar2 + " = " + (numar1-numar2));
                break;
            case "i" :
                System.out.println(numar1 + " x " + numar2 + " = " + (numar1*numar2));
                break;
            case "p":
                System.out.println(numar1 + " / " + numar2 + " = " + (numar1/numar2));
                break;
            case "m" :
                System.out.println(numar1 + " mod " + numar2 + " = " + (numar1%numar2));
            default:
                System.out.println("Caracterul introdus nu este valid.");
}*/
// Exercitiul b3 : Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente. //
        //nitializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.

//        int[][] elemente = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15}
//        };
//        System.out.println("Primele elemente sunt: ");
//        for (int i = 0; i < elemente.length; i++) {
//            int j = 0;
//            System.out.println(elemente[i][j]);
//        }
//        System.out.println("Ultimele elemente sunt: ");
//        for ( int i = 0; i < elemente.length; i++){
//            int j = elemente[i].length-1;
//            System.out.println(elemente[i][j]);
//        }

    //Exercitiul b4
//Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran cate al doilea caracter din sir.

//        char[] array = {'a', 'b', 'c', 'd', 'e', 'f','g'};
//        for (int i = 0; i < array.length; i=i+2){
//            System.out.println(array[i]);}

        //exercitiul b5
//Definiti un array de double, cu valori zecimale.
// Iterati array-ul folosind strutura for, si daca un element este egal cu valoarea 4.5,
// afisati-l pe ecran. Daca un element este mai mare decat 5, afisati mesajul “Element peste 5”

//        double[] array = {10, 20.5, 13, 4.5, 7, 3};
//                for (int i = 0; i< array.length; i++){
//                    if (array[i]==4.5)
//                        System.out.println(array[i]);
//                    else if (array[i]>5) {
//                        System.out.println("Element peste 5");
//                    }
//
//                    }
//                }

// Exercitiul b6
      //Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
        // Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca iteratia.
        // Altfel, sa se afiseze mesajul “Index valid” pe ecran.
//  int [] array = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
//  for (int i= 0; i<array.length; i++){
//      if (i!=2) {
//          if(i==7)
//              break;
//          else System.out.println("Index valid " + array[i]);
//      }
//
//
//      }

  // ex b7
//        //Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
//        List<Integer> numere = new ArrayList<>();
//        numere.add(10);
//        numere.add(20);
//        numere.add(30);
//        numere.add(40);
//        numere.add(50);
//  int sum = 0;
//  for(int i : numere ){
//      sum += i;
//  }
//        System.out.println("Suma este " + sum);

        //ex 8
        //Definiti un array si o lista. Determinati daca ele sunt goale sau nu.

//exercitiul b8
        //Definiti un array si o lista. Determinati daca ele sunt goale sau nu.

        int [] array = {1, 2, 3, 4, 5, 6, 10, 11};
        if (array.length==0)
            System.out.println("Array-ul este gol");
        else System.out.println("Array-ul contine " + array.length + " elemente");
        List<Integer> lista = new ArrayList<>();
        lista.add(55);
        lista.isEmpty();
        if (lista.isEmpty())
            System.out.println("Lista nu contine nici un element");
        else System.out.println("Lista nu este goala");

      }
  }






