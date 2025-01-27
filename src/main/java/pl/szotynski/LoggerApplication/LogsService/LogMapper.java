package pl.szotynski.LoggerApplication.LogsService;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import pl.szotynski.LoggerApplication.domain.BasicLog;
import pl.szotynski.LoggerApplication.domain.Log;

@Component
final class LogMapper {

    Log logDAOToLog(LogDAO logDAO) {
        return BasicLog.builder()
                .severity(logDAO.severity)
                .dateAndTimeOfEvent(logDAO.dateAndTimeOfEvent)
                .message(logDAO.message)
                .build();
    }
}
