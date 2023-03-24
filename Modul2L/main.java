import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList();
        Hewan.add("Harimau");
        Hewan.add("Singa");
        Hewan.add("Panther");
        Hewan.add("Black Mamba");
        Hewan.add("Serigala");
        
        ArrayList<String> DeleteHewan = new ArrayList();
        DeleteHewan.add("Panther");
        DeleteHewan.add("Black Mamba");
        DeleteHewan.add("Serigala");
        
        String[] hew = Arrays.copyOf(Hewan.toArray(), Hewan.size(), String[].class);
        System.out.println("Hewan : "+Arrays.toString(hew));
        System.out.println("Hewan yang akan Dihapus: ");
        String[] dhew = Arrays.copyOf(DeleteHewan.toArray(), DeleteHewan.size(), String[].class);
        System.out.println(Arrays.toString(dhew));
        System.out.println("Sisa Hewan: ");
        for (String outp : DeleteHewan) {
            Hewan.removeIf(item -> item.equals(outp));
        }
        
        System.out.println(Hewan);
    }
}