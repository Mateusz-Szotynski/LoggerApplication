package pl.szotynski.LoggerApplication.LogsService;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pl.szotynski.LoggerApplication.domain.Log;

@Mapper
interface LogMapper {

    LogMapper INSTANCE = Mappers.getMapper(LogMapper.class);

    Log logDAOToLog(LogDAO logDAO);
}
