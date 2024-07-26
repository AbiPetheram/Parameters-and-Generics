public interface BoxOperations<V extends Comparable<V>> {
    V getLargestValue();
    void setLargestValue(V value1, V value2);
}
