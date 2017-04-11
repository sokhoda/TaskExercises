package domain;

import lombok.*;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {
    public String name;
    public int age;
    public boolean verified;
    public int[] marks;
}