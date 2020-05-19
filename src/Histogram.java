import java.util.*;

public class Histogram{

    public static void main(String []args){
        Map<String, Integer> records = new HashMap<String, Integer>();
    //    try {
    //BufferedReader reader = new BufferedReader(new FileReader(filename));
   //while ((String line = reader.readLine()) != null) {
        StringTokenizer tokenizer = new StringTokenizer( 
                "Lets . practice, at. at GeeksforGeeks",
                ",. "
                ); 

        // Displaying the Tokens 
        while (tokenizer.hasMoreTokens()) { 
            String word = tokenizer.nextToken();
            if (records.get(word) == null){
                records.put(word, 1);
            } else {
                records.put(word, records.get(word) + 1);
            }
        }
        System.out.println(records);
        for(Map.Entry<String, Integer> element : records.entrySet()) {
            String key = element.getKey();
            Integer value = element.getValue();
            System.out.println(key + ": " + value);
        }
        boolean DESC = false;
    //    Map<String, Integer> sorted = sortByComparator(records, DESC);
     //   System.out.println(sorted);
    //}
   // reader.close();
  //  return records;
  }
  /*catch (Exception e)
  {
    System.err.format("Exception occurred trying to read '%s'.", filename);
    e.printStackTrace();
    return null;
  }
  */
}
