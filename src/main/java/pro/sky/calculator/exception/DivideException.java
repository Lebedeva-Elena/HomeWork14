package pro.sky.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivideException extends IllegalArgumentException {
    public DivideException(String s) {
        super(s);
    }
}
