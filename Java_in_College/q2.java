import java.io.*;
import java.util.Scanner;
import java.util.Random;

class ArrayHandler {
    int[] arr;
    int size;

    public ArrayHandler(int size) {
        this.size=size;
        arr = new int[size];
    }

    public void storeRandomNumbers(int lb, int ub) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = lb + rand.nextInt(ub - lb + 1);
        }
    }

    public void sortArray() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void replaceDuplicates() {
        for (int i = 1; i < size; i++) {
            if (arr[i] == arr[i - 1]) {
                arr[i] = 0;
            }
        }
    }

    public double findAverage() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return (double) sum / size;
    }

    public void displayArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class q2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the lower bound: ");
        int lb = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int ub = sc.nextInt();

        ArrayHandler arrObj = new ArrayHandler(n);
        arrObj.storeRandomNumbers(lb, ub);

        try (FileWriter fw = new FileWriter("inputArray.txt")) {
            for (int i = 0; i < n; i++) {
                fw.write(arrObj.arr[i] + " ");
            }
        }

        arrObj.sortArray();
        arrObj.replaceDuplicates();

        System.out.println("Duplicate elements replaced with 0:");
        arrObj.displayArray();

        double average = arrObj.findAverage();
        System.out.println("Average: " + average);

        try (FileWriter fw = new FileWriter("outputArray.txt")) {
            for (int i = 0; i < n; i++) {
                fw.write(arrObj.arr[i] + " ");
            }
        }

        sc.close();
    }
}