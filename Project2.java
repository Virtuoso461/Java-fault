package Book81;
import java.time.*;
import java.time.format.*;
public class Project2 {
	double y,m,d;

	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.parse("2020-09-01");
		String formattedDate1 = localDate1.format(DateTimeFormatter.ofPattern("YYYY"));
		double y1 = Double.parseDouble(formattedDate1);
		formattedDate1 = localDate1.format(DateTimeFormatter.ofPattern("MM"));
		double m1 = Double.parseDouble(formattedDate1);
		formattedDate1 = localDate1.format(DateTimeFormatter.ofPattern("dd"));
		double d1 = Double.parseDouble(formattedDate1);
		LocalDate localDate2 = LocalDate.of(2021, 7, 1);
		String formattedDate2 = localDate2.format(DateTimeFormatter.ofPattern("YYYY"));
		double y2= Double.parseDouble(formattedDate2);
		formattedDate1 = localDate1.format(DateTimeFormatter.ofPattern("MM"));
		double m2 = Double.parseDouble(formattedDate2);
		formattedDate1 = localDate1.format(DateTimeFormatter.ofPattern("dd"));
		double d2 = Double.parseDouble(formattedDate2);
		double y = (y2-y1)*365;
		System.out.println(y);
		double m = (m1-m2)*30;
		System.out.println(m);
		double d = d2-d1;
		System.out.println(d);
		double mul = y+m+d;
		System.out.println("Ïà¸ôÌìÊý:"+mul);
	}
}
