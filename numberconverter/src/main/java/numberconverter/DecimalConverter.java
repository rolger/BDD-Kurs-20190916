package numberconverter;

public class DecimalConverter implements NumberConverter {

	@Override
	public String convert(Integer integer) {
		return Integer.toString(integer);
	}

}
