import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringStreamWithNulls {

    public static void main(String[] args) {

        String res = Lists.newArrayList(null, null, "12", null, "as").stream()
                .collect(Collectors.joining(";\n"));
        System.out.println(res);
    }
}
