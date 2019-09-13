package cucumber.numberconverter;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import numberconverter.BinaryConverter;
import numberconverter.DecimalConverter;
import numberconverter.HexadecimalConverter;
import numberconverter.NumberConverterWrapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DifferentConversionsSteps {

	private List<String> inputNumbers = new ArrayList<>();
	private NumberConverterWrapper converter = null;

	@Given("^a list of numbers$")
	public void a_list_of_numbers(List<String> numbers) throws Throwable {
		this.inputNumbers.addAll(numbers);
	}

	@When("^I convert it to a decimal$")
	public void i_convert_it_to_a_decimal() throws Throwable {
		converter = new NumberConverterWrapper(new DecimalConverter());
	}

	@When("^I convert it a binary$")
	public void i_convert_it_a_binary() throws Throwable {
		converter = new NumberConverterWrapper(new BinaryConverter());
	}

	@When("^I convert it a hexadecimal$")
	public void i_convert_it_a_hexadecimal() throws Throwable {
		converter = new NumberConverterWrapper(new HexadecimalConverter());
	}

	@Then("^the result is:$")
	public void the_result_is(List<String> result) throws Throwable {
		List<String> convertedNumbers = inputNumbers.stream() //
				.map(num -> converter.convert(num)) //
				.collect(toList());
		assertThat(convertedNumbers, is(result));
	}

}
