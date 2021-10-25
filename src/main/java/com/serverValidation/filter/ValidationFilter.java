package com.serverValidation.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class ValidationFilter implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String password = request.getParameter("password");
		String cPassword = request.getParameter("confirmPassword");
		String box = request.getParameter("isChecked");
		HttpSession session = request.getSession();
		if (!(password.equals(cPassword))) {
			System.out.println("I am in Filter");

			session.setAttribute("msg", "Your both password is different");
			response.sendRedirect("/");

			return false;
		} else if (box == null) {
			session.setAttribute("msg", "please check box");
			response.sendRedirect("/");
			return false;

		}
		return true;

	}

}
