/**
 * @author Zahir Ekrem SARITEKE
 * @project proxy-pattern
 * @created 15 September Sunday 2024 - 14:10
 */
class RealFile implements File {
    private String fileName;
    private String content;

    public RealFile(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
        System.out.printf("Loading file: %s\n", fileName );
    }

    @Override
    public void display() {
        System.out.printf("Displaying file: %s\nContent: %s\n\n", fileName  , content);
    }
}