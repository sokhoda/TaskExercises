package misc.validation;

import misc.domain.Student;

import javax.validation.Validation;
import javax.validation.Validator;

public class ValidRunner {
    static private ValidationServiceImpl validationService = new ValidationServiceImpl();



    public static void main(String[] args) {

        Student student = new Student();
        validationService.calculateSomething(student);

    }
}
