package cn.mrx.food.dao.impl;

import cn.mrx.food.dao.IBaseDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @ClassName: BaseDaoImpl
 * @Author: Mr.X
 * @Date: 2017/6/6 20:35
 * @Description:
 * @Version 1.0
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {

    private Class<T> clazz;

    public BaseDaoImpl() {
        Class c = this.getClass();
        Type type = c.getGenericSuperclass();
        ParameterizedType pType = (ParameterizedType) type;
        Type[] actualTypeArguments = pType.getActualTypeArguments();
        clazz = (Class<T>) (actualTypeArguments[0]);
    }

    @Override
    public List<T> loadAll() {
        return getHibernateTemplate().loadAll(clazz);
    }

    @Override
    public Integer save(T t) {
        return (Integer) getHibernateTemplate().save(t);
    }
}
