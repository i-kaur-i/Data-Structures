
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String[] args){
        ArrayList test = new ArrayList();
        
        test.insert(test, 2); 
        
        //test 1 
        test.insert(null , 1);
        
        //test 2 
        test.insert(test, -1);
        
        //test 3
        test.remove(2);
    }
}
