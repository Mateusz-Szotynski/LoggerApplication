package pl.szotynski.LoggerApplication.domain;

import org.springframework.http.HttpStatus;

public final class WebBasicLog extends BasicLog implements WebLog{

    private HttpStatus httpStatus;

    @Override
    public HttpStatus httpStatus() {
        return httpStatus;
    }
}
