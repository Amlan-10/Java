
import java.io.BufferedReader;
        import java.io.BufferedWriter;
        import java.io.File;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;

public class StudentFileCopy {
    public static void main(String[] args) {
        // Student details to be written to file
        String[] students = {"John,Smith,1234",
                "Jane,Doe,5678",
                "Bob,Johnson,9012"};

        // Location and file name to write student details
        String fileName = "C:\\KIIT\\Desktop\\students.txt";

        // Write student details to file
        writeToFile(students, fileName);

        // Location and file name to copy student details
        String copyFileName = "C:\\temp\\students_copy.txt";

        // Copy student details to another file
        copyFile(fileName, copyFileName);

        System.out.println("Student details copied to file: " + copyFileName);
    }

    private static void writeToFile(String[] students, String fileName) {
        try {
            // Create file object
            File file = new File(fileName);

            // Create file writer object
            FileWriter fw = new FileWriter(file.getAbsoluteFile());

            // Create buffered writer object
            BufferedWriter bw = new BufferedWriter(fw);

            // Write student details to file
            for (String student : students) {
                bw.write(student);
                bw.newLine();
            }

            // Close buffered writer object
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(String sourceFileName, String destFileName) {
        try {
            // Create file objects for source and destination files
            File sourceFile = new File(sourceFileName);
            File destFile = new File(destFileName);

            // Create file reader and writer objects
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destFile);

            // Create buffered reader and writer objects
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

            // Copy data from source file to destination file
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Close buffered reader and writer objects
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
