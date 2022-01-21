package TinhGio;
import java.text.ParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ArrayList <Time> dsgamethu = new ArrayList<>();
		int t = Integer.parseInt(sc.nextLine());
		while (t-->0) {
			dsgamethu.add(new Time(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		}
		Collections.sort(dsgamethu);
		for (Time gamer : dsgamethu) {
			System.out.println(gamer);
		}
	}

}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/