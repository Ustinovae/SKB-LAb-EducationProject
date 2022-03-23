package urfu.EducationProject.EDC.Service;

import org.springframework.stereotype.Service;
import urfu.EducationProject.EDC.DomainCore.Transport.Car;
import urfu.EducationProject.EDC.DomainCore.Transport.HybridСar;
import urfu.EducationProject.EDC.DomainCore.Transport.Motorcycle;

@Service
public class TransportService {

    private Car car;
    private Motorcycle motorcycle;
    private HybridСar hybridСar;

    public TransportService(Car car, Motorcycle motorcycle, HybridСar hybridСar){
        this.car = car;
        this.motorcycle = motorcycle;
        this.hybridСar = hybridСar;
    }

    public void startTransport(){
        car.start();
        motorcycle.start();
        hybridСar.start();
    }

    public void stopTransport(){
        car.stop();
        motorcycle.stop();
        hybridСar.stop();
    }
}
