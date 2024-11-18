
import java.io.FileInputStream;
import java.io.FileOutputStream;


/*
chuẩn bị trước trong project 1 file nhị phân (file ảnh)
mở file nhị phân trên doc và cất kết quả vào mảng (byte[] => 
ghi mảng byte (byte[]data) vào 1 binary file => 
*/
public class DemoBinary {
    public static byte[] readData (String fileName) {
        FileInputStream f = null;
        byte[] data = null;
        try {
            f = new FileInputStream(fileName);
            int size = (int) new java.io.File(fileName).length(); // lấy ra số byte của tấm ảnh
            data = new byte[size];
        } catch (Exception e) {
            
        } finally {
            
        }
        return data;
    }
    public static void writedata(String fileName, byte[] data) {
        FileOutputStream f = null; 
        try {
            f = new FileOutputStream(fileName);
            f.write(data);
        } catch (Exception e) {
            
        } finally {
            
        }
    }
    public static void main(String[] args) {
        String fileName = "mypicture.jpg";
        byte[] data = readData(fileName);
        if (data != null) {
            writedata("copy.jpg", data);
            System.out.println("Done!!!");
        }
    }
}
