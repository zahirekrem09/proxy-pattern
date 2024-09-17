/**
 * @author Zahir Ekrem SARITEKE
 * @project proxy-pattern
 * @created 15 September Sunday 2024 - 14:10
 */
class FileProxy implements File {
    private String fileName;
    private RealFile realFile;
    private DatabaseConnection dbConnection;

    public FileProxy(String fileName, DatabaseConnection dbConnection) {
        this.fileName = fileName;
        this.dbConnection = dbConnection;
    }

    @Override
    public void display() {
        if (realFile == null) {
            realFile = dbConnection.loadFileFromDatabase(fileName);
        }
        realFile.display();
    }
}
