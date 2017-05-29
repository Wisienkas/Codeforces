# Codeforces Problems

Codeforces website: http://codeforces.com

## Structure of solved problems

The directory src/ contains the implementation where the name of the file is the 
name of the challenge/problem as well. Additionally the top description of the class
contains a link to the challenge

additionally it contains a main method where it reads in the parameters
given on the stdin channel. 

also it contains a `System.out.println(...)` containing the a function with the same name
as the class, but starting with lowercase instead of uppercase. 

```java
/**
 * http://codeforces.com/problemset/problem/282/A
 * Created by yturi on 5/29/2017.
 */
public class BitPlusPlus {
    
    public static void main(String[] args){
      // Reading scanner input in this function
      System.out.println(bitPlusPlus(...)); // Calling method with input values
    }
    
    // parameters put as needed, always prefer List<...>
    // instead of arrays.
    public static int bitPlusPlus(...) { 
        // Solution to problem goes here
    }
}
```

Each implementation additionally contains a test class with the same name and a suffix of 
*test*. 

The test class contains the test given for the problems on the official page labeled as
test1, test2, ... testn.

If I've put my own specialized test in they are labeled testMine1, testMine2, ... testMinen.

````java
public class BitPlusPlusTest {
    @Test
    public void test1() {
        // Contains input value, this can differ from problem to problem
        // as some problems would be lists etc. 
        String input = ""; 
        // Expected output from solution function
        String expected = "";
        // Normal Assertion
        Assert.assertEquals(expected, BitPlusPlus.bitPlusPlus(input));
    }
    
    // Further tests from page
    @Test
    public void test2() {
        ...
    }
    
    // Own test
    @Test
    public void testMine1() {
        ...
    }
    
    // Another test by me
    @Test
    public void testMine2() {
        ...
    }
}
````