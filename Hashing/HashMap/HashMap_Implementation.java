//Implementation of HAshmap (put,remove,get,containsKey,size())

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap_Implementation {

    static class HashMap<K, V> {
        public class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;// number of buckets
        private int n;// number of nodes
        private LinkedList<Node> buckets[];

        //constructor of HashMap
        @SuppressWarnings("Unchecked")
        public HashMap()
        {
            
            this.N = 4;
            this.buckets = new LinkedList[4];//to use here linkedlist we need to write something that is upper of this constructor
            for(int i=0; i<buckets.length; i++)
            {
                buckets[i] = new LinkedList<>(); //Initailize linkedlist in every buckets
            }
        }

        //Get bucket index
        private int HashFunction(K key)
        {
            int hc = key.hashCode();
            return Math.abs(hc) % N; //first we make that code positive(if we fet negative) then make that idex under the size (0-4)
        }

        //Get search data index
        private int searchLL(K key, int bi)
        {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0; i<ll.size(); i++)
            {
                Node node = ll.get(i);
                if(node.key == key)
                {
                    return di;
                }
                di++;
            }
            return -1;
        }

        //Rehasing function
        @SuppressWarnings("Unchecked")
        private void reHash()
        {
            LinkedList<Node>oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N = N *2;

            for(int i=0; i<buckets.length; i++)
            {
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in new buckets
            for(int i=0;i<oldBuck.length; i++)
            {
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++)
                {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        //put function
        public void put(K key, V value)
        {
            //Bucket index
            int bi = HashFunction(key);

            //Search data index on LL
            int di = searchLL(key,bi);

            //key already present
            if(di != -1)
            {
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n / N;
            if(lambda > 2.0){
                reHash();
            }
        }

        //2 containsKey()
        public boolean containsKey(K key)
        {
            //bucket index
            int bi = HashFunction(key);

            //data index
            int di = searchLL(key, bi);

            if(di != -1)
            {
                return true;
            }else{
                return false;
            }
        }

        //get function-> return value of key
        public V get(K key)
        {
            int bi = HashFunction(key);
            int di = searchLL(key, bi);

            if(di != -1)
            {
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        //remove function
        public V remove(K key)
        {
            int bi = HashFunction(key);
            int di = searchLL(key, bi);
            if(di != -1)
            {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

        //get all keys
        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++)
            {
                LinkedList<Node> ll = buckets[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        //isEmpty()
        public boolean isEmpty()
        {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        //Above created hashmap no inbuild one
        HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Us", 50);
        hm.put("China", 150);
        hm.put("Indonasia", 10);
        hm.put("Nepal", 1);

        
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // hm.put("Nepal", 4);
        System.out.println(hm.get("Nepal"));

        hm.remove("Indonasia");
        System.out.println(hm.get("Indonasia"));
        
    }
}
