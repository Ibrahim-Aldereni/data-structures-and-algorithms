/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SinglyLinkedLists;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    ////////////////////////////////// challenge 05 test /////////////////////////////////////////
//    @Test public void testLinkedList(){
//      //Can successfully instantiate an empty linked list
//      LinkedList list = new LinkedList();
//      assertNull("empty list have null head property", list.head);
//
//      //Can properly insert into the linked list
//      LinkedList list1 = new LinkedList();
//      list1.insert(1);
//      assertEquals("test insert method by checking if head is not null",1,list1.head.data);
//
//      //The head property will properly point to the first node in the linked list
//      LinkedList list3 = new LinkedList();
//      list3.insert(3);
//      list3.insert(4);
//      list3.insert(5);
//
//      assertEquals("test insert method by checking if head is not null",3,list3.head.data);
//
//      //Can properly insert multiple nodes into the linked list
//      LinkedList list4 = new LinkedList();
//      list4.insert(1);
//      list4.insert(2);
//      list4.insert(10);
//
//      assertEquals("test multiple insert method by checking if tail is not null and equal to last node",10,
//        list4.tail.data);
//
//      //Will return true when finding a value within the linked list that exists
//      LinkedList list5 = new LinkedList();
//      list5.insert(1);
//      list5.insert(100);
//      list5.insert(55);
//
//      assertEquals("test includes method when finding a value the output is true",true,
//        list5.includes(100));
//
//      //Will return false when searching for a value in the linked list that does not exist
//      assertEquals("test includes method when not finding a value the output is false",false,
//        list5.includes(2));
//
//      //Can properly return a collection of all the values that exist in the linked list
//      String out = "{ 1 } -> { 100 } -> { 55 } -> NULL";
//      assertEquals("test toStr method that return all list values",out,
//        list5.toStr());
//    }

  ////////////////////////////////// challenge 06 test /////////////////////////////////////////
  @Test public void testLinkedList2(){
    //Can successfully add a node to the end of the linked list
    LinkedList list2 = new LinkedList();
    list2.append(5);
    // output must be
    String out = "{ 5 } -> NULL";
    // test
    assertEquals("add a node to the end of the linked list", out,list2.toStr());

    //-------------------------------------------------------------------------------------------------
    //Can successfully add multiple nodes to the end of a linked list
    list2.append(3);
    list2.append(4);
    list2.append(10);
    // output must be
    String out2 = "{ 5 } -> { 3 } -> { 4 } -> { 10 } -> NULL";
    // test
    assertEquals("add a node to the end of the linked list", out2,list2.toStr());

    //-------------------------------------------------------------------------------------------------
    //Can successfully insert a node before a node located i the middle of a linked list
    LinkedList list3 = new LinkedList();
    list3.append(1);
    list3.append(2);
    list3.append(4);
    list3.insertBefore(4,3);
    // output must be
    String out3 = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";
    // test
    assertEquals("add a node to the end of the linked list", out3,list3.toStr());

    //-------------------------------------------------------------------------------------------------
    //Can successfully insert a node before the first node of a linked list
    list3.insertBefore(1,0);
    // output must be
    String out4 = "{ 0 } -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";
    // test
    assertEquals("add a node to the end of the linked list", out4,list3.toStr());

    //-------------------------------------------------------------------------------------------------
    //Can successfully insert after a node in the middle of the linked list
    LinkedList list4 = new LinkedList();
    list4.append(10);
    list4.append(20);
    list4.append(40);
    list4.insertAfter(20,30);
    // output must be
    String out5 = "{ 10 } -> { 20 } -> { 30 } -> { 40 } -> NULL";
    // test
    assertEquals("add a node to the end of the linked list", out5,list4.toStr());

    //-------------------------------------------------------------------------------------------------
    //Can successfully insert a node after the last node of the linked list
    list4.insertAfter(40,50);
    // output must be
    String out6 = "{ 10 } -> { 20 } -> { 30 } -> { 40 } -> { 50 } -> NULL";
    // test
    assertEquals("add a node to the end of the linked list", out6,list4.toStr());
  }
}
