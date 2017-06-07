package cn.mrx.food.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: UserController
 * @Author: Mr.X
 * @Date: 2017/6/7 17:54
 * @Description:
 * @Version 1.0
 */
@Controller
@RequestMapping("/user/")
public class UserController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

}
