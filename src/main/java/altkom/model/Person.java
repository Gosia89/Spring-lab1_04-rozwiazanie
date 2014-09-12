package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Person{

	private Long id;
	
	private String name;

	private String surname;
	
	public Person() {
		super();
	}

	public Person(Long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
	public String getName() {

		return name;
	}

	public String getSurname() {

		return surname;
	}

	public void setName( String name ) {

		this.name = name;
	}

	public void setSurname( String surname ) {

		this.surname = surname;
	}

	public Long getId() {
	
		return id;
	}
	
	public void setId( Long id ) {
	
		this.id = id;
	}

}
