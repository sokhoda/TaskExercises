package locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class Locale1 {
	public static void main(String[] args) {
		final double i = 100000.994;
		// Locale myLocale = new Locale("ua", "UA");
		// Locale myLocale = Locale.US;
		Locale myLocale = Locale.GERMAN;
		// Locale myLocale = Locale.FRENCH;
		Locale.setDefault(myLocale);
		System.out.println(Locale.getDefault());

		System.out.println(myLocale.getLanguage());
		System.out.println(myLocale.getDisplayLanguage());
		System.out.println(myLocale.getCountry());
		System.out.println(myLocale.getDisplayCountry());

		NumberFormat nf = NumberFormat.getInstance(myLocale);
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, myLocale);
		Calendar cal = Calendar.getInstance();
		System.out.println(df.format(cal.getTime()));
		System.out.println(nf.format(i));
	}
}
