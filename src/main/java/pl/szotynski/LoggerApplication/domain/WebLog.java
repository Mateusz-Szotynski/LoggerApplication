package pl.szotynski.LoggerApplication.domain;

import org.springframework.http.HttpStatus;

public interface WebLog extends Log {

    HttpStatus httpStatus();
}
