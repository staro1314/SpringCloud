package spring.cloud.zipkin.trackzipkin.config;

import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Tags;
import org.springframework.boot.actuate.metrics.web.servlet.WebMvcTags;
import org.springframework.boot.actuate.metrics.web.servlet.WebMvcTagsProvider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: Staro
 * @date: 2020/5/13 16:05
 * @Description:
 */
public class MyTagsProvider implements WebMvcTagsProvider {
    /**
     * 去掉WebMvcTags.exception(exception)
     *
     * @param request   请求
     * @param response  响应
     * @param handler   处理
     * @param exception 异常
     * @return
     */
    @Override
    public Iterable<Tag> getTags(HttpServletRequest request, HttpServletResponse response, Object handler, Throwable exception) {
        return Tags.of(WebMvcTags.method(request), WebMvcTags.uri(request, response), WebMvcTags.status(response));
    }

    @Override
    public Iterable<Tag> getLongRequestTags(HttpServletRequest request, Object handler) {
        return Tags.of(WebMvcTags.method(request), WebMvcTags.uri(request, null));
    }
}
