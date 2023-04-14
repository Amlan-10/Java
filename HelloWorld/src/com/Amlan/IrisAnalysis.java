package com.Amlan;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Iris {
    private final double sepalLength;
    private final double sepalWidth;
    private final double petalLength;
    private final double petalWidth;
    private final String name;

    public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, String name) {
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.name = name;
    }

    // getters and setters
    public double getSepalLength() {
        return sepalLength;
    }

    public double getSepalWidth() {
        return sepalWidth;
    }

    public double getPetalLength() {
        return petalLength;
    }

    public double getPetalWidth() {
        return petalWidth;
    }

    public String getName() {
        return name;
    }
}

public class IrisAnalysis {
    public static void main(String[] args) throws IOException {
        // read in csv file
        File file = new File("iris.csv");
        Scanner scanner = new Scanner(file);

        // create list to store Iris objects
        List<Iris> irisList = new ArrayList<>();

        // iterate over csv file and create Iris objects
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(",");
            double sepalLength = Double.parseDouble(values[0]);
            double sepalWidth = Double.parseDouble(values[1]);
            double petalLength = Double.parseDouble(values[2]);
            double petalWidth = Double.parseDouble(values[3]);
            String name = values[4];
            Iris iris = new Iris(sepalLength, sepalWidth, petalLength, petalWidth, name);
            irisList.add(iris);
        }

        // convert list to array
        Iris[] irisArray = irisList.toArray(new Iris[0]);

        // find min, max, average, and standard deviation of each column
        double[] sepalLengths = new double[irisArray.length];
        double[] sepalWidths = new double[irisArray.length];
        double[] petalLengths = new double[irisArray.length];
        double[] petalWidths = new double[irisArray.length];
        for (int i = 0; i < irisArray.length; i++) {
            sepalLengths[i] = irisArray[i].getSepalLength();
            sepalWidths[i] = irisArray[i].getSepalWidth();
            petalLengths[i] = irisArray[i].getPetalLength();
            petalWidths[i] = irisArray[i].getPetalWidth();
        }

        double minSepalLength = min(sepalLengths);
        double maxSepalLength = max(sepalLengths);
        double avgSepalLength = avg(sepalLengths);
        double stdSepalLength = std(sepalLengths);

        double minSepalWidth = min(sepalWidths);
        double maxSepalWidth = max(sepalWidths);
        double avgSepalWidth = avg(sepalWidths);
        double stdSepalWidth = std(sepalWidths);

        double minPetalLength = min(petalLengths);
        double maxPetalLength = max(petalLengths);
        double avgPetalLength = avg(petalLengths);
        double stdPetalLength = std(petalLengths);

        double minPetalWidth = min(petalWidths);
        double maxPetalWidth = max(petalWidths);
        double avgPetalWidth = avg(petalWidths);
        double stdPetalWidth = std(petalWidths);

        System.out.println("Sepal Length: min = " + minSepalLength + ", max = " + maxSepalLength + ", avg = " + avgSepalLength + ", std = " + stdSepalLength);
        System.out.println("Sepal Width: min = " + minSepalWidth + ", max = " + maxSepalWidth + ", avg = " + avgSepalWidth + ", std = " + stdSepalWidth);
        System.out.println("Petal Length: min = " + minPetalLength + ", max = " + maxPetalLength + ", avg = " + avgPetalLength + ", std = " + stdPetalLength);
        System.out.println("Petal Width: min = " + minPetalWidth + ", max = " + maxPetalWidth + ", avg = " + avgPetalWidth + ", std = " + stdPetalWidth);


    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double avg(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double std(double[] array) {
        double avg = avg(array);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i] - avg, 2);
        }
        return Math.sqrt(sum / (array.length - 1));
    }
}