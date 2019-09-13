package cucumber.numberconverter;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import numberconverter.ConverterException;
import numberconverter.DecimalConverter;
import numberconverter.NumberConverterWrapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class IllegalNumberSteps {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private String illegalNumber = null;

	@When("^I convert it$")
	public void i_convert_it() throws Throwable {
	}

	@Given("^the number \"([^\"]*)\"$")
	public void the_number(String arg1) throws Throwable {
		illegalNumber = arg1;
	}

	@Given("^the number (-?\\d+)$")
	public void the_number(int arg1) throws Throwable {
		illegalNumber = String.valueOf(arg1);
	}

	@Then("^a failure is expected\\.$")
	public void a_failure_is_expected() throws Throwable {
		try {
			new NumberConverterWrapper(new DecimalConverter()).convert(illegalNumber);
		} catch (ConverterException e) {
			return;
		}
		Assert.fail("Expected a " + ConverterException.class.getName() + ", but was not thrown.");
	}
}
