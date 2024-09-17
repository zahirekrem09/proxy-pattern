/**
 * @author Zahir Ekrem SARITEKE
 * @project proxy-pattern
 * @created 15 September Sunday 2024 - 14:11
 */
class DatabaseConnection {
    public RealFile loadFileFromDatabase(String fileName) {
        // Simulating file loading from database
        System.out.println("Loading file from database: " + fileName);
        return new RealFile(fileName, "This file's content was loaded from the database.");
    }
}
