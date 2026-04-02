import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Validate inputs
        if (m1.matches()) {
            System.out.println("✅ Train ID is VALID");
        } else {
            System.out.println("❌ Train ID is INVALID");
        }

        if (m2.matches()) {
            System.out.println("✅ Cargo Code is VALID");
        } else {
            System.out.println("❌ Cargo Code is INVALID");
        }

        sc.close();
    }
}