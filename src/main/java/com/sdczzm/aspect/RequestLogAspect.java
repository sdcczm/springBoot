package com.sdczzm.aspect;

import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Aspect
@Component
public class RequestLogAspect {
	private Logger logger=LogManager.getLogger(RequestLogAspect.class);
	
	ThreadLocal<Long> startTime=new ThreadLocal<Long>();
	
	@Pointcut("execution(public * com.sdczzm.controller..*.*(..))")
	public void RequestLog(){};

	@Before("RequestLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		startTime.set(System.currentTimeMillis());
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// 记录下请求内容
		logger.info("URL : " + request.getRequestURL().toString());
		logger.info("CLASS_METHOD : "+ joinPoint.getSignature().getDeclaringTypeName() + "."+ joinPoint.getSignature().getName());

	}

	@AfterReturning(returning = "ret", pointcut = "RequestLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		//处理完请求，统计处理时间
		logger.info("SPEND TIME : "+ (System.currentTimeMillis() - startTime.get()));
	}

}
