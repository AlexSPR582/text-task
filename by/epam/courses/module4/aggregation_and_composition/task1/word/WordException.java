package by.epam.courses.module4.aggregation_and_composition.task1.word;

public class WordException extends RuntimeException{
    public WordException() {}

    public WordException(String text) {
        super(text);
    }

    public WordException(Exception e) {
        super(e);
    }

    public WordException(String text, Exception e) {
        super(text, e);
    }
}
