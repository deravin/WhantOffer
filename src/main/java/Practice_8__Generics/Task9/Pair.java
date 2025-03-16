package Practice_8__Generics.Task9;
//Использование нескольких параметров типа: Реализуйте обобщённый класс Pair<K, V>, который хранит пару значений разного типа.
public class Pair<K,V> {
    private K key;
    private V value;

    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V v){
        this.value = v;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
