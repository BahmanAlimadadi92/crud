package ir.mapsa.bankcrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({NotFoundException.class})
    protected ResponseEntity<Object> handlerNotFoundException(NotFoundException notFoundException){

        ApiEr apiEr=new ApiEr(notFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return buildResponseEntity(apiEr);

    }
    private ResponseEntity<Object> buildResponseEntity(ApiEr apiEr){

        return new ResponseEntity<>(apiEr,apiEr.getHttpStatus());
    }


}
