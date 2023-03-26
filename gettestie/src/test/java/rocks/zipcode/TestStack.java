package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void hashMapTest(){
        HashMap<String,Integer> Map = new HashMap<>();
        Map.put("Roll",2);
        Integer Expected = 2;
        Assert.assertEquals(Expected,Map.get("Roll"));

    }
    @Test
   public void ArrayListTest(){
        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(5);
            Integer Expected = 5;
            Assert.assertEquals(Expected,arr.get(0));
    }
    @Test
    public void HashSetTest(){
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        Integer Expected = 2;
        Assert.assertTrue(set.contains(2));

    }
    @Test
    public void LinkedListTest(){
       LinkedList<Integer> list = new LinkedList<>();
       list.add(5);
       Integer Expected = 5;
       Assert.assertTrue(list.add(5));
    //use assertTrue with lists
    }
    @Test
    public void ArrayDequeTest(){
      ArrayDeque<Integer>  arr = new ArrayDeque<>();
      arr.add(8);
      Integer Expected = 8;
      Assert.assertTrue(arr.add(8));
    }

    }


