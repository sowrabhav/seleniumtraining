package selenium.frameworkutilities;

public class Utils {

    // Password decryption method with Base64 encoding
    public static String decryptPassword(String encryptedPassword) {
        // Placeholder for the decryption logic
        // In a real-world scenario, you would implement the decryption logic here
        // For example, using Base64 decoding or any other encryption algorithm
        return new String(java.util.Base64.getDecoder().decode(encryptedPassword));
    }

    // Password encryption method with Base64 encoding
    public static String encryptPassword(String password) {
        // Placeholder for the encryption logic
        // In a real-world scenario, you would implement the encryption logic here
        // For example, using Base64 encoding or any other encryption algorithm
        return java.util.Base64.getEncoder().encodeToString(password.getBytes());
    }

    // Method to validate if a string is not null or empty
    public static boolean isNotNullOrEmpty(String str) {
        return str != null && !str.isEmpty();
    }

    // Method to validate if a string is a valid email format
    public static boolean isValidEmail(String email) {
        // Placeholder for the email validation logic
        // In a real-world scenario, you would implement the email validation logic here
        // For example, using regex to check if the email format is valid
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    // Method to validate if a string is a valid URL format
    public static boolean isValidURL(String url) {
        // Placeholder for the URL validation logic
        // In a real-world scenario, you would implement the URL validation logic here
        // For example, using regex to check if the URL format is valid
        return url.matches("^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/.*)?$");
    }

    // Method to validate if a string is a valid phone number format
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Placeholder for the phone number validation logic
        // In a real-world scenario, you would implement the phone number validation logic here
        // For example, using regex to check if the phone number format is valid
        return phoneNumber.matches("^[0-9]{10}$");
    }

    // Method to validate if a string is a valid date format
    public static boolean isValidDate(String date) {
        // Placeholder for the date validation logic
        // In a real-world scenario, you would implement the date validation logic here
        // For example, using regex to check if the date format is valid
        return date.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$");
    }

    // Method to validate if a string is a valid time format
    public static boolean isValidTime(String time) {
        // Placeholder for the time validation logic
        // In a real-world scenario, you would implement the time validation logic here
        // For example, using regex to check if the time format is valid
        return time.matches("^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$");
    }
}
