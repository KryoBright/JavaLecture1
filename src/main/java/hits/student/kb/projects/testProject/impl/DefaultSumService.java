package hits.student.kb.projects.testProject.impl;

import hits.student.kb.projects.testProject.SumService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
public class DefaultSumService implements SumService {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
