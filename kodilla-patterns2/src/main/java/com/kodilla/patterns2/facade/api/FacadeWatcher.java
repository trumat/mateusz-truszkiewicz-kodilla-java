package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class FacadeWatcher {
    public static Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && target(object) && args(orderDto, userId)")
    public void logStart(Object object, OrderDto orderDto, Long userId) {
        LOGGER.info("Class: " + object.getClass().getName() + ", User ID: " + userId);
        LOGGER.info("Items to be processed: " +
                orderDto.getItems().stream()
                        .map(i -> i.getProductId())
                        .collect(Collectors.toList()));
    }

    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && target(object)")
    public void logFinish(Object object) {
        LOGGER.info("Processing finished for " + object.getClass().getName());
    }
}
