import java.util.ArrayList;

public class Cache<T> {
    private int n;
    private ArrayList<T> cacheObjects;

    public Cache(int n) {
        this.n = n;
        this.cacheObjects = new ArrayList<T>();
    }


    //methods:
    public void add(T item) {
        cacheObjects.add(item);
        if (cacheObjects.size() > n) {
            cacheObjects.remove(0);
        }
    }
    
    public boolean remove(T item) {
        if (cacheObjects.contains(item)) {
            cacheObjects.remove(item);
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean exists(T item) {
        return cacheObjects.contains(item);
    }

    public T getFirst() {
        if (!cacheObjects.isEmpty()) {
            return cacheObjects.get(0);
        }
        else {
            return null;
        }
    }

    public T getLast() {
        if (cacheObjects.size() == n) {
            return cacheObjects.get(cacheObjects.size() - 1);
        }
        else {
            return null;
        }
    }

    public T getItemByIndex(int i) {
        if (cacheObjects.size() >= i) {
            return cacheObjects.get(i);
        }
        else {
            return null;
        }
    }
}
