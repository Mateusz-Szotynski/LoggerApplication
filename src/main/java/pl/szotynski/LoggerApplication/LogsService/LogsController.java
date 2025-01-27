package pl.szotynski.LoggerApplication.LogsService;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;
import pl.szotynski.LoggerApplication.domain.Log;
import pl.szotynski.LoggerApplication.domain.Severity;

@Controller
@RequiredArgsConstructor
final class LogsController {

    private final QueryLogsService queryLogsService;
    private final RegisterLogsService registerLogsService;

    Log logBySeverity(@Argument Severity severity) {

    }
}
