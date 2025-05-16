package com.example.aopdemo.aspect;

// Importing AOP (Aspect-Oriented Programming) related classes
import org.aspectj.lang.ProceedingJoinPoint; // Represents a method execution in AOP
import org.aspectj.lang.annotation.Around;   // Defines an Around advice (before and after a method)
import org.aspectj.lang.annotation.Aspect;  // Declares this class as an Aspect (AOP)
import org.springframework.stereotype.Component; // Registers this class as a Spring Bean (component)

/**
 * LoggingAspect class - Demonstrates Aspect-Oriented Programming (AOP) in Spring.
 * This aspect is responsible for logging the execution time of methods in the service package.
 */
@Aspect 
// @Aspect - Marks this class as an Aspect (cross-cutting logic that can be applied to other components).
@Component 
// @Component - Registers this class as a Spring Bean, making it available for dependency injection.
public class LoggingAspect {

    /**
     * Around advice method that logs the execution time of service methods.
     * This method will be executed before and after the target method.
     * 
     * @param joinPoint the join point representing the target method being called
     * @return the result of the target method's execution
     * @throws Throwable if the target method throws any exception
     */
    @Around("execution(* com.example.aopdemo.service.*.*(..))")
    // @Around - Defines an Around advice, which runs before and after the target method.
    // "execution(* com.example.aopdemo.service.*.*(..))" - The pointcut expression:
    // - Matches any method (*) in any class (.*) under the package com.example.aopdemo.service.
    // - The ".." means any number of parameters can be passed to the method.
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        // Retrieving the method signature (name of the target method)
        String methodName = joinPoint.getSignature().toShortString();
        System.out.println("[AOP] Entering: " + methodName);

        // Recording the start time for performance measurement
        long start = System.currentTimeMillis();

        // Proceeding with the target method execution (this is where the target method is actually called)
        Object result = joinPoint.proceed();

        // Calculating the duration of the method execution
        long duration = System.currentTimeMillis() - start;

        // Logging the execution time of the method
        System.out.println("[AOP] Exiting: " + methodName + " (Execution time: " + duration + " ms)");

        // Returning the result of the target method
        return result;
    }
}

