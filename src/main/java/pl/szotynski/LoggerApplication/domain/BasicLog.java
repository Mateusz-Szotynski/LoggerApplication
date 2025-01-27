package pl.szotynski.LoggerApplication.domain;

import java.time.LocalDateTime;

public final class BasicLog implements Log {

    private final Severity severity;
    private final LocalDateTime dateAndTimeOfEvent;
    private final String message;

    public static Builder builder() {
        return new Builder();
    }

    public final static class Builder {
        private Severity severity;
        private LocalDateTime dateAndTimeOfEvent;
        private String message;

        public Builder severity(Severity severity) {
            this.severity = severity;
            return this;
        }

        public Builder dateAndTimeOfEvent(LocalDateTime dateAndTimeOfEvent) {
            this.dateAndTimeOfEvent = dateAndTimeOfEvent;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public BasicLog build() {
            return new BasicLog(this);
        }
    }

    @Override
    public Severity severity() {
        return severity;
    }

    @Override
    public LocalDateTime dateAndTimeOfEvent() {
        return dateAndTimeOfEvent;
    }

    @Override
    public String message() {
        return message;
    }

    private BasicLog(Builder builder) {
        this.severity = builder.severity;
        this.dateAndTimeOfEvent = builder.dateAndTimeOfEvent;
        this.message = builder.message;
    }
}
