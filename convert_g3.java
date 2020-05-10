package convert;
public class convert_g3
{
	
	public int Str2Int(String a)
	{
		return Integer.parseInt(a);
	}
	public int Float2Int(float f)
	{
		Float m=new Float (f);
		return m.intValue();
	}
	public int Char2Int(char c)
	{
		return Character.getNumericValue(c);
	}
}

	