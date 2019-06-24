package com.github.ixiongdi.di.common;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class BaseController<B, S extends IService<B>> {

    @Resource
    public S service;

    private Map<String, Object> introspect(Object obj) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        BeanInfo info = Introspector.getBeanInfo(obj.getClass());
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            Method reader = pd.getReadMethod();
            if (reader != null) {
                result.put(pd.getName(), reader.invoke(obj));
            }
        }
        return result;
    }

    /**
     * 查询数据列表
     * @param bean
     * @param page
     * @return
     */
    @RequestMapping(path = "", method = RequestMethod.GET)
    public Response index(B bean, IPage<B> page) {
        Response response = new Response();
        try {
            if (bean == null && page == null) {
                response.setData(service.list());
                response.setCode(1);
                response.setMessage("无查询无分页！");
            }

            if (bean != null && page == null) {
                response.setData(service.listByMap(introspect(bean)));
                response.setCode(1);
                response.setMessage("有查询无分页！");
            }

            if (bean == null && page != null) {
                response.setData(service.page(page));
                response.setCode(1);
                response.setMessage("无查询有分页！");
            }

            if (bean != null && page != null) {
                response.setData(service.pageMaps(page, new QueryWrapper<B>(bean)));
                response.setCode(1);
                response.setMessage("无查询有分页！");
            }
        } catch (Exception e) {
            response.setMessage(e.getMessage());
        }
        return response;
    }

    /**
     * 获取单个数据
     * @param id
     * @return
     */
    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Response read(@PathVariable("id") Long id) {
        Response response = new Response();

        response.setData(service.getById(id));
        response.setCode(1);
        response.setMessage("获取成功！");

        return response;
    }

    /**
     * 创建数据
     * @param entity
     * @return
     */
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Response create(B entity) {
        Response response = new Response();

        response.setData(service.save(entity));
        response.setCode(1);
        response.setMessage("创建成功！");

        return response;
    }

    /**
     * 替换数据
     * @param id
     * @param entity
     * @return
     */
    @RequestMapping(path = "{id}", method = RequestMethod.PUT)
    public Response replace(@PathVariable("id") Long id, B entity) {
        Response response = new Response();

        response.setData(service.updateById(entity));
        response.setCode(1);
        response.setMessage("替换成功！");

        return response;
    }

    /**
     * 更新数据
     * @param id
     * @param entity
     * @return
     */
    @RequestMapping(path = "{id}", method = RequestMethod.PATCH)
    public Response update(@PathVariable("id") Long id, B entity) {
        Response response = new Response();

        response.setData(service.updateById(entity));
        response.setCode(1);
        response.setMessage("更新成功！");

        return response;
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
    public Response delete(@PathVariable("id") Long id) {
        Response response = new Response();

        response.setData(service.removeById(id));
        response.setCode(1);
        response.setMessage("删除成功！");

        return response;
    }
}
