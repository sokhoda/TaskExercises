package taskstring1;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final int MIN_NUMBER_OF_PIECES = 0;
        private static final String SCHEME = "^(\\d+\\.?\\d*(\\s?[a-zA-Z]{2,4})?([;,]\\s*)?)+";

    public static void main(String a[]){
     Pattern SCHEME_FIELD_VALIDATION_PATTERN =
            Pattern.compile("^((\\s*\\d+\\.?\\d*)\\s*(kg|lb);?\\s*)+", Pattern.CASE_INSENSITIVE);
        Pattern pattern0 = Pattern.compile(SCHEME, Pattern.CASE_INSENSITIVE);
//        String stream = "7 kg;55 ;  8.9   Lb";
        String stream = " 3 kgkg; ";
//        String stream = null;
        Pattern patternX = Pattern.compile("^(\\d+[\\.,]?\\d*\\s*(kg|lb)+;?)+", Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("(\\d+\\.?\\d*)\\s*(kg|lb);?\\s*", Pattern.CASE_INSENSITIVE);

        //HERE * IS GREEDY QUANTIFIER THAT LOOKS FOR ZERO TO MANY COMBINATION THAT
        //START WITH NUMBER
        Matcher matcher = pattern.matcher(stream);

        List<String> res = new ArrayList<>();
        System.out.println(SCHEME_FIELD_VALIDATION_PATTERN.matcher(stream).matches());
        while(matcher.find()){
            System.out.print(matcher.start() + ": " + StringUtils.trim(matcher.group(1)) + "\t" + StringUtils.trim(matcher.group(2))  + "\n");
        }
//        res.clear();
        List<String> list1 = new ArrayList<>();
        boolean b = CollectionUtils.emptyIfNull(list1).stream()
                .map(String::toUpperCase)
                .allMatch(value -> value.contains("$"));

        System.out.println("B=" + b);
        boolean isIncompleteShipment =false;

        System.out.println(String.format("%s%s%s", "fee", ":", null));

    }
}
