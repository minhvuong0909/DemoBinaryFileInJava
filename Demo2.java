
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 - cho trước 1 ArrayList<Pet> list
 - ghi list vào file nhị phân => writedata()
 - đọc file trên và xuất data sau đọc ra màn hình => readdata()
 */
public class Demo2 {
    public static void writedata(String fileName, ArrayList<Pet> data) {
        FileOutputStream f = null; // chuyển dữ liệu nguyên thủy hoặc object thành nhị phân
        ObjectOutputStream of = null; 
        try {
            f = new FileOutputStream(fileName);
            of = new ObjectOutputStream(f);
            of.writeObject(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static ArrayList<Pet> readdata(String fileName) {
        ArrayList<Pet> rs = null; // đọc tệp nhị phân và chuyển nó thành dữ liệu java
        FileInputStream f = null;
        ObjectInputStream of = null;
        try {
            f = new FileInputStream(fileName);
            of = new ObjectInputStream(f);
            rs = (ArrayList<Pet>) of.readObject();
        } catch (Exception e) {
            
        }
        return rs;
    }
    public static void main(String[] args) {
        ArrayList<Pet> list = new ArrayList<>();
        list.add(new Pet(1, "lulu"));
        list.add(new Pet(2, "misa"));
        list.add(new Pet(3, "ski"));
        writedata("pet.love", list);
        ArrayList<Pet> result = readdata("pet.love");
        for (Pet pet : result) {
            System.out.println(pet);
        }
    }
}
