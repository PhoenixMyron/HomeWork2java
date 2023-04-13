import java.util.HashMap;

/**
 * HomeTask1
 */
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
import java.util.HashMap;

public class HomeTask1 {
    public static void main(String[] args) {
        HashMap<String, String> text = new HashMap<String,String>();
        text.put("surname","Ivanov");
        text.put("country","Russia");
        text.put("city","Moscow");
        text.put("age",null);
        System.out.println(getQuery(text));
    }
    public static String getQuery(HashMap<String, String> text)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (HashMap.Entry<String,String> pair : text.entrySet())
        {
            if (pair.getValue() != null)
            {
                stringBuilder.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        stringBuilder.delete(stringBuilder.toString().length()-5,stringBuilder.toString().length());
        return stringBuilder.toString();
    }

}