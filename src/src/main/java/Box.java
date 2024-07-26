public class Box<T> {
    T value;
    private String name;

    public Box(T value, String name) {
        this.value = value;
        this.name = name;
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

    public boolean hasSameName(Box<?> box){
        if(this.name.equals(box.name)){
            return true;
        }
        return false;
    }
}
