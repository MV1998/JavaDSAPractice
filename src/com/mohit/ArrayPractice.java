import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] strs) {
        println(Arrays.toString(strs));
        int[] array1 = new int[]{3,4,5,2,1};//getRandomIntArray(10);
        println(Arrays.toString(array1));
        Arrays.sort(array1); // dual-pivot quicksort alogrithm
        println(Arrays.toString(array1));
        println(String.valueOf(Arrays.binarySearch(array1, 4)));

        // Sort the string array
        String[] sArray = {"Mohit", "Vaibhav", "Devendra","Raaj"};
        Arrays.sort(sArray);
        println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "raaj") > 0) {
            println("Raaj is present");
        }

        // check two arrays are equal or not
        int[] a1 = {1,2,3,4};
        int[] a2 = {1,2,3,4};
        if (Arrays.equals(a1, a2)) {
            println("Arrays are equal");
        }else {
            println("Arrays are not equal");
        }

        // int[] first = getRandomIntArray(20);

        // Integer[] integer = new Integer[20];
        // for (int i = 0; i < first.length; i++) {
        //     integer[i] = first[i];
        // }
        
        // println(Arrays.toString(first));
        // Arrays.sort(integer, Comparator.reverseOrder());
        // System.out.println(Arrays.toString(integer));

          Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] unsortedarray = new int[n];
            for (int i = 0; i < n; i++) {
                int ele = scanner.nextInt();
                unsortedarray[i] = ele;
            }
        
            Integer[] integer = Arrays.stream(unsortedarray).boxed().toArray(Integer[]::new);
                // for (int i = 0; i < unsortedarray.length; i++) {
                //     integer[i] = unsortedarray[i];
                // }
                
            Arrays.sort(integer, Comparator.reverseOrder());
            System.out.println(Arrays.toString(integer));

            var s= 1;

            println("=".repeat(40));
            // two - dimentional arrays
            int[][] twoArray = new int[10][10]; // best way to represent two dimentional array
            int[] twoArray1 []  = new int[3][3];
            for (int i = 0; i < twoArray.length; i++) {
                int[] inner = twoArray[i];
                for (int j = 0; j < inner.length; j++) {
                    twoArray[i][j] = (i * 100) + (j + 10);
                }
            }
            for (int i = 0; i < twoArray.length; i++) {
                int[] inner = twoArray[i];
                for (int j = 0; j < inner.length; j++) {
                    System.out.print(twoArray[i][j]+" ");
                }
                System.out.println();
            }
            println("two dimentional printing = " + Arrays.deepToString(twoArray));

            int[] toBeReversed = getRandomIntArray(10);
            println(Arrays.toString(toBeReversed));
            reverse(toBeReversed);
            println(Arrays.toString(toBeReversed));

            println(findMin(readElements(readInteger()))+"");
            List<String> list = Arrays.asList(new String[]{"Mohit", "Varma", "simple", "another", "method"});
            for (var name : list) {
                println(name);
            }
            // List<Integer> integerArray = Arrays.asList(new Integer[]{1,2,3,4});
           System.out.println(Arrays.binarySearch("code".toCharArray(), 'e'));
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++) {
            if (Arrays.binarySearch(words[i].toCharArray(), x) >= 0) {
                array.add(i);
            }
        }
        return array;
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        return numberOfElements;
    }
    
    public static int[] readElements(int numberOfElements) {
        int[] elements = new int[numberOfElements];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            elements[i] = element;
        }
        return elements;
    }
    
    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array = "+ Arrays.toString(arr));
    }

    public static int[] getRandomIntArray(int len) {
        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(500);
        }
        return newArray;
    }
 
    public static void println(String s) {
        System.out.println(s);
    }
}
