package hw2;

import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>(15000000);
        Random random = new Random();
        for (int i = 0; i < 50000; i++) {
            myArrayList.add(random.nextInt(50000));
        }
        System.out.println(myArrayList);

//        long start1 = System.currentTimeMillis();
//        myArrayList.bubbleSort(Comparator.naturalOrder());
//        long end1 = System.currentTimeMillis() - start1;
//        System.out.println(myArrayList);
//        System.out.println("Bubble Sort Time: " + end1);

//        long start2 = System.currentTimeMillis();
//        myArrayList.selectionSort(Comparator.naturalOrder());
//        long end2 = System.currentTimeMillis() - start2;
//        System.out.println(myArrayList);
//        System.out.println("Selection Sort Time: " + end2);

        long start3 = System.currentTimeMillis();
        myArrayList.insertionSort(Comparator.naturalOrder());
        long end3 = System.currentTimeMillis() - start3;
        System.out.println(myArrayList);
        System.out.println("Insertion Sort Time: " + end3);
//--------------------------------------------------------------------------------------------------------------------
//        String[] strArr ;
//        strArr = new String[5];
//        String[] strArr1 ={"A", "BBBB","CCC"};

//        int[] arr = new int[10];
//
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = i;
//        }
//
//
////
////        for (int i = 0; i <arr.length ; i++) {
////            if(arr[i] %2 == 0){
////                arr[i]+=10;
////            }
////        }
//
//        System.out.println(Arrays.toString(arr));

//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.addAll(Arrays.asList(3, 6, 7, 2, 43, 56, 2, 2, 5));
//
//        System.out.println(list);
////        list.remove((Integer) 2);
////        list.removeIf(x -> x > 5);
////        list.removeAll(Arrays.asList(2));
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(2);
//        mal.add(1);
//        mal.add(3);
//        System.out.println(mal);
//
//        mal.add(4, 9);
//        System.out.println(mal);

//        mal.remove(9);
//        System.out.println(mal);

//        System.out.println(mal.indexOf(9));


//       MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(9);
//        msal.add(2);
//        msal.add(4);
//        msal.add(1, 10);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(4));


//        MyArrayList<Integer> mal = new MyArrayList<>(15);
//        Random rand = new Random();
//        for (int i = 0; i <10 ; i++) {
//            mal.add(rand.nextInt(20));
//        }
//        System.out.println(mal);
//
////        mal.selectionSort();
////        mal.insertionSort();
////        mal.bubbleSort(Comparator.naturalOrder());
//        mal.bubbleSort(Comparator.reverseOrder());
//
//        System.out.println(mal);


//        MyArrayList<String> myArrayList = new MyArrayList<>();
//        myArrayList.add("aaa");
//        myArrayList.add("BBB");
//        myArrayList.add("bbbbbbb");
//        myArrayList.add("ccc");
//        myArrayList.add("AAAAA");
//        myArrayList.add("xxx");
//        myArrayList.add("YYYyy");
//
//        System.out.println(myArrayList);
////        myArrayList.bubbleSort(Comparator.naturalOrder());
//        myArrayList.bubbleSort(Comparator.comparingInt(String::length));
////        myArrayList.bubbleSort(Comparator.comparingInt(String::length).reversed());
////        myArrayList.bubbleSort(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase));
//        System.out.println(myArrayList);


    }
}