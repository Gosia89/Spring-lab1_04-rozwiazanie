package altkom.util;

import altkom.model.Entry;
import altkom.model.Person;
import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import altkom.model.Phone;

public class PhonePostProcessor implements BeanPostProcessor {

    @Override
	public Object postProcessAfterInitialization( Object bean, String name )
			throws BeansException {
		System.out.println( "Przetwarzanie beana [name=" + name + "]" );
		
                if (bean instanceof Entry) {
                    Entry e = (Entry)bean;
                    System.out.println( "*********after entry " + e.getAddress());
                }
                
		Phone phone = extractPhone( bean );

		boolean thereIsPhoneField = ( phone != null );
		if ( thereIsPhoneField ) {
			prettyPrintPhone( phone );
		}

		return bean;
	}

	private Phone extractPhone( Object bean ) {
		Phone result = null;

		Class<?> beanClazz = bean.getClass();

		try {

			Field theField = beanClazz.getDeclaredField( "phone" );
			boolean fieldExists = ( theField != null 
				&& theField.getType().equals( Phone.class ) );
			if ( fieldExists ) {
				theField.setAccessible( true );
				result = (Phone) theField.get( bean );
			}

		} catch ( SecurityException e ) {

			throw new RuntimeException( "Blad krytyczny", e );

		} catch ( NoSuchFieldException e ) {
                        System.out.println("**********polecial wyjatek");
			// calkowicie swiadomie ignorujemy blad!!!

		} catch ( IllegalArgumentException e ) {

			throw new RuntimeException( "Blad krytyczny", e );

		} catch ( IllegalAccessException e ) {

			throw new RuntimeException( "Blad krytyczny", e );
		}

		return result;
	}

	private void prettyPrintPhone( Phone phone ) {

		String formattedPhone = phone.getCountryNumber() + " "
				+ phone.getAreaNumber() + " " + phone.getPhoneNumber();

		System.out.println( "*********formatted " + formattedPhone );
	}

    @Override
	public Object postProcessBeforeInitialization( Object bean, String name )
			throws BeansException {
            
                System.out.println( "*********zwracam " + bean );
                
                if (bean instanceof Entry) {
                    Entry e = (Entry)bean;
                    System.out.println( "*********before entry " + e.getAddress());
                }
                
		return bean;
	}
}
