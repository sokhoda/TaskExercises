package edoing;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
	public static void main(String[] args) {
		String s1 = "Spring";
		String s2 = "Muster muster muster";
		String obj = new String("Spring");

		// System.out.println("Spring".equals(s1));
		// System.out.println(obj.equals(s1));
		// System.out.println("Spring".equals(obj));
		System.out.println("obj == s1 " + (obj == s1));
		System.out.println("intern:");
		obj = obj.intern();
		System.out.println("obj == s1 " + (obj == s1));

		System.out.println(s1.substring(1, 4));
		System.out.println(s2.indexOf("m"));

		StringBuilder builder = new StringBuilder();
		builder.append("Iryna334 Inna43");
		builder.append(" 215 ");
		builder.append("AAIryna334 AAInna43");
		builder.append(" 445");
		String sb = new String(builder);
		char[] arr = new char[] { 'e', 'g', 'o', 'i', 's', 'm', ' ', 'i', 's',
				' ', 'n', 'o', 't', ' ', 'g', 'o', 'o', 'd' };
		int offset = arr.length - 1;
		String newString = new String(arr, offset, arr.length - offset);
		System.out.println("compareTo="
				+ newString.compareTo("egoism is not good"));

		System.out.println(newString);
		System.out.println(sb);

		System.out.println(sb.contains("ry"));
		System.out.println(obj.equalsIgnoreCase("SPriNG"));
		System.out.println("replace: " + sb.replaceAll("\\p{Nd}", "Z"));
		System.out.println("replace: " + sb.replace("Iry", "Adr"));
		System.out.println("replace: " + sb.replace('I', 'D'));
		System.out.println("replace: " + sb.replaceAll("\\d", "Z"));
		System.out.println("IndexOf: " + sb.indexOf("r"));
		System.out.println(sb.toLowerCase(Locale.FRANCE));
		// -------------
		// System.out.println(Pattern.matches(".*\\d.*", sb));
		Matcher mat2 = Pattern.compile("([a-zA-Z0-9]+)([\\s]+)([a-zA-Z0-9]+)")
				.matcher(sb);// ([\\s]+)([0-9]+)")
		// .matcher(sb);
		// System.out.println("groupCount" + mat2.groupCount());
		while (mat2.find()) {
			// System.out.println("group0:" + mat2.group(0));
			System.out.println("group1:" + mat2.group(1));
			System.out.println("group2:" + mat2.group(2));
			System.out.println("group3:" + mat2.group(3));
		}

		Pattern pat = Pattern.compile(".*\\d.*");
		Matcher mat = pat.matcher(sb);
		System.out.println(sb);
		System.out.println(mat2.replaceAll("0"));
		System.out.println(mat.matches());
		System.out.println(sb.length());
		System.out.println("mat.find: " + mat.find(16));
		System.out.println(pat.pattern());

		try {
			System.out.println(String.format("host = %s, ip = %s", InetAddress.getLocalHost().getHostName(), InetAddress.getLocalHost().getHostAddress()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		System.out.println(Boolean.TRUE);

	}
}
