package aop2;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Common {
	
	long start = 0;
	
	@Pointcut("execution (* aop2.*.*(..))")
	public void pc() { }
	
	@Before("pc()")
	public void a() {
		start = System.currentTimeMillis();
		System.out.println("===> a method do before aop : " + new Date(start));
	}
	
	@After("pc()")
	public void b() {
		System.out.println("===> b method do after aop : " + (System.currentTimeMillis() - start));
	}
	
	@Around("pc()")
	public void c(ProceedingJoinPoint joinpoint) {
		try {
		System.out.println("===> c메소드는 핵심관심 이전 호출 : ");
		System.out.println("타겟클래스객체 = " + joinpoint.getTarget());
		System.out.println("타겟메소드 = " + joinpoint.toLongString());
		Object [] args = joinpoint.getArgs();
		for(Object o : args) {
			System.out.println("매개변수 = " + o);
		}
		Object returnVal = joinpoint.proceed();
		if(returnVal != null) {
			System.out.println("리턴값 = " + returnVal);
		}
		System.out.println("===> c메소드는 핵심관심 이후 호출 : ");
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
}
