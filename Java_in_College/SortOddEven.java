import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class SortOddEven {
    private int[] arr;
    private int size;

    public SortOddEven(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void readFromFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            int index = 0;
            while (line != null) {
                arr[index++] = Integer.parseInt(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void sortArray() {
        Arrays.sort(arr);
        int i = 0, j = size - 1;
        while (i < j) {
            if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] % 2 != 0) i++;
            if (arr[j] % 2 == 0) j--;
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void findDuplicates() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void writeToFile(String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            for (int i = 0; i < size; i++) {
                fw.write(arr[i] + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        SortOddEven obj = new SortOddEven(n);
        System.out.print("Enter lower bound: ");
        int lb = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int ub = sc.nextInt();

        for (int i = 0; i < n; i++) {
            obj.arr[i] = (int) (Math.random() * (ub - lb + 1)) + lb;
        }
        System.out.println("Random numbers generated and stored in file.");

        obj.writeToFile("numbers.txt");

        obj.readFromFile("numbers.txt");
        System.out.print("Original array: ");
        obj.printArray();
        obj.sortArray();
        System.out.print("Sorted array with odd numbers first: ");
        obj.printArray();
        System.out.print("Duplicate elements: ");
        obj.findDuplicates();
        obj.writeToFile("sorted_numbers.txt");
        System.out.println("Sorted Array written to the file.");
    }
}
