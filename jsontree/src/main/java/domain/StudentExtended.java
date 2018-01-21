package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
        propOrder = {"address", "name", "age", "verified", "marks"}
)
public class StudentExtended {
    @XmlElement(required = true)
    private String name;

    @XmlElement(required = true)
    private int age;

    @XmlElement(required = true)
    private Address address;

    @XmlElement(required = true)
    private boolean verified;

    @XmlElement(required = false)
    private int[] marks;
}