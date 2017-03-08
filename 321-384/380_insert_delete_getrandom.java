public class RandomizedSet {
    
    Map<Integer, Integer> map;
    List<Integer> ls;
    Random rand = new Random();
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        ls = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if ( map.containsKey(val) ) return false;
        map.put(val, ls.size());
        ls.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if ( !map.containsKey(val) ) return false;
        if (map.get(val) < ls.size()-1) {
            map.put(ls.get(ls.size()-1), map.get(val) );
            ls.set( map.get(val) , ls.get(ls.size()-1) );
        }
        ls.remove(ls.size()-1);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return ls.get(rand.nextInt( ls.size() ));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */