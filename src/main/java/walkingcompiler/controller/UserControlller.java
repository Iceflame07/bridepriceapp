package walkingcompiler.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.User;
import walkingcompiler.dto.UserDTO;
import walkingcompiler.services.UserService;
import walkingcompiler.utils.UserMapper;

@RestController("/api")
@RequiredArgsConstructor
public class UserControlller {

    private final UserService userService;

    @PostMapping("/firstName")
    public ResponseEntity<UserDTO> firstName(@RequestBody UserDTO h) {
        User first = userService.findByFirstName(h.getFirstName());
        if (first == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(UserMapper.mapToUser(first), HttpStatus.CREATED);
        }
    }

    @PostMapping("/lastName")
    public ResponseEntity<User> getUserByLastName(@RequestBody UserDTO request) {
        User user = userService.findByLastName(request.getLastName());
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(UserMapper.mapToUserDTO(user), HttpStatus.OK);
        }
    }

    @PostMapping("/age")
    public ResponseEntity<UserDTO> Age(@RequestBody User number) {
        User user = userService.findByAge(number.getAge());
        return new ResponseEntity<>(UserMapper.mapToUser(user), HttpStatus.OK);
    }

    @PostMapping("/state")
    public ResponseEntity<UserDTO> getUserByState(@RequestBody UserDTO request) {
        User user = userService.findByState(request.getState());
        if (user == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(request);
        }
    }


}