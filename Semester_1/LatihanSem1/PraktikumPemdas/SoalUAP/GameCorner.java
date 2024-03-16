package PraktikumPemdas.SoalUAP;
import java.util.Scanner;

public class GameCorner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalBookings = Integer.parseInt(in.nextLine());

        String[][] schedules = new String[3][3]; 

        for (int i = 0; i < totalBookings; i++) {
            String[] booking = in.nextLine().split(" ");

            int facultyCode = Integer.parseInt(booking[0].substring(0, 3));

            int tvNumber = getTVNumber(booking[1]);

            int timeSlot = getTimeSlot(booking[2]);

            if (schedules[timeSlot][tvNumber] == null || checkPriority(schedules[timeSlot][tvNumber], facultyCode)) {
                schedules[timeSlot][tvNumber] = booking[0];
            }
        }

        printSchedule(schedules);
        
        in.close();
    }



    private static int getTVNumber(String tv) {
        return Integer.parseInt(tv.substring(tv.length() - 1)) - 1;
    }

    private static boolean checkPriority(String bookedBy, int facultyCode) {
        int currentFacultyCode = Integer.parseInt(bookedBy.substring(0, 3));
        return (facultyCode == 515 && currentFacultyCode != 515);
    }

    private static void printSchedule(String[][] schedule) {
        String[] timeSlots = {"07:00", "08:00", "09:00"};

        System.out.println("+--------+------------+------------+------------+");
        System.out.println("| Jadwal |     TV1    |     TV2    |     TV3    |");
        System.out.println("+--------+------------+------------+------------+");

        for (int i = 0; i < 3; i++) {
            System.out.printf("| %s  |", timeSlots[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %-10s |", schedule[i][j] != null ? schedule[i][j] : "");
            }
            System.out.println();
        }

        System.out.println("+--------+------------+------------+------------+");
    }

    private static int getTimeSlot(String time) {
        switch (time) {
            case "07:00":
                return 0;
            case "08:00":
                return 1;
            case "09:00":
                return 2;
            default:
                return -1;
        }
    }
}
