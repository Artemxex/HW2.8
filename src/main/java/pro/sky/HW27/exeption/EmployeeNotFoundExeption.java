package pro.sky.HW27.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)

public class EmployeeNotFoundExeption extends RuntimeException {
}