package cn.mrx.food.service.impl;

import cn.mrx.food.dao.impl.RemarkDaoImpl;
import cn.mrx.food.domain.Remark;
import cn.mrx.food.service.IRemarkService;
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
}
