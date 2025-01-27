package pl.szotynski.LoggerApplication.LogsService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import pl.szotynski.LoggerApplication.domain.Log;
import pl.szotynski.LoggerApplication.domain.Severity;

import java.util.List;

@Service
final class QueryLogsService {

    private final LogsRepository logsRepository;

    public QueryLogsService(LogsRepository logsRepository) {
        this.logsRepository = logsRepository;
    }

    List<Log> logBySeverity(Severity severity) {
        return logsRepository.findAllBySeverity(severity);
    }
}
