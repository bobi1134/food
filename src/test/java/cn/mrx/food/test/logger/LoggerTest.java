package cn.mrx.food.test.logger;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: LoggerTest
 * @Author: Mr.X
 * @Date: 2017/6/8 15:27
 * @Description:
 * @Version 1.0
 */
public class LoggerTest {

    Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test(){
        System.out.println("----------");
        logger.debug("xxxxxxxxxxxxxxxxxx");
        logger.info("------");
    }
}
