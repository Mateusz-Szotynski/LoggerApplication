package pl.szotynski.LoggerApplication.LogsService;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import pl.szotynski.LoggerApplication.domain.Log;
import pl.szotynski.LoggerApplication.domain.Severity;

import java.util.List;

@Repository
interface LogsRepository extends MongoRepository<LogDAO, Long> {

    @Query("select l from Log l where l.severity = ?1")
    List<Log> findAllBySeverity(Severity severity);
}
