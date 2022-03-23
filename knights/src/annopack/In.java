package annopack;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface In {
	String factoryname();
}

@Retention(RUNTIME)
@interface Out{
	
}