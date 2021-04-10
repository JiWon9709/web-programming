package org.zerock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@Log4j
public class CommonExceptionAdvice {
	
	@ExceptionHandler(Exception.class) // 모든 예외 처리
	public String except(Exception ex, Model model)
	{
		log.error("Exception....." + ex.getMessage());
		
		model.addAttribute("exception", ex); // 키와 밸류로 전달
		log.error(model);
		return "error_page"; // 뷰 이름 = error_page.jsp
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handle404(NoHandlerFoundException ex)
	{
		return "custom404";
	}
}
