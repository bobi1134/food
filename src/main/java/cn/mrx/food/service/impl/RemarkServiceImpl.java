package cn.mrx.food.service.impl;

import cn.mrx.food.dao.IRemarkDao;
import cn.mrx.food.dao.impl.RemarkDaoImpl;
import cn.mrx.food.domain.Remark;
import cn.mrx.food.exception.FoodException;
import cn.mrx.food.service.IRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: RemarkServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/10 21:30
 * @Description:
 * @Version 1.0
 */
@Service
public class RemarkServiceImpl extends BaseServiceImpl<RemarkDaoImpl, Remark> implements IRemarkService {

    @Autowired
    private IRemarkDao iRemarkDao;

    /**
     * 根据(菜品id=1|用户id=other)获取评论信息
     * @param idType
     * @param id
     * @return
     */
    @Override
    public Object selectRemarks(Integer idType, Integer id) {
        try {
            return iRemarkDao.selectRemarks(idType, id);
        }catch (Exception e){
            throw new FoodException("根据(菜品id|用户id)获取评论信息时出现异常！");
        }
    }
}
