/*
 *  Incomplete Driver for ArrayList(ObjectList), Stack and Queue
 *
 *
 */
public class ArrayBasedDataStructuresDriver {
    // to call the tests
    public static void main(String[] args) {
        stackTests();
        queueTests();
        arrayListTests();
    }

    private static void arrayListTests() {
        //todo: make more tests here
        System.out.println("test for arrayList");
        ArrayList a = new ArrayList();
        a.insert('B', 0);
        a.insert('a',0);
        a.insert('t',1);
        System.out.println(a.toString());
        while(a.isEmpty() == false) {
            System.out.println(a.remove(0));
        }
        
        //removed and printed
        a.remove(0);
        System.out.println(a.toString());
        
        // created a new object of arraylist 
        ArrayList b = new ArrayList();
        b.insert('C',0);
        b.insert('a', 0);
        b.insert('t', 0);
        // printing 
        System.out.println(a.toString()); 
        // testing to see if it is empty
        System.out.println("test");
        System.out.println("is b empty? " + b.isEmpty());
        while(b.isEmpty() == false) {
            System.out.println(a.remove(0));
        }
        
        // creating a new instance and testing
        ArrayList c = new ArrayList();
        System.out.println("test");
        
        // insert method test
        c.insert('w',0);
        c.insert('a', 1);
        c.insert('t', 2);
        c.insert('a', 3);
        
        //printing the arrays
        System.out.println(c.toString());
        System.out.println("is c empty? " + c.isEmpty());
        System.out.println();
        
        // test for size
        System.out.println("test for the size");
        System.out.println("a is " + a.size());
        System.out.println("b is " + b.size());
        System.out.println("c is " + c.size());
        System.out.println();
        
        
        // check for indexOf
        System.out.println("test for indexOf method");
        System.out.println("test for 'w' in object c: " + c.indexOf('w'));
        System.out.println("test for 'a' in object b: " + b.indexOf('a'));
        System.out.println("test for 't' in object a: " + a.indexOf('w'));
        System.out.println();
        
        // equals method check
        System.out.println("test to see if equal: ");
        System.out.println("are a and b equal? " + a.equals(b));
        System.out.println("are a and c equal? " + a.equals(c));
        System.out.println("are b and c equal? " + b.equals(c));
        
        // test for remove method
        while(b.isEmpty()== false){
           System.out.println("removed: " + b.remove(0));
        }
        
        // test for get method
        System.out.println("test for get method");
        System.out.println("testing for index 2 " + a.get(4));
        System.out.println("testing for index 1 " + b.get(6));
        System.out.println("testing for index 3 " + c.get(2));
       
        
    }

    private static void queueTests() {
        //todo: make more tests here
        Queue a = new Queue();
        a.enqueue('B');
        a.enqueue('a');
        a.enqueue('t');
        System.out.println(a.toString());
        while(a.isEmpty() == false) {
            System.out.println(a.dequeue());
        }
        
        System.out.println("test for queue using a object: ");
        // test for enqueue method
        a.enqueue('a'); 
        a.enqueue('b');
        a.enqueue('c'); 
        a.enqueue('d');
        a.enqueue('e');
        a.enqueue('f'); 
        
        // printing using toString
        System.out.println(a.toString());
        System.out.println("is a empty? " + a.isEmpty());
        System.out.println();
        
        // created an instance of the class
        Queue b = new Queue();
        
        System.out.println("test for queue using b object: ");
        // checking to see if b is empty
        System.out.println("is b empty? " + b.isEmpty());
        System.out.println();
        
        // test for enqueue method 
        b.enqueue('y');
        b.enqueue('e');
        b.enqueue('a');
        b.enqueue('r');
        b.enqueue('s');
        b.enqueue('t');
        
        // printing using the toString
        System.out.println(b.toString());
        System.out.println("is b empty? " + b.isEmpty());
        System.out.println();
        
        // created a new instance 
        Queue c = new Queue();
        System.out.println("test for queue using c object: ");
        
        // test to see if empty
        System.out.println("is c empty? " + c.isEmpty());
        
        // test for enqueue
        c.enqueue('t');
        c.enqueue('q');
        c.enqueue('a');
        c.enqueue('u');
        c.enqueue('g');
        c.enqueue('m');
        
        // printing using toString
        System.out.println(c.toString());
        System.out.println("is c empty? " + b.isEmpty());
        System.out.println();
        
        // size method check
        System.out.println("size of objects: ");
        System.out.println("a is: " + a.size());
        System.out.println("b is: " + b.size());
        System.out.println("c is: " + c.size());
        System.out.println();
        
        // to check if equal
        System.out.println("test to see if equal: ");
        System.out.println("are a and b equal? " + a.equals(b));
        System.out.println("are a and c equal? " + a.equals(c));
        System.out.println("are b and c equal? " + b.equals(c));
        
        // check if dequeue method is working
        while(a.isEmpty()== false){
           System.out.println("dequeue: " + a.dequeue());
        }
        
        System.out.println();
        
        
        
    }

    private static void stackTests() {
        //todo: make more tests here
        Stack a = new Stack();
        a.push('B');
        a.push('a');
        a.push('t');
        System.out.println(a.toString());
        while(a.isEmpty() == false) {
            System.out.println(a.pop());
        }
        
        System.out.println("tests for stack");
        System.out.println(); 
        
        // created new instance
        Stack b = new Stack();
        
        System.out.println("test for object b");
        
        // to test the push method
        b.push('f');
        b.push('l');
        b.push('o');
        b.push('w');
        b.push('e');
        b.push('r');
        b.push('s');
        
        // printing using toString
        System.out.println(b.toString());
        System.out.println("is b empty? " + b.isEmpty());
        System.out.println();
        
        // created new instance
        Stack c = new Stack();
        System.out.println("test for object c");
        
        // testing push method
        c.push('m');
        c.push('y');
        c.push('t');
        c.push('e');
        c.push('s');
        c.push('t');
        c.push('s');
        
        // printing using toString
        System.out.println(c.toString());
        System.out.println("is c empty? " + b.isEmpty());
        System.out.println();
        
        // to see if equals method works
        System.out.println("test to see if equal: ");
        System.out.println("are a and b equal? " + a.equals(b));
        System.out.println("are a and c equal? " + a.equals(c));
        System.out.println("are b and c equal? " + b.equals(c));
        System.out.println();
        
        // check if pop method works
        while(a.isEmpty() == false){
            System.out.println("popped: " + a.pop());
        }
        System.out.println();
    }
}

