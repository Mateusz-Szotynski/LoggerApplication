package pl.szotynski.LoggerApplication.LogsService;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import pl.szotynski.LoggerApplication.domain.BasicLog;
import pl.szotynski.LoggerApplication.domain.Log;
import pl.szotynski.LoggerApplication.domain.Severity;

import java.time.LocalDateTime;
import java.util.List;

@Controller
final class LogsController {

    private final QueryLogsService queryLogsService;
    private final RegisterLogsService registerLogsService;

    LogsController(QueryLogsService queryLogsService, RegisterLogsService registerLogsService) {
        this.queryLogsService = queryLogsService;
        this.registerLogsService = registerLogsService;
    }

    @QueryMapping
    List<Log> logBySeverity(@Argument Severity severity) {
        return queryLogsService.logBySeverity(severity);
    }

    @MutationMapping
    Log createLog(@Argument Severity severity,
                  @Argument String dateAndTimeOfEvent, @Argument String message) {
        return registerLogsService.createLog(BasicLog.builder()
                .severity(severity)
                .dateAndTimeOfEvent(LocalDateTime.parse(dateAndTimeOfEvent))
                .message(message)
                .build());
    }
}
