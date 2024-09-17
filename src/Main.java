/**
 * @author Zahir Ekrem SARITEKE
 * @project Default (Template) Project
 * @created 15 September Sunday 2024 - 14:09
 */
public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();

        File file1 = new FileProxy("file1.txt", dbConnection);
        File file2 = new FileProxy("file2.txt", dbConnection);

        System.out.println("Files created but not yet loaded.");

        System.out.println("\nDisplaying File 1:");
        file1.display();

        System.out.println("\nDisplaying File 1 again:");
        file1.display();

        System.out.println("\nDisplaying File 2:");
        file2.display();
    }
}