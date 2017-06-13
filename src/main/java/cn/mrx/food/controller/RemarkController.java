package cn.mrx.food.controller;

import cn.mrx.food.domain.Dish;
import cn.mrx.food.domain.Remark;
import cn.mrx.food.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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
     * 根据(菜品id=1|用户id=other)获取评论信息
     * @param idType
     * @param id
     * @return
     */
    @PostMapping("/selectRemarks/{idType}/{id}")
    @ResponseBody
    public Object selectRemarks(@PathVariable("idType") Integer idType, @PathVariable("id") Integer id){
        List<Remark> remarks = (List<Remark>)iRemarkService.selectRemarks(idType, id);
        if(idType==1){
            for(Remark remark : remarks){
                User t_user = iUserService.get(remark.getUserId());
                t_user.setPwd("******");
                remark.setUser(t_user);
            }
        }else{
            for(Remark remark : remarks){
                Dish t_dish = iDishService.get(remark.getDishId());
                remark.setDish(t_dish);
            }
        }
        return remarks;
    }

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
        remark.setUserId(userId);
        return iRemarkService.save(remark);
    }

}
