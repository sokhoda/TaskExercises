package taskstring1;

import org.codehaus.jackson.node.JsonNodeFactory;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringBuilderTask {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Anna");
//        sb.append(" is nice/diligent", 10,17);
//        System.out.println(sb.toString());

      Pattern p = Pattern.compile("cat");
      Matcher m = p.matcher("one cat two cats in the yard three cats");
      StringBuffer sb = new StringBuffer();
      while (m.find()) {
          m.appendReplacement(sb, "dog");
      }
      m.appendTail(sb);
      System.out.println(sb.toString());
        StringBuilder data = new StringBuilder("aas");
        data.insert(0,"z");
        System.out.println(data.toString());


        Stream<String> s = Stream.empty();
        Map<Character, String> m2 = s.collect(
                Collectors.toMap(s1 -> s1.charAt(0),
                        s1 -> s1));
        System.out.println(m2);

      String s1 = JsonNodeFactory.instance.objectNode().nullNode().asText();
      System.out.println("nullNode as text:" + s1);
      System.out.println(getIndustrialGroupsMap().get(null));
    }

  static Map<String, String> getIndustrialGroupsMap() {
    return Stream.of(new String[][]{
            {"gfps", "global-financial-and-professional-services"},
            {"lsh", "life-sciences-and-healthcare"},
            {"em", "engineering-and-manufacturing"},
            {"ps", "public-sector"},
            {"", "public-sector"},
            {null, "public-sector"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
  }
}
