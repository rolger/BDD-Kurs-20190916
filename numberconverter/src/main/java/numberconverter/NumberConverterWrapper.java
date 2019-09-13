package numberconverter;

public class NumberConverterWrapper {

	private static final Integer MAXIMUM_VALUE = 500000000;
	private NumberConverter converter;

	public NumberConverterWrapper(NumberConverter converter) {
		super();
		this.converter = converter;
	}

	public String convert(String aNumber) {
		return convert(parseNumber(aNumber));
	}

	private Integer parseNumber(String aNumber) {
		Integer parsedValue = null;
		try {
			parsedValue = Integer.valueOf(aNumber);
		} catch (NumberFormatException e) {
			throw new ConverterException(e.getMessage());
		}

		if (parsedValue < 0) {
			throw new ConverterException("Negative numbers are not allowed");
		}

		if (parsedValue >= MAXIMUM_VALUE) {
			throw new ConverterException("Number bigger then " + MAXIMUM_VALUE + " is not allowed.");
		}

		return parsedValue;
	}

	private String convert(Integer number) {
		return converter.convert(number);
	}

}
