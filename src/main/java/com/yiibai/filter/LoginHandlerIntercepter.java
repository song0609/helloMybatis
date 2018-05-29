package com.yiibai.filter;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
  
import org.springframework.web.servlet.HandlerInterceptor;  
import org.springframework.web.servlet.ModelAndView;  
  
/** 
 * 登陆拦截器 
 * 场景：用户点击查看的时候，我们进行登陆拦截器操作，判断用户是否登陆？ 
 * 登陆，则不拦截，没登陆，则转到登陆界面； 
 */  
public class LoginHandlerIntercepter implements HandlerInterceptor {  
      
    @Override  
    public void afterCompletion(HttpServletRequest request,  
            HttpServletResponse response, Object arg2, Exception arg3)  
            throws Exception {  
    }  
  
    @Override  
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,  
            Object arg2, ModelAndView arg3) throws Exception {  
  
    }  
    @Override  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,  
            Object arg0) throws Exception {  
         String requestURI = request.getRequestURI();
         if(!requestURI.startsWith("/hello/admin") && !requestURI.startsWith("/hello/api")){  
             HttpSession session = request.getSession();  
             String username = (String) session.getAttribute("username");  
             if(username!=null){  
                 //登陆成功的用户  
                 return true;  
             }else{  
                //没有登陆，转向登陆界面  
                 //request.getRequestDispatcher("/admin/loginView").forward(request,arg1);  
            	 response.sendRedirect("/hello/admin/loginView");
               return false;  
             }  
         }else{  
             return true;  
         } 
    }  
  
}  
