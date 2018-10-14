package eg.edu.alexu.csd.oop.db;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class xmlValidator {
	private String Xmlpath;
	private String Xsdpath;
	public xmlValidator(String Xmlpath, String Xsdpath){
		this.Xmlpath=Xmlpath;
		this.Xsdpath=Xsdpath;
	}
	public boolean validate(){
		try {
			SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema=factory.newSchema(new File(Xsdpath));
			Validator validator=(Validator) schema.newValidator();
			validator.validate(new StreamSource(new File(Xmlpath)));
			
		} 
		catch (SAXException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
}
