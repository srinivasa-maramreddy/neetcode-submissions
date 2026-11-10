
class MyHashSet {

    HashSet<Integer> myHashSet;

    public MyHashSet() {
        myHashSet = new HashSet<>();
    }
    
    public void add(int key) {
        if (!myHashSet.contains(key)) {
            myHashSet.add(key);
        }
    }
    
    public void remove(int key) {
        if (myHashSet.contains(key)) {
            myHashSet.remove(key);
        }
    }
    
    public boolean contains(int key) {
        return myHashSet.contains(key);
    }
}
