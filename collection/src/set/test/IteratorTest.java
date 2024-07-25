package set.test;

import java.util.HashSet;

public class IteratorTest {
   public static void main(String[] args) {
      HashSet<String> bloodTypeSet = new HashSet<String>();
      
      bloodTypeSet.add("A");
      bloodTypeSet.add("B");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("O");
      bloodTypeSet.add("O");
      bloodTypeSet.add("O");
      bloodTypeSet.add("O");
   }
}