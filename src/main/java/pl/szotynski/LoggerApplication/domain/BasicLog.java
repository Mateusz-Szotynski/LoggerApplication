package pl.szotynski.LoggerApplication.domain;

import java.time.LocalDateTime;

public class BasicLog implements Log {

    private Severity severity;
    private LocalDateTime dateAndTimeOfEvent;
    private String message;

    @Override
    public String severity() {
        return severity.toString();
    }

    @Override
    public LocalDateTime dateAndTimeOfEvent() {
        return dateAndTimeOfEvent;
    }

    @Override
    public String message() {
        return message;
    }
}
