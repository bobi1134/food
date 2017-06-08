package cn.mrx.food.dao.impl;

import cn.mrx.food.dao.IBaseDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
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

    /**
     * 加载所有信息
     * @return
     */
    @Override
    public List<T> loadAll() {
        return getHibernateTemplate().loadAll(clazz);
    }

    /**
     * 指定查询前几条记录
     * @param num
     * @return
     */
    @Override
    public <T> List<T> selectLimit(Integer num) {
        return getHibernateTemplate().execute(new HibernateCallback<List<T>>() {
            @Override
            public List<T> doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery("from " + clazz.getSimpleName());
                query.setFirstResult(0);
                query.setMaxResults(num);
                return query.list();
            }
        });
    }

    /**
     * 保存实体
     * @param t
     * @return
     */
    @Override
    public Integer save(T t) {
        return (Integer) getHibernateTemplate().save(t);
    }
}
