package co.flyver.utils.flyvermq.exceptions;

/**
 * Created by Petar Petrov on 12/16/14.
 */
public class NoSuchTopicException extends Exception {
    public NoSuchTopicException(String detailMessage) {
        super(detailMessage);
    }
}
