package secondpart;

public interface resultSet {

	public int findColumn (String columnLabel);
	
	public void first();
	
	public void last();
	
	public boolean next();
	
	public boolean previous();
	
	public int getInt(String columnLabel);
	
	public int getInt(int columnIndex);

	public String getString(String columnLabel); 
	
	public void getMetaData();
	
	public String getString(int columnIndex);
	
	
	
	
	
}
