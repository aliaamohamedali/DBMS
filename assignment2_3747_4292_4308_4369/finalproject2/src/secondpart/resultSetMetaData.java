package secondpart;

public interface resultSetMetaData {

	public int getColumnCount();
	
	public String getColumnLabel(int column);
	
	public String getTableName();
	
	public String getColumnName(int column);
	
}
