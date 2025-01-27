package pl.szotynski.LoggerApplication.LogsService;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import pl.szotynski.LoggerApplication.domain.Severity;

import java.time.LocalDateTime;

@Document
public class LogDAO {

    @MongoId
    Long id;

    Severity severity;

    LocalDateTime dateAndTimeOfEvent;

    String message;

    public LogDAO(Severity severity, LocalDateTime dateAndTimeOfEvent, String message) {
        this.severity = severity;
        this.dateAndTimeOfEvent = dateAndTimeOfEvent;
        this.message = message;
    }

    LogDAO(Long id, Severity severity, LocalDateTime dateAndTimeOfEvent, String message) {
        this.id = id;
        this.severity = severity;
        this.dateAndTimeOfEvent = dateAndTimeOfEvent;
        this.message = message;
    }
}
