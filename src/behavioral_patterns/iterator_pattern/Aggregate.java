package behavioral_patterns.iterator_pattern;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
