package misc.domain;

import javax.validation.Valid;
import java.util.List;

public class StudentGroup {
    @Valid
    List<Student> students;
}
