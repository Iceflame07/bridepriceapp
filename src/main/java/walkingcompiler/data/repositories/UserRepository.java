package walkingcompiler.data.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByAge(String Age);
    User findByState(String State);
    User findByTown(String Town);
    User findByOccupation(String Occupation);
    User findByFatherName(String fatherName);
    User findByMotherName(String motherName);
    User findByDOB(String DOB);
    User findByGender(String Gender);
    User findByReligion(String Religion);
    User findByMaritalStatus(String MaritalStatus);
    User findByNationality(String Nationality);
}
