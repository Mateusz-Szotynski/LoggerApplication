package pl.szotynski.LoggerApplication.LogsService;

import org.springframework.stereotype.Service;
import pl.szotynski.LoggerApplication.domain.Log;

@Service
final class RegisterLogsService {

    private final LogsRepository logsRepository;
    private final LogMapper logMapper;

    RegisterLogsService(LogsRepository logsRepository, LogMapper logMapper) {
        this.logsRepository = logsRepository;
        this.logMapper = logMapper;
    }

    Log createLog(Log log) {
        return logMapper.logDAOToLog(
                logsRepository.save(
                        new LogDAO(
                                log.severity(),
                                log.dateAndTimeOfEvent(),
                                log.message()
                        )
                )
        );
    }
}
