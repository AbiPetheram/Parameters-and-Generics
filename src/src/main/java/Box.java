public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public <V> T castValue(V value) {
        try {return (T) value;
        } catch (ClassCastException e) {
            System.out.println("Failed: cannot cast this value");
        }
        return null;
    }
}
