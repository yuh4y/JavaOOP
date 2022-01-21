package LietKeTuKhacNhau;

//import java.util.SortedSet;
import java.util.TreeSet;
import java.io.*;
import java.util.*;
public class WordSet {
	private String fin;
	private String res;
	
	public WordSet (String fin) throws IOException {
		TreeSet <String> line = new TreeSet <>();
		Scanner sc = new Scanner (new File (fin));
		String str = "";
		while (sc.hasNextLine()) {
			str = sc.nextLine().trim().toLowerCase();
			String[] temp = str.split("\\s+");
			for (int i=0; i< temp.length; i++) {
				line.add(temp[i]);
			}
		}
		res = "";
		line.forEach(e -> res += (e + "\n"));
		sc.close();
	}
	
	@Override
	public String toString() {
		return res.trim();
	}
}
        
	