package altkom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import altkom.model.Entry;
import altkom.model.repository.PhoneBookRepository;

public class Lab4 {
	public static void main( String args[] ) {
            
                System.out.println("START-0");
		ApplicationContext factory = new ClassPathXmlApplicationContext("context.xml");
                System.out.println("START-1");
		PhoneBookRepository repository1 = (PhoneBookRepository) factory.getBean("repository1");
		System.out.println("*************** Repository1 ***************");
		for(Entry entry : repository1.findAllEntries()){
			System.out.println(entry.toString());
		}
		System.out.println("START-2");
		PhoneBookRepository repository2 = (PhoneBookRepository) factory.getBean("repository2");
		System.out.println("*************** Repository2 ***************");
		for(Entry entry : repository2.findAllEntries()){
			System.out.println(entry.toString());
		}
		System.out.println("START-3");
	}
}
