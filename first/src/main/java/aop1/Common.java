package aop1;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class Common {
	
	long start = 0;
	
	public void a() {
		start = System.currentTimeMillis();
		System.out.println("===> a method do before aop : " + new Date(start));
	}
	
	public void b() {
		System.out.println("===> b method do after aop : " + (System.currentTimeMillis() - start));
	}
	
	public void c(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("===> c method do before aop : ");
		System.out.println("target object : " + pjp.getTarget());
		System.out.println("target method : " + pjp.toLongString());
		Object value = pjp.proceed(); // target class method 실행되는 곳
		if(value != null) System.out.println(value);
		System.out.println("===> c method do after aop : ");
	}
	
}
