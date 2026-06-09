package br.alvaro.factoryCriacional;

public class Application {
    
    final Logger logger;
    
    Application(Logger logger) {
        this.logger = logger;
    }

    void run() {
        logger.info("Application is running");
        logger.error("An error occurred");
    }
}
