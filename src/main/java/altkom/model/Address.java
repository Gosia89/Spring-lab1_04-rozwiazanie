package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

@Component("address")
public class Address{

	private Long id;
	
	private String street;
	
	private String number;
	
	private String city;
	
	private String postalCode;

	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
	public void setStreet( String street ) {
	
		this.street = street;
	}

	
	public void setNumber( String number ) {
	
		this.number = number;
	}

	
	public void setCity( String city ) {
	
		this.city = city;
	}

	
	public void setPostalCode( String postalCode ) {
	
		this.postalCode = postalCode;
	}

	
	public String getStreet() {
	
		return street;
	}

	
	public String getNumber() {
	
		return number;
	}

	
	public String getCity() {
	
		return city;
	}

	
	public String getPostalCode() {
	
		return postalCode;
	}

	public Long getId() {
	
		return id;
	}

	
	public void setId( Long id ) {
	
		this.id = id;
	}
	
}
