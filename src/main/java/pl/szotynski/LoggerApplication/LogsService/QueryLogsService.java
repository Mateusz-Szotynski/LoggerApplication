package pl.szotynski.LoggerApplication.LogsService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
final class QueryLogsService {

    private final LogsRepository logsRepository;

}
