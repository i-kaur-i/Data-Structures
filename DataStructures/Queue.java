
/**
 * This queue class is about removing and adding elements in
 * the queue.
 * 
 *  There are different ways to add the elements. Enenque is to
 *  remove an element from the front of the queue, dequeue is to add the data
 *  in the front of the queue. Also has methods to check if the queue is empty
 *  and if the class equals the instance of the class.
 *  
 * @author Iakjot Kaur
 * @version April 18th, 2020
 */
public class Queue
{
    // instance variables 
    public Object[] queue = new Object[100];
    private int numElem = 0;

    /**
     * This method is to remove an element from the front of the queue.
     * 
     * if the passed in object isn't null and the number is less
     * than the queue length then I add the element in the queue
     * and make it the object.if the number is greater,
     * then I resize the array and put it in. I exit the program
     * if none of these occur and give an error
     *
     * PRE: have an object
     * POST:remove object from the front of the queue
     * @param: Object
     * return: none
     */
    public void enqueue(Object obj){
        if( obj != null && numElem < queue.length ){
            this.queue[this.numElem] = obj;
            this.numElem++;
        }
        else if(numElem > queue.length){
            queue = resize();
            queue[numElem]=0;

        }
        else{
            System.out.println("error");
            System.exit(0); 
        }
    }

    /**
     * This method is to resize the array of the queue.
     * 
     * made an object array and stored the number of elements inside
     * looped through the array and copied of the stuff
     * return the resized array 
     * 
     * PRE: have an onject array
     * POST: return the resized object array
     * @param: none
     * *return: Object[]
     */

    public Object[] resize(){
        Object[] resizedQ = new Object[numElem];
        for(int i=0; i< queue.length; i++){
            resizedQ[i] = queue[i];
        }
        return resizedQ;
    }

    /**
     * This method is to show the what I have in the array.
     * 
     * Made a for each loop to get the info
     * Made this just to test along the way.
     *
     * PRE: have objects in the array
     * POST: print out everything in the queue
     * @param: none
     * *return: none
     */

    public void show(){
        for(Object el: queue){
            System.out.println(el + " ");
        }
    }

    /**
     * This method is to get the size of the queue.
     * 
     * I returned the number of elements in the queue
     * to get the size.
     *
     * PRE: have an object array
     * POST: return the size of the array
     * @param: none
     * *return: int
     */

    public int size(){
        return this.numElem;
    }

    /**
     * This method is to add the data elements to the front of the queue.
     * 
     *  I made a temp object and then looped through
     *  and made the queue and added the element.
     *
     * PRE: have an object to add and an array
     * POST: add the data to the front of the queue
     * @param: none
     * *return: Object
     */

    public Object dequeue(){
        Object temp = queue[0];
        for(int i=0; i<numElem; i++){
            queue[i] = queue[i+1];
        }
        return temp;
    }

    /**
     * This method is to print out the elements with commas.
     * 
     * Started with a temp with an empty string
     * and then I looped through and stored the queue with
     * commas.
     *
     * PRE: have a queue to print out 
     * POST: return the string and printed out data
     * @param: none
     * *return: String
     */
    public String toString(){
        String temp = "";
        for(int i=0; i < numElem; i++){
            temp+= queue[i] + " , ";
        }
        return temp;
    }

    /**
     * This method is to check if the queue is empty or not.
     * 
     *  I looped through the elements and if the queue is null
     *  then I returned true and if not its false.
     *
     * PRE: have a object array
     * POST: returns true or false based on if the queue is empty or not
     * @param: ints
     * *return: none
     */
    public boolean isEmpty(){
        for(int i=0; i< numElem; i++){
            if(queue[i] == null){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    /**
     * This method is to check if the object equals the other objects and the class.
     * 
     *  I checked if the object was an instance of the class,
     *  then I made an instance and compared the sizes and the
     *  elements in the queue.If they matched, then they
     *  were considered equal.
     *
     * PRE: have an object to compare
     * POST: return true or false based on if it equals the instance of the class.
     * @param: Object
     * *return: boolean
     */
    public boolean equals(Object ob){
        if( ob instanceof Queue == true){
            Queue o = (Queue) ob; 
            if( o.size() == this.size()){
                for(int i=0; i <= size(); i++){
                    if(o.queue[i] == this.queue[i]){
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
