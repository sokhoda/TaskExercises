package misc.validation;

import lombok.NoArgsConstructor;
import misc.domain.Student;

import javax.validation.Configuration;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
public class ValidationServiceImpl {
    static Configuration configuration = Validation
            .byDefaultProvider()
            .configure();
    static private Validator validator = configuration.buildValidatorFactory().getValidator();

    public void calculateSomething(@NotNull Student student) {

        validator.validate(student);

        String firstName = student.getFirstName();
        System.out.println(firstName);
    }

}
