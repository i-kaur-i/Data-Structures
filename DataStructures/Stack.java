
/**
 * This class is about using different operations to add
 * and remove elements from a stack. 
 * 
 * It has push which is adding the element 
 * at the top of the stack. Pop is is removing the top of the element
 * in the stack. This class also has methods to check
 * if the stack is equal to the instance and to check
 * if the stack is empty or not.
 *
 * @author Iakjot Kaur
 * @version April 18th, 2020
 */
public class Stack
{
    // instance variables
    private Object[] stack = new Object[100];
    private int numElem = 0;

    /**
     *  This method is to push the element to the top of the stack.
     * 
     *  I made sure the object passed in wasn't null and the element
     *  of it was less than the stack length and then added the element 
     *  into the stack and made it the object. Then I incremented the
     *  elements.If the elements were bigger than I resized and stored.
     *  
     *  PRE: have an object that isn't null 
     *  POST: push the element to the top of the stack
     *  @param: Object
     *  return: none
     */
    public void push(Object obj){
        if( obj != null ){
            if( numElem < stack.length){
                this.stack[this.numElem++] = obj;
            }
            if(numElem > stack.length){
                stack = resize();
                stack[numElem] = 0;
            }
        }
        else{
            System.out.println("error");
            return; 
        }
    }

    /**
     * The method is to resize the object array.
     * 
     * First made a new resized array with the same number of elements
     * then i looped through the copied over the elements 
     * then i returned the new resized array
     *
     * PRE: have an object array to resize
     * POST: returned the new resized array with all of the elements stored.
     * @param: none
     * return: Object[]
     */
    public Object[] resize(){
        Object[] resizedStack = new Object[numElem];
        for(int i =0; i< stack.length; i++){
            resizedStack[i] = stack[i];
        }
        return resizedStack;
    }

    /**
     * This method is to remove the element on top of the stack.
     * 
     * the object variable called data is created and subtracted the element
     * and then the element in the stack is stored in the variable I made
     * and then returned the variable data.
     *
     * PRE: have an object to remove from top
     * POST: removes the element on top of the stack
     * @param: none
     * return: Object
     */
    public Object pop(){
        Object data;
        numElem--;
        data = stack[numElem];
        stack[numElem] = null;
        return data;
    }

    /**
     * This method is to show the what I have in the stack currently.
     * 
     * used a for each loop and printed out the elements in the stack with a print statement
     *
     * PRE: have a stack 
     * POST: prints the objects in the stack
     * @param: none
     * *return: none
     */
    public void show(){
        for(Object el: stack){
            System.out.println(el + " ");
        }
    }

    /**
     * to get the size of the current stack.
     * 
     * returned the number of elements in the stack to get the size
     * of it.
     *
     * PRE: have a stack
     * POST: returns the size of the stack
     * @param: none
     * return: int
     */
    public int size(){
        return numElem; 
    }

    /**
     * This method is to print out the elements with commas that is in the stack.
     * 
     * I used a temp with an empty string
     * and then I looped through and stored the stack with
     * commas.
     *
     * PRE: have a stack to print out
     * POST: returns the temp string with printed elements in the stack
     * @param: none
     * return: String
     */
    public String toString(){
        String temp = "";
        for(int i=0; i< numElem; i++){
            temp += stack[i]; 
        }
        return temp;
    }

    /**
     * This method is to check if the stack is empty or not.
     * 
     * I used a temp with an empty string
     * and then I looped through and stored the stack with
     * commas.
     *
     * PRE: have a stack
     * POST: return true or false based on if its empty or not
     * @param: none
     * *return: boolean
     */
    public boolean isEmpty(){
        for(int i=0; i<numElem; i++){
            if(stack[i] != null){
                return false;
            }
        }

        return true;
    }

    /**
     * This method is to check if the object is equal to the other and the class.
     * 
     * First I checked if the object is an instance of the class.
     * Then I made an object of the stack and compared the size 
     * of the instance and the object. Then I compared the elements
     * in the for loop.
     * 
     * PRE:have an object to check
     * POST: return true or false.
     * @param: Object
     * return: boolean
     */
    public boolean equals(Object object){
        if(object instanceof Stack == true){
            Stack o = (Stack) object;
            if( o.size() == this.size()){
                for(int i=0; i <= size(); i++){
                    if(o.stack[i] == this.stack[i]){
                        return true;
                    }else{
                        return false;
                    }
                }

            }

        }
        return false;

    }
}
