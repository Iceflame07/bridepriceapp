package walkingcompiler.data.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@Data
public class User {

    @Id
    private String firstName;
    private String lastName;
    private String Age;
    private String State;
    private String Town;
    private String Occupation;
    private String fatherName;
    private String motherName;
    private String DOB;
    private String Gender;
    private String Religion;
    private String MaritalStatus;
    private String Nationality;
}
