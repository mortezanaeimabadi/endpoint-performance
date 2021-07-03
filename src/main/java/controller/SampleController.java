package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class SampleController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<>("hello ", HttpStatus.OK);
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name){
        return new ResponseEntity<>("hi "+name,HttpStatus.OK);
    }

}
