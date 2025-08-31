package Ecommerce._4.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Slf4j
@Aspect
@Component
public class Loggingg {
    @Around("execution(* Ecommerce._4.service.serviceIMPL.OrderServiceImpl.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable   {
        log.info("{} method execution start", proceedingJoinPoint.getSignature());
        Instant start = Instant.now();

        Object result = proceedingJoinPoint.proceed();

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        log.info("Time taken for {} : {}" , proceedingJoinPoint.getSignature(), timeElapsed);
        log.info("{} method Execution End", proceedingJoinPoint.getSignature());
        return result;

    }

    @AfterThrowing(
            value = "execution(* Ecommerce._4.service.serviceIMPL.OrderServiceImpl.*(..))",
            throwing = "ex"
    )
    public void logException(JoinPoint joinPoint , Exception ex){
        log.error("Exception in {}: {}" , joinPoint.getSignature(),ex.getMessage()   );
    }

}
