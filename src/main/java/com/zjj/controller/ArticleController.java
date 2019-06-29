package com.zjj.controller;

import com.zjj.crawl.MyProcessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;

/**
 * @program: znsh
 * @description: 文章控制器
 * @author: zjj
 * @create: 2019-05-08 00:17:38
 **/
@Controller
public class ArticleController {

    @Autowired
    private MyProcessors myProcessors;

    @RequestMapping("/article")
    @ResponseBody
    public  String article() {
        Spider spider = new Spider(myProcessors);
        spider.addUrl("https://blog.csdn.net/zhinengxuexi/article/details/89150907","https://blog.csdn.net/valada/article/details/89382217?utm_source=feed1904261").addUrl("https://blog.csdn.net/themagickeyjianan/article/details/52386981").addPipeline(new ConsolePipeline()).addPipeline(new FilePipeline("D:/crawldata")).run();
        System.out.println("------------" + myProcessors.haha.toString());
        spider.close();
        return myProcessors.haha;
    }

}
