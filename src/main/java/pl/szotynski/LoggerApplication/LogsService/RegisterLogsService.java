package pl.szotynski.LoggerApplication.LogsService;

import org.springframework.stereotype.Service;
import pl.szotynski.LoggerApplication.domain.Log;

@Service
final class RegisterLogsService {

    private final LogsRepository logsRepository;

    RegisterLogsService(LogsRepository logsRepository) {
        this.logsRepository = logsRepository;
    }

    LogDAO createLog(Log log) {
        return logsRepository.save(new LogDAO(log.severity(), log.dateAndTimeOfEvent(), log.message()));
    }
}
