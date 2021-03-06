package jsonlib;

import domain.Student;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.node.NullNode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.StringTokenizer;


public class JsonRunner {
        private final static String mariaDefinition = "{age: 10, marks: [9,10], name: Maria, verified: false}";
        private final static String arrayDefinition = "[" +
                "{age: 10, marks: [9,10], name: Maria, verified: false}," +
                "{age: 10, marks: [11,12], name: Nadiya, verified: true}," +
                "{age: 10, marks: [12, 9], name: Peter, verified: false}" +
                "]";
    public static void main(String[] args) throws JSONException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS,false);
        Student student =  Student.builder()
                .age(10)
                .marks(new int[]{11, 12})
                .name("Alex")
                .verified(true)
                .build();

        JSONObject jso = new JSONObject(student, new String[]{"age", "marks", "name", "verified"});

        JSONObject jso2 = new JSONObject(mariaDefinition);



        JSONArray jsa = new JSONArray(arrayDefinition);
        System.out.println(jso);
        System.out.println(jso2);
        System.out.println(jsa);

        String par = jsa.getJSONObject(1).getString("name");
        System.out.println(par);

        JsonNode root = mapper.valueToTree(student);

        Student studentFromJsonNode = mapper.treeToValue(root, Student.class);
        System.out.println("studentFromJsonNode = " + studentFromJsonNode);
        System.out.println("replaced:" + "fef233eDD.f44".replaceAll("[a-z, A-Z]+",""));

        StringTokenizer stringTokenizer = new StringTokenizer("0.144rf3.57fer,f43tr4", ".,");
        String transformedCiValue = stringTokenizer.nextToken();
        String ciValueWithDigitsOnly = transformedCiValue.replaceAll("\\D+", StringUtils.EMPTY);
        System.out.println("stringBefore: " + ciValueWithDigitsOnly );
        System.out.println("Compare:" + "90".compareTo("1.45"));

        NullNode nullInstance = NullNode.getInstance();
        System.out.println("JsonNode isNull: " + nullInstance.isNull());
//        System.out.println("JsonNode isNull valueToTree: " + mapper.valueToTree(null).isNull());

        System.out.println("JsonNode treeToValue: " + mapper.treeToValue(NullNode.getInstance(), Student.class));


    }
}
