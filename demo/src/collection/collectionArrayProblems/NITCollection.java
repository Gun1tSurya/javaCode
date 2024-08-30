package collection.collectionArrayProblems;

public class NITCollection {

   private Object[] objArray = new Object[10];
   int elementCount = 0;
   public void add(Object obj){
       if(elementCount == objArray.length){
           increaseCapacity();
       }
       objArray[elementCount] = obj;
       elementCount++;
   }

    private void increaseCapacity() {
       int newCapacity =  objArray.length*2;
       Object[] newObjArray = new Object[newCapacity];

       for(int i = 0; i< objArray.length; i++){
           newObjArray[i] = objArray[i];
       }

       objArray = newObjArray;
    }

    public int capacity() {
       return objArray.length;
    }

    public int size() {
       return elementCount;
    }

    public Object get(int index) {
       if(index < 0 || index >=size()){
           throw new IndexOutOfBoundsException();
       }
       return objArray[index];
    }

    public void replace(int index, Object obj) {
        if(index < 0 || index >=size()){
            throw new IndexOutOfBoundsException();
        }
       objArray[index] = obj;
   }

    public void remove(int index) {
       while(index < size()-1){
           objArray[index] = objArray[index+1];
       }index++;

       objArray[index] = null;
       elementCount--;
    }
}
