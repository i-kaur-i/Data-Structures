
/**
 * This class is about removing objects and creating an arraylist to store the 
 * objects in
 * 
 * This class has methods to check if the spots in the ArrayList are 
 * either empty or full.
 * It has methods to find what object you looking for.
 * You can find it by the indec and you can get the index
 * of the object.
 *
 *
 * @author Iakjot Kaur
 * @version April 18th, 2020
 */
public class ArrayList
{   
    // the instance variables 
    private Object[] arrayL = new Object[100];
    private int numElem = 0;
    
    /**
     * This method is to add the object at the specified index while 
     * shifting other elements over as needed.
     * 
     * When the indec is less than zero, an error is there
     * When the object is not there then there is an error
     * When the index is greater than the array length then
     * it gets stored with a new size.
     * If the array has nothing in it, then the object gets added
     * and the element gets updated.
     *
     *PRE: have a valid object and an index, can't be null or negative
     *POST: inserts an object at a certain index
     * @param: object, int
     * *return: none
     */
    public void insert(Object obj, int index){
       Object val = 0;
       if(index < 0){
            System.out.println("Error");
            return;
        }
       if( obj == null){
            System.out.println("Error");
            return;
        } 
      
       if( index > arrayL.length){
            Object[] tempArrayL = new Object[index +1];
            for(int i=0; i < arrayL.length; i++){
                tempArrayL[i] = arrayL[i];
            }
            arrayL = tempArrayL;
            numElem = index;
            for(int i=0; i < size(); i++){
                arrayL[i+1] = arrayL[i];
            }
            arrayL[index] = val;
            numElem++;  
            
        }

       if(arrayL[index] == null){
            arrayL[index] = obj;
            numElem++;
        }
        else{
            arrayL[index] = obj;   
        }

    }
    
    /**
     * The method is to resize the object array.
     * 
     * First made a new resized array with the same number of elements
     * then i looped through the copied over the elements 
     * then i returned the new resized array
     *
     *PRE: have an object array
     *POST: returned the new resized array with all of the elements
     * @param: none
     * *return: Object[]
     */
    public Object[] resize(){
        Object[] resizedArray = new Object[numElem];
        for(int i =0; i< arrayL.length; i++){
            resizedArray[i] = arrayL[i];
        }
        return resizedArray;
    }
    
    /**
     * This method is to remove the object from the array from a certain index.
     * 
     * When the index is less than zero, then there is an error.
     * When there is space available at that index then there is an error.
     * Created a temp object to store the information 
     * then looped through and expanded the index
     * If the array has nothing in it then I subtracted the element count.
     * Then I returned the temp array.
     *
     *PRE: index has to be valid, can't be null
     *POST: removes the object
     * @param: int
     * *return: Object
     */

    public Object remove(int index){
        if( index <0){
            System.out.println("error");
            return null;
        }
        if(arrayL[index] == null){
            System.out.println("error");
            return null;
        }

        Object tempObj = arrayL[index];
        numElem = index;
        for(int i=0; i<size()-1; i++){
            arrayL[i] = arrayL[i + 1];
        }

        arrayL[index] = null;
        numElem--; 

        return tempObj;
    }
    
    /**
     * This method is to return the size of the array.
     * 
     * Returned the length of the array 
     *
     *PRE: have an array 
     *POST: return the length of the array
     * @param: none
     * *return: int
     */

    public int size(){
        return this.arrayL.length;
    }
    
    /**
     * This method is to print out the objects in the array with commas seperating.
     * 
     * Made a temp string and then looped through the array 
     * only if the array doesn't contain null then i return the string
     * that is the array printed.
     *
     *PRE: have an array filled with objects
     *POST: return the temp string 
     *@param: none
     *return: String
     */

    public String toString(){
        String tempObj = "";
        for(int i=0; i< size();i++){
            if(arrayL[i] != null){
                tempObj+= arrayL[i] + " , ";
            }
            else{
                return "";
            }
        }
        return tempObj;
    }
    
    /**
     * This method is to check if the array is empty and it returns true or false
     * based on if it's empty or not.
     * 
     * I started with 2 counters, one for the true count the other one for false count.
     * I looped through the array to check for a spot and if the spot is available
     * then I incremented the true count which is (c), if its not available, then
     * I incremented the false count which is (count).
     * Then I made sure the counts were more than zero.
     *
     *PRE: have an array
     *POST: return true or false based on if the array is empty or not
     * @param: none
     * *return: boolean
     */

    public boolean isEmpty(){
        int count=0;
        int c=0;
        for(int i=0; i<size();i++){
            if(arrayL[i] == null){
                c++;
            }
            else{
                count++;
            }
        }

        if( c < 0){
            return false;
        }
        else{
            return true; 
        }
    }
    
    /**
     * This method is to find the index of the object in the array.
     * 
     * I started with creating a variable to keep track.
     * Then I looped through the array to find where the input of 
     * object is located and if found, I stored it in the tracker.
     * If not found then I returned -1.
     *
     *PRE: have an array full of objects and make sure the object is in the array
     *POST: return the index of where the object is located in the array.
     * @param: Object
     * *return: int
     */

    public int indexOf(Object ob){
        int t = 0;
        for(int i=0; i<arrayL.length;i++){
            if(arrayL[i] == ob){
                t = i;
            }
            else{
                t= -1;
            }
        }
        return t;
    }
    
    /**
     * This method is to check if the objects are equal to each other and the class.
     * 
     * I checked if the object was an instance of the class and if that was,then
     * I made an object of the class and used that to compare
     * the sizes of the objects and looped through to see if 
     * the elements match. If they don't then I returned false.
     *
     *PRE: have an object
     *POST: return true or false based on the check for matching.
     * @param: Object
     * *return: boolean
     */

    public boolean equals(Object other){
        if(other instanceof ArrayList == true){
            ArrayList theObj = (ArrayList) other;
            if(theObj.size() == this.size()){
                for(int i=0; i<= size(); i++){
                    if(this.arrayL[i] == theObj.arrayL[i]){
                        return true;
                    }else{
                        return false;
                    } 
                }
            }
        }
        else{
            return false;
        }
        return false; 
    }
    
    /**
     * This method is to get the index of the object.
     * 
     *if the array index is there and less than the elements then
     * I returned the index but if its not there then there is an error.
     *
     *PRE: have a valid object to find
     *POST: return the object based on the index
     * @param: int
     * *return: Object[]
     */

    public Object get(int index){
        if(arrayL[index] != null && index < numElem){
            return arrayL[index];
        }
        else{
            System.out.println("Index is out of bounds.");
            return null;
        }
    }
}
