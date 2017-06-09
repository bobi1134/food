package cn.mrx.food.service.impl;

import cn.mrx.food.dao.IUniversityDao;
import cn.mrx.food.dao.impl.UniversityDaoImpl;
import cn.mrx.food.domain.University;
import cn.mrx.food.exception.FoodException;
import cn.mrx.food.service.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UniversityServiceImpl
 * @Author: Mr.X
 * @Date: 2017/6/6 22:47
 * @Description:
 * @Version 1.0
 */
@Service
public class UniversityServiceImpl extends BaseServiceImpl<UniversityDaoImpl, University> implements IUniversityService {

}
