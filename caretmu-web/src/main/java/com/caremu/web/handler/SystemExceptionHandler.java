package com.caremu.web.handler;

import com.caremu.domain.exception.BusinessException;
import com.caremu.domain.exception.ParameterException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by darchrow on 2016/1/24.
 */
public class SystemExceptionHandler implements HandlerExceptionResolver {

    /**
     * 异常信息解析
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("e", ex);
        // 根据不同错误转向不同页面
        ModelAndView mv = new ModelAndView();
        mv.addObject("errMsg", model);
        if(ex instanceof BusinessException) {
            mv.setViewName("error");
        }else if(ex instanceof ParameterException) {
            mv.setViewName("error");
        } else {
            mv.setViewName("error");
        }
        return mv;
    }
}
