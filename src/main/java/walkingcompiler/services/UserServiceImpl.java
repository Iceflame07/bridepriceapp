package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.User;
import walkingcompiler.data.repositories.UserRepository;
import walkingcompiler.exceptions.*;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByFirstName(String firstName) {
        return Optional.ofNullable(userRepository.findByFirstName(firstName))
                .orElseThrow(() -> new UserNotFoundException("UNKNOWN USER"));
    }

    @Override
    public User findByLastName(String lastName) {
        return Optional.ofNullable(userRepository.findByLastName(lastName))
                .orElseThrow(() -> new UserNotFoundException("UNKNOWN USER"));
    }

    @Override
    public User findByAge(String Age) {
        return userRepository.findByAge(Age);
    }

    @Override
    public User findByState(String State) {
        return Optional.ofNullable(userRepository.findByState(State))
                .orElseThrow(() -> new StateNotFoundException("404! Not Found"));
    }

    @Override
    public User findByTown(String Town) {
        return Optional.ofNullable(userRepository.findByTown(Town))
                .orElseThrow(() -> new TownNotFoundException("This TOWN DOES NOT EXIST"));
    }

    @Override
    public User findByOccupation(String Occupation) {
        return userRepository.findByOccupation(Occupation);
    }

    @Override
    public User findByFatherName(String fatherName) {
        return Optional.ofNullable(userRepository.findByFatherName(fatherName))
                .orElseThrow(() -> new NameNotFoundException("FATHER NOT KNOWN, SEARCH FOR HIM!!!"));
    }

    @Override
    public User findByMotherName(String motherName) {
        return Optional.ofNullable(userRepository.findByMotherName(motherName))
                .orElseThrow(() -> new UserNotFoundException("MOTHER NOT KNOWN, SEARCH FOR HER!!!"));
    }

    @Override
    public User findByDOB(String DOB) {
        return userRepository.findByDOB(DOB);
    }

    @Override
    public User findByGender(String Gender) {
        return Optional.ofNullable(userRepository.findByGender(Gender))
                .orElseThrow(() -> new GenderNotFoundException("Gender NOT KNOWN, ARE YOU CONFUSED???"));
    }

    @Override
    public User findByReligion(String Religion) {
        return userRepository.findByReligion(Religion);
    }

    @Override
    public User findByMaritalStatus(String MaritalStatus) {
        return Optional.ofNullable(userRepository.findByMaritalStatus(MaritalStatus))
                .orElseThrow(() -> new MaritalStatusNotFoundException("ARE YOU SINGLE OR DOUBLE???"));
    }

    @Override
    public User findByNationality(String Nationality) {
        return Optional.ofNullable(userRepository.findByNationality(Nationality))
                .orElseThrow(() -> new NationalityNotFoundException("THIS COUNTRY DOES NOT EXIST!!!"));
    }
}
