package ru.practicum.exception;

public class NotCorrectEventStateException extends RuntimeException {
    public NotCorrectEventStateException(String message) {
        super(message);
    }
}
