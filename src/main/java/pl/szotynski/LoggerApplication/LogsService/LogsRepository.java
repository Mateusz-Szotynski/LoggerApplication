package pl.szotynski.LoggerApplication.LogsService;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.szotynski.LoggerApplication.domain.Log;

interface LogsRepository extends MongoRepository<Log, Long> {

}
