package urfu.EducationProject.EDC.DomainCore.Transport;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import urfu.EducationProject.EDC.DomainCore.Engine.InternalCombustionEngine;
import urfu.EducationProject.EDC.TransportInterface;

@Slf4j
@Component
public class Motorcycle implements TransportInterface {

    @Autowired
    private InternalCombustionEngine engine;

    @Override
    public void start() {
        log.info("Мотик завел, ща прокачусь");
    }

    @Override
    public void stop() {
        log.info("Заглушил двигатель. Мотоцикл, это конечно прикольно, но не в ливень.");
    }
}
