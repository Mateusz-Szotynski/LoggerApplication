package pl.szotynski.LoggerApplication.domain;

import java.time.LocalDateTime;

public interface Log {

    Severity severity();

    LocalDateTime dateAndTimeOfEvent();

    String message();
}
