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

    @PostMapping("/FirstName")
    public ResponseEntity<User> FirstName(@RequestBody UserDTO userDTO) {
        User create = userService.findByFirstName(userDTO.getFirstName());
        return new ResponseEntity<>(UserMapper.mapToUser(userDTO), HttpStatus.CREATED);
    }

    @PostMapping("/LastName")
    public ResponseEntity<User> LastName(@RequestBody UserDTO userDTO) {
        User create = userService.findByLastName(userDTO.getLastName());
        return new ResponseEntity<>(UserMapper.mapToUser(userDTO), HttpStatus.CREATED);
    }
}
