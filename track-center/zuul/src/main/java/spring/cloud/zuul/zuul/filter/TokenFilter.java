package spring.cloud.zuul.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Staro
 * @date: 2020/5/12 14:35
 * @Description:
 */
@Slf4j
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";  // 可以在请求被路由之前调用
    }

    @Override
    public int filterOrder() {
        return 0; // filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true; // 是否执行该过滤器，此处为true，说明需要过滤
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("--->>> TokenFilter{},{}",request.getMethod(), request.getRequestURI());
        String token = request.getParameter("token");
        if (StringUtils.isNotBlank(token)){
            ctx.setResponseStatusCode(200);
            ctx.setSendZuulResponse(true); //对请求进行路由
            ctx.set("isSuccess",true);
            return null;
        }else {
            ctx.setResponseStatusCode(400);
            ctx.setSendZuulResponse(false);//不对其进行路由
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess",false);
            return null;
        }
    }
}
