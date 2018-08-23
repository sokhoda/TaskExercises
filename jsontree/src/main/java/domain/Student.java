package domain;

import lombok.*;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Student",
        propOrder = {"name", "age", "verified", "marks"}
)
public class Student {
    @XmlElement(required = true)
    public String name;

    @XmlElement(required = true)
    public int age;

    @XmlElement(required = true)
    public boolean verified;

    @XmlElement(required = false)
    public int[] marks;
}