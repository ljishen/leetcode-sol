// Question: https://leetcode.com/problems/lru-cache/description/

public class LRUCache {
  private int capacity;
  private Map<Integer, LinkedObj> map;
  private LinkedObj head;
  private LinkedObj tail;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    map = new HashMap<Integer, LinkedObj>(capacity + 1);
  }

  public int get(int key) {
    LinkedObj obj = map.get(key);
    if (obj == null) {
      return -1;
    }

    if (obj != head) {
      obj.prev.next = obj.next;
      if (obj.next != null) {
        obj.next.prev = obj.prev;
      } else {
        // obj is the tail
        tail = obj.prev;
      }

      head = obj.takeHead(head);
    }

    return obj.value;
  }

  public void put(int key, int value) {
    int existVal = get(key);
    if (existVal != -1) {
      map.get(key).value = value;
      return;
    }

    LinkedObj obj = new LinkedObj(key, value);
    head = obj.takeHead(head);

    if (tail == null) {
      tail = obj;
    }

    map.put(key, obj);

    if (map.size() > capacity) {
      LinkedObj prev = tail.prev;
      if (prev != null) {
        map.remove(tail.key);
        prev.next = null;
      }
      tail = prev;
    }
  }

  private static class LinkedObj {
    private final int key;
    private int value;
    private LinkedObj prev;
    private LinkedObj next;

    LinkedObj(int key, int value) {
      this.key = key;
      this.value = value;
    }

    LinkedObj takeHead(LinkedObj head) {
      this.prev = null;
      this.next = head;

      if (head != null) {
        head.prev = this;
      }

      return this;
    }
  }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj = new
 * LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
