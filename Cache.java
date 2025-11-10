import java.util.ArrayList;

public class Cache<T> {
    private int n;

    public Cache(int n) {
        this.n = n;
    }

    ArrayList<T> cacheObjects = new ArrayList<T>(); {
        if (cacheObjects.size() > n) {
            cacheObjects.remove(0);
        }
    }

    //methods:
    public void add(T item) {
        cacheObjects.add(item);
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
        if (cacheObjects.contains(0)) {
            return cacheObjects.get(0);
        }
        else {
            return null;
        }
    }

    public T getLast() {
        if (cacheObjects.contains(cacheObjects.size() - 1)) {
            return cacheObjects.get(cacheObjects.size() - 1);
        }
        else {
            return null;
        }
    }
}
