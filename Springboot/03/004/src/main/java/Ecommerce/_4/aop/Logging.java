package Ecommerce._4.aop;

import org.apache.logging.log4j.CloseableThreadContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class Logging {
    private Logger logger = Logger.getLogger(Logging.class.getName());

    @Around("@within (Ecommerce._4.aop.LogAspect)")
    public Object log (ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + "method execution Start");
        Instant start = Instant.now();
        Object result = joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("time took " + joinPoint.getSignature().toString()+  " : "+ timeElapsed );
       return result;

    }
}
