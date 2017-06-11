package cn.mrx.food.controller;

import cn.mrx.food.domain.Remark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: RemarkController
 * @Author: Mr.X
 * @Date: 2017/6/11 20:35
 * @Description:
 * @Version 1.0
 */
@Controller
@RequestMapping("/remark/")
public class RemarkController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 添加评论
     * @param dishId
     * @param remarkContent
     * @param userId
     * @return
     */
    @PostMapping("/save")
    @ResponseBody
    public Object save(Integer dishId, String remarkContent, Integer userId){
        Remark remark = new Remark();
        remark.setDishId(dishId);
        remark.setRemarkContent(remarkContent);
        remark.setUser(iUserService.get(userId));
        return iRemarkService.save(remark);
    }

}
