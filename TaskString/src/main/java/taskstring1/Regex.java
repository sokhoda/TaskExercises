package taskstring1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
        private static final String SCHEME = "^(\\d+\\.?\\d*(\\s?[a-zA-Z]{2,4})?([;,]\\s*)?)+";

    public static void main(String a[]){
        Pattern pattern0 = Pattern.compile(SCHEME, Pattern.CASE_INSENSITIVE);
        String stream = "7 kg;6.8kG;  8.9   Lb";
        Pattern patternX = Pattern.compile("^(\\d+[\\.,]?\\d*\\s*(kg|lb)+;?)+", Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("(\\d+\\.?\\d*\\s*(kg|lb)?;?\\s*)", Pattern.CASE_INSENSITIVE);

        //HERE * IS GREEDY QUANTIFIER THAT LOOKS FOR ZERO TO MANY COMBINATION THAT
        //START WITH NUMBER
        Matcher matcher = pattern.matcher(stream);

        List<String> res = new ArrayList<>();
        while(matcher.find()){
            System.out.print(matcher.start() + ": " + matcher.group() + "\n");
        }
    }
}
