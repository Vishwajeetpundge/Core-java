import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Speed of the vehicle
        System.out.print("Enter the speed of the vehicle (in km/h): ");
        int speed = scanner.nextInt();
        
        // Variable to hold the fine amount
        int fine = 0;

        // Determine the fine using switch-case
        switch (speed) {
            case 0: case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9: case 10:
            case 11: case 12: case 13: case 14: case 15:
            case 16: case 17: case 18: case 19: case 20:
            case 21: case 22: case 23: case 24: case 25:
            case 26: case 27: case 28: case 29: case 30:
            case 31: case 32: case 33: case 34: case 35:
            case 36: case 37: case 38: case 39: case 40:
            case 41: case 42: case 43: case 44: case 45:
            case 46: case 47: case 48: case 49: case 50:
            case 51: case 52: case 53: case 54: case 55:
                System.out.println("No fine. Speed within the limit.");
                break;

            case 61: case 62: case 63: case 64: case 65:
            case 66: case 67: case 68: case 69: case 70:
                fine = 100;
                break;

            case 71: case 72: case 73: case 74: case 75:
            case 76: case 77: case 78: case 79: case 80:
                fine = 200;
                break;

            case 81: case 82: case 83: case 84: case 85:
            case 86: case 87: case 88: case 89: case 90:
                fine = 300;
                break;

            case 91: case 92: case 93: case 94: case 95:
            case 96: case 97: case 98: case 99: case 100:
                fine = 400;
                break;

            default:
                if (speed > 100) {
                    fine = 500;
                }
                break;
        }

        // Additional fine for speeding more than 20 km/h
        if (speed > 80) {
            fine += 100;
        }

        // Output the fine amount if applicable
        if (fine > 0) {
            System.out.println("Fine: $" + fine);
        }
        
        scanner.close();
    }
}