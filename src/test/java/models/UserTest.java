package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.User;

@Getter
@Setter
@AllArgsConstructor
public class UserTest {

    @Test
    public void testForUserInput() {
        User use = new User("","","","","","","","","","","","","");
        use.setFirstName("");
        use.setLastName("");
        use.setAge("");
        use.setState("");
        use.setTown("");
        use.setOccupation("");
        use.setFatherName("");
        use.setMotherName("");
        use.setDOB("");
        use.setGender("");
        use.setReligion("");
        use.setMaritalStatus("");
        use.setNationality("");
        Assertions.assertEquals("", use.getFirstName());
        Assertions.assertEquals("", use.getLastName());
        Assertions.assertEquals("", use.getAge());
        Assertions.assertEquals("", use.getState());
        Assertions.assertEquals("", use.getTown());
        Assertions.assertEquals("", use.getOccupation());
        Assertions.assertEquals("", use.getFatherName());
        Assertions.assertEquals("", use.getMotherName());
        Assertions.assertEquals("", use.getDOB());
        Assertions.assertEquals("", use.getGender());
        Assertions.assertEquals("", use.getReligion());
        Assertions.assertEquals("", use.getMaritalStatus());
        Assertions.assertEquals("", use.getNationality());
    }
}
