package walkingcompiler.utils;
import lombok.experimental.UtilityClass;
import walkingcompiler.data.models.User;
import walkingcompiler.dto.UserDTO;

@UtilityClass
public class UserMapper {

    public static User mapToUserDTO(User user) {
        return new User(
                user.getFirstName(),
                user.getLastName(),
                user.getAge(),
                user.getState(),
                user.getTown(),
                user.getOccupation(),
                user.getFatherName(),
                user.getMotherName(),
                user.getDOB(),
                user.getGender(),
                user.getReligion(),
                user.getMaritalStatus(),
                user.getNationality()
        );
    }

    public static UserDTO mapToUser(User userDto) {
        return new UserDTO(
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getAge(),
                userDto.getState(),
                userDto.getTown(),
                userDto.getOccupation(),
                userDto.getFatherName(),
                userDto.getMotherName(),
                userDto.getDOB(),
                userDto.getGender(),
                userDto.getReligion(),
                userDto.getMaritalStatus(),
                userDto.getNationality()
        );
    }
}
