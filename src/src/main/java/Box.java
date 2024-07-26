import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Box<T, V extends Number & Comparable<V>> implements BoxOperations<V>{
    T value;
    private String name;
    private V largestValue;

    public Box(String name) {
        this.name = name;
    }



    @Override
    public V getLargestValue() {
        return largestValue;
    }

    @Override
    public void setLargestValue(V value1, V value2){
        if ( value1.doubleValue() > value2.doubleValue()){
            this.largestValue = value1;
        } else {
            this.largestValue = value2;
        }
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <V> T castValue(V value) {
        try {return (T) value;
        } catch (ClassCastException e) {
            System.out.println("Failed: cannot cast this value");
        }
        return null;
    }

    public boolean hasSameName(Box<?, ?> box){
        if(this.name.equals(box.name)){
            return true;
        }
        return false;
    }

    public void setLargestValueFromList(List<V> list) {
      largestValue = Collections.max(list);
    }
}
