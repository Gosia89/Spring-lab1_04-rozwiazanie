package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Phone {

	private Long id;
	
	private PhoneType type = PhoneType.MOBILE;
	
	private String countryNumber;
	
	private String areaNumber;
	
	private String phoneNumber;
		
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
	public PhoneType getType() {
		
		return type;
	}
	
	public String getCountryNumber() {
	
		return countryNumber;
	}
	
	public String getAreaNumber() {
	
		return areaNumber;
	}
	
	public String getPhoneNumber() {
	
		return phoneNumber;
	}

	public void setType( PhoneType phoneType ) {
	
		this.type = phoneType;
	}
	
	public void setCountryNumber( String countryNumber ) {
	
		this.countryNumber = countryNumber;
	}
	
	public void setAreaNumber( String areaNumber ) {
	
		this.areaNumber = areaNumber;
	}
	
	public void setPhoneNumber( String phoneNumber ) {
	
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
	
		return id;
	}
	
	public void setId( Long id ) {
	
		this.id = id;
	}
	
}
