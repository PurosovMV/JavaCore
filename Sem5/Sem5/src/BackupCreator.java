
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BackupCreator {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        File file2 = new File("./backup");
        createDir(file, file2);
    }

    /**
     * Метод создания директории резервных копий, если её нет
     *
     * @param sourceDir директория источник
     * @param backupDir директория резервной копии
     * @throws IOException
     */
    static void createDir(File sourceDir, File backupDir) throws IOException {
        if (!backupDir.exists()) {
            backupDir.mkdir();
        }
        for (String f : sourceDir.list()) {
            if (f.equalsIgnoreCase("backup")) {
                continue;
            }
            File source = new File(sourceDir, f);
            File backup = new File(backupDir, f);

            if (source.isDirectory()) {
                createDir(source, backup);
            } else {
                copyFile(source, backup);
            }
        }

    }

    /**
     * Метод копирования файлов
     *
     * @param sourceFile файл-источник
     * @param backupFile файл-копия
     * @throws IOException
     */
    static void copyFile(File sourceFile, File backupFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(sourceFile);
             FileOutputStream fileOutputStream = new FileOutputStream(backupFile)) {

            int c;
            byte[] buffer = new byte[1024];
            while ((c = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, c);
            }
        }
    }
}
