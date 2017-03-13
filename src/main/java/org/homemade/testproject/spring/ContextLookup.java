package org.homemade.testproject.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Dmytro Legeza
 */
@Component
public final class ContextLookup implements ApplicationContextAware {

	private static ApplicationContext sApplicationContext;

	private ContextLookup() {}

	@Override
	public void setApplicationContext( final ApplicationContext aApplicationContext ) throws BeansException {
		setContext( aApplicationContext );
	}

	public static void setContext( final ApplicationContext aApplicationContext ) {
		sApplicationContext = aApplicationContext;
	}

	public static Object getBean( String aName ) {
		if ( sApplicationContext != null ) {
			return sApplicationContext.getBean( aName );
		}
		return null;
	}

	public static <T> T getBean( final Class<T> aClass ) {
		if ( sApplicationContext != null ) {
			return sApplicationContext.getBean( aClass );
		}
		return null;
	}

}
