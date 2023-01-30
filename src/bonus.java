//import java.util.ArrayList;
//import java.util.List;
//
//public class bonus {
//
//    public static void main(String[] args) {
//
//        //// Intr-o lista cu elemente duplicate, eliminati elemente care se repeta
//        // write new elements in new list
//        // de cate ori se repeta elementul?? - tema
//
//        int [] a = {4, 5, 4, 6, 3, 1, 7, 9, 3, 4, 5};
//        List<Integer> uniqueNumber = new ArrayList<>(); // lista goala
//        Object [] newArray = uniqueNumber.toArray();
//
//        for (  int i = 0; i<a.length; i++) {
//            int counter = 0;
//            if(!uniqueNumber.contains(a[i])){
//                uniqueNumber.add(a[i]);
//                counter++;
//                for (int j=i+1; j<a.length; j++){
//                    if(a[i] == a[j]){
//                        counter++;
//                    }
//                }
//                System.out.println(a[i] + " is found " + counter+ " times in the array.");
//            }
//        }
//        System.out.println(uniqueNumber);
//        int [] uniqueArray = new int[uniqueNUmbersize()];
//        for(int i=0; i<uniqueArray.length; i++){
//            uniqueArray[i] = uniqueNumbertoArray();
//
//        }
//    }
//}
//
//}
