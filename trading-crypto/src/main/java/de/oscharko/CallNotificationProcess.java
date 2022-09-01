package de.oscharko;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
/**
 * IntelliJ IDEA 2022.2
 * --------------------
 * ITGAIN Consulting Gesellschaft für IT-Beratung mbH
 * Check out -> www.itgain-consulting.de
 * --------------------
 * Created by oliver.scharkowski on 27.08.22 - 22:31 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Camunda-in-Action
 * Inside the package - de.oscharko
 * --------------------
 */
@Component
public class CallNotificationProcess implements JavaDelegate {

    @Override
    public void execute(DelegateExecution ctx) throws Exception {

        Map<String, Object> hm = new HashMap<String, Object>();
        hm.put("message", ctx.getVariable("message"));
        System.out.println("message = " + ctx.getVariable("message"));

        RuntimeService runtimeService = ctx.getProcessEngineServices().getRuntimeService();
        runtimeService.startProcessInstanceByMessage("mess_notify", hm);

    }
}