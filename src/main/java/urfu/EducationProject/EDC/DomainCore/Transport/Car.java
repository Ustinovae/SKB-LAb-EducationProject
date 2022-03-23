package urfu.EducationProject.EDC.DomainCore.Transport;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import urfu.EducationProject.EDC.DomainCore.Engine.InternalCombustionEngine;
import urfu.EducationProject.EDC.TransportInterface;

@Slf4j
@Component
public class Car implements TransportInterface {

    private InternalCombustionEngine engine;

    @Autowired
    public void setEngine(InternalCombustionEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        log.info("Двигатель заведен, мотор рычит, машина греется");
    }

    @Override
    public void stop() {
        log.info("Двигатель заглушил, чтобы беньзин не расходовать");
    }
}
