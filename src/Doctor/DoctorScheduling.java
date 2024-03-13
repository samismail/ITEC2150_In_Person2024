package DoctorsAbstract;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorScheduling {

    //
    static List<Doctor> doctors = new ArrayList<Doctor>();

    public static void main(String[] args) {
        //create a menu to select a few of items
        //ask to check about a specific doctor
        //ask about schedule of the doctors


        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a doctor");
            System.out.println("2. View doctor schedules");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            //new way of using switch statement if you haven't tried this technique before.

//            switch (choice) {
//                case 1 -> addDoctor(scanner);
//                case 2 -> viewSchedules();
//                case 3 -> continueRunning = false;
//                default -> System.out.println("Invalid choice. Please try again.");
//            }

            switch (choice) {
                case 1:
                    addDoctor(scanner);
                    break;
                case 2:
                    viewSchedules();
                    break;
                case 3:
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();

    }

    public static void addDoctor(Scanner input){
        System.out.print("Enter the doctor's name: ");
        String name = input.nextLine();
        /**
         * you will have another menu for specialization area of each doctor
         * 1.Oncology
         * 2.Cardiologist
         * 3.Dermatologist
         */
        System.out.println("Choose doctor's specialization");
        System.out.println("1:Oncologist\n2:Cardiologist\n3.Dermatologist\n");
        int specialization = input.nextInt();

     //   doctors.add(new Oncologist(name));

        switch(specialization){
            case 1: doctors.add(new Oncologist(name)); break;
            case 2: doctors.add(new Cardiologist(name)); break;
            case 3: doctors.add(new Dermatologist(name)); break;
            default:
                System.out.println("Invalid input - error");
        }
    }

    public static void viewSchedules(){
        if(doctors.isEmpty()){
            System.out.println("No doctors has been added yet");
        }

        for(Doctor  doc: doctors){
            System.out.println(doc.getName() + " - "  +  doc.getSchedule());

        }
    }
}
