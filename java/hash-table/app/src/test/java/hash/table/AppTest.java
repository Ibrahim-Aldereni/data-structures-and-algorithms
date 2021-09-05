/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hash.table;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  ////////////////////////////////////////////////// challenge 30 /////////////////////////////////////////
  @Test
  void testHashTable() {
    HashTable<String> hashTable = new HashTable<>(10);
    hashTable.add(11, "ahmad");
    hashTable.add(12, "osama");
    hashTable.add(13, "ibrahim");

    assertEquals("osama", hashTable.get(12));
    assertTrue(hashTable.contains(11));
    assertFalse(hashTable.contains(5));
    assertNull(hashTable.get(1));
  }

  ////////////////////////////////////////////////// challenge 31 /////////////////////////////////////////
  @Test
  void testHashTable2() {
    String str1 = "Once upon a time, there was a brave princess who...";
    String str2 =
      "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of " +
        "foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was" +
        " " + "the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything " +
        "before us, " + "we had nothing before us, we were all going direct to Heaven, we were all going direct the " +
        "other way – in " + "short, the period was so far like the present period, that some of its noisiest " +
        "authorities insisted on its " + "being received, for good or for evil, in the superlative degree of " +
        "comparison only...";
    String str3 = "It was a queer, sultry summer the summer they electrocuted the Rosenbergs, and I didn’t know " +
      "what" + " I was doing in New York...";

    assertEquals("a", App.repeatedWord(str1));
    assertEquals("it", App.repeatedWord(str2));
    assertEquals("summer", App.repeatedWord(str3));
  }
}
