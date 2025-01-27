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
    private final LogMapper logMapper;

    QueryLogsService(LogsRepository logsRepository, LogMapper logMapper) {
        this.logsRepository = logsRepository;
        this.logMapper = logMapper;
    }

    List<Log> logBySeverity(Severity severity) {
        return logsRepository.findAllBySeverity(severity).stream()
                .map(logMapper::logDAOToLog)
                .toList();
    }
}
