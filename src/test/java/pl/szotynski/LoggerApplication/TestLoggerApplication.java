package pl.szotynski.LoggerApplication;

import org.springframework.boot.SpringApplication;

public class TestLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.from(LoggerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
