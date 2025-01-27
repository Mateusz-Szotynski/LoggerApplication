package pl.szotynski.LoggerApplication.domain;

import java.time.LocalDateTime;

public interface Log {

    String severity();

    LocalDateTime dateAndTimeOfEvent();

    String message();
}
