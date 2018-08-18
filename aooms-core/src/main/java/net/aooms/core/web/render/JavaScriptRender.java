package net.aooms.core.web.render;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * js渲染
 * Created by cccyb on 2018-04-20
 */
public class JavaScriptRender extends AbstractRender {

    public JavaScriptRender() {
        this.renderType = RenderType.JAVASCRIPT;
    }

    @Override
    public void render(HttpServletResponse response, Object value) throws Exception {
        response.setContentType(renderType.getContentType());
        //response.getWriter().write(String.valueOf(value));
        //this.flushAndClose(response);
        this.springMvcRender(value);
    }
}