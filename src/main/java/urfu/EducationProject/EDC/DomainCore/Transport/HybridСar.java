package urfu.EducationProject.EDC.DomainCore.Transport;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import urfu.EducationProject.EDC.DomainCore.Engine.Engine;
import urfu.EducationProject.EDC.TransportInterface;

@Slf4j
@Component
public class HybridСar implements TransportInterface {

    private Engine electric;
    private Engine internalCombustion;

    public HybridСar(@Qualifier("electric") Engine electricEngine,
                     @Qualifier("internalCombustion") Engine internalCombustionEngine) {
        electric = electricEngine;
        internalCombustion = internalCombustionEngine;
    }

    @Override
    public void start() {
        log.info("Двигатель заведен, мотор рычит, машина греется.");
        log.info("Электродвигатель отключен до начала движения.");
    }

    @Override
    public void stop() {
        log.info("Двигатель заглушил, чтобы беньзин не расходовать.");
        log.info("Электродвигатель, вроде, не работает.");
    }
}
