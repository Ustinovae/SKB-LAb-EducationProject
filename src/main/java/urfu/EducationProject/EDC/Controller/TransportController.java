package urfu.EducationProject.EDC.Controller;



import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import urfu.EducationProject.EDC.Service.*;


@RestController()
@RequestMapping("/transport")
@AllArgsConstructor
public class TransportController {
     private final TransportService transportService;

    @GetMapping("/start")
    public ResponseEntity start(){
        try {
            transportService.startTransport();
            return ResponseEntity.ok("Transport Run");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }



    @GetMapping("/stop")
    public ResponseEntity stop(){
        try {
            transportService.stopTransport();
            return ResponseEntity.ok("Transport stop");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
