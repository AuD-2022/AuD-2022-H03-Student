package h03;

import java.util.List;

/**
 * This class realizes the algorithm of string matching BOFA using a pre-processed PartialMatchLengthUpdateValues object to search through a given source string.
 *
 * @param <T> The type of the letters, etc.
 */
public class StringMatcher<T> {
    /**
     * The update values to be used in the algorithm.
     */
    private final PartialMatchLengthUpdateValues<T> VALUES;

    /**
     * Constructs a new StringMatcher object with the given PartialMatchLengthUpdateValues object.
     *
     * @param values The update values for this object.
     */
    public StringMatcher(PartialMatchLengthUpdateValues<T> values) {
        throw new RuntimeException("H7 - not implemented"); // TODO: H7 - remove if implemented
    }

    /**
     * Finds and returns all indices at which an occurrence of the search string (pre-processed with the update values object) starts in the given source.
     *
     * @param source    The source string to search through.
     * @return          The list of calculated indices.
     */
    public List<Integer> findAllMatches(T[] source) {
        throw new RuntimeException("H7 - not implemented"); // TODO: H7 - remove if implemented
    }
}
