package domain;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AcademicBatch implements Serializable{
    private int year;
    private int no;
    private List<Student> students;
}
