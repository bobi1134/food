package cn.mrx.food.service;

import cn.mrx.food.domain.Remark;

/**
 * @ClassName: IRemarkService
 * @Author: Mr.X
 * @Date: 2017/6/10 21:29
 * @Description:
 * @Version 1.0
 */
public interface IRemarkService extends IBaseService<Remark> {

    /**
     * 根据(菜品id=1|用户id=other)获取评论信息
     * @param idType
     * @param id
     * @return
     */
    public Object selectRemarks(Integer idType, Integer id);
}
