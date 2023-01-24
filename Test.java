import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Patient firstPatient = new Patient("Susan","Kelley", "Spinal injury", 5);
        Patient secondPatient = new Patient("Debra","King", "Cardiac arrest", 5);
        Patient thirdPatient = new Patient("Denise","Peters", "Spinal injury", 5);
        Patient fourthPatient = new Patient("Peter","Perez", "Third-degree burn", 4);
        Patient fifthPatient = new Patient("Brandon","Wood", "Cut finger", 2);
        Patient sixthPatient = new Patient("Sharon","Ford", "Upset stomach", 1);
        
        PriorityQueue<Patient>  priorityQueue = new PriorityQueue<Patient>();

        priorityQueue.add(sixthPatient);
        priorityQueue.add(fourthPatient);
        priorityQueue.add(secondPatient);
        priorityQueue.add(firstPatient);
        priorityQueue.add(thirdPatient);
        priorityQueue.add(fifthPatient);


        System.out.println("The doctor will see patients in the following order: ");


        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\n");

        File patientFile = new File("patients.txt");
        Scanner sc = new Scanner(System.in);

        try {
            sc = new Scanner(patientFile);
        } catch (FileNotFoundException e) {
            System.err.println("The patient file could not be found.");
            System.exit(0);
        }

        priorityQueue.clear();

        while (sc.hasNext()) {
            String newLine = sc.nextLine();
            Scanner newscScanner = new Scanner(newLine);
            String firstName = newscScanner.next();
            String lastName = newscScanner.next();
            String illness = sc.nextLine();
            int illnessSeverity = Integer.parseInt(sc.nextLine());

            Patient p = new Patient(firstName, lastName, illness, illnessSeverity);
            priorityQueue.add(p);
            newscScanner.close();

        }
        sc.close();
        
        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        
        
    }
}