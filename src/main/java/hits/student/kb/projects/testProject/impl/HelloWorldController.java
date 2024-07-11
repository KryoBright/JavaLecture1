package hits.student.kb.projects.testProject.impl;

import hits.student.kb.projects.testProject.SumService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HelloWorldController {

    @Qualifier("defaultSumService")
    private final SumService sumService;

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld(@RequestParam("a") int a, @RequestParam("b") int b) {
        return ResponseEntity.ok(String.valueOf(sumService.sum(a,b)));
    }
}