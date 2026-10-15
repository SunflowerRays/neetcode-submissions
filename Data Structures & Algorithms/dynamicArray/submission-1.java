public class DynamicArray {


    ArrayList<Integer> z;
    private int capacity;
    public DynamicArray(int capacity){
    
        this.capacity = capacity;
        z = new ArrayList<>(capacity); 
    
    }


    public int get(int i) {

        int y = z.get(i);

        return y;

    }

    public void set(int i, int n) {

        z.set(i,n);

    }

    public void pushback(int n) {
        if(z.size() == capacity)
        {
            resize();
        }
        z.add(n);

    }

    public int popback() {
     
        int y = z.get(z.size()-1);
        z.remove(z.size()-1);
        return y;
    }

    private void resize() {

        int x = z.size();
        capacity  = capacity*2;
        z.ensureCapacity(capacity);
    }

    public int getSize() {
        int x = z.size();
        return x;
    }

    public int getCapacity() {

    return capacity;

    }

}
