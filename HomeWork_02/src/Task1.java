/*
Дана строка sql-запроса "select * from students where ".
        Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

import java.util.HashMap;
import java.util.Map;

public  class Task1{
    public static void SqlRequest() {
            String inputString = "use db.Database01 select * from students where ";
            Map<String, String> data = new HashMap<String,String>();

            data.put("name","Ivanov");
            data.put("country", "Russia");
            data.put("city", "Moscow");
            data.put("age",null);

            StringBuilder sb = new StringBuilder();

            sb.append(inputString);
            sb.append(getQuery(data));

            System.out.println("----------------Task1----------------");
            System.out.println(sb);
        }
        public static  String getQuery(Map<String, String> params) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> pair : params.entrySet()) {
                if (pair.getValue() != null) {
                    sb.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
                }
            }
            sb.delete(sb.toString().length()-5,sb.toString().length());
            return sb.toString();
        }
}

