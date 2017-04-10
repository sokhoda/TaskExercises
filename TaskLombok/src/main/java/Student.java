import lombok.*;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class Student {
    String name;
    int age;
    boolean verified;
    int[] marks;
}