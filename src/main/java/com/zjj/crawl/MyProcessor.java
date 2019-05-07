package com.zjj.crawl;

import com.zjj.model.Article;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.FilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * 2019年3月9日22:14:19
 */
@Component
public class MyProcessor implements PageProcessor {


    public Article article = new Article();

    @Override
    public void process(Page page) {
        //page.addTargetRequests(page.getHtml().links().all());
        page.addTargetRequests(page.getHtml().links().regex("https://blog.csdn.net/[a-z 0-9 -]+/article/details/[0-9]{8}").all());
        //System.out.println(page.getHtml().xpath("//*[@id=\"mainBox\"]/main/div[1]/div/div/div[1]/h1").toString());
        page.putField("title", page.getHtml().xpath("//*[@id=\"mainBox\"]/main/div[1]/div/div/div[1]/h1"));
        //page.putField("content", page.getHtml().xpath("//*[@id=\"article_content\"]"));
        page.putField("content", page.getHtml().xpath("//*[@id=\"mainBox\"]/main/div[1]"));
        if (page.getResultItems() != null) {
            article.setContent(page.getResultItems().get("content").toString());
            article.setTitle(page.getResultItems().get("title").toString());
        }


    }
    @Override
    public Site getSite() {
        return Site.me().setSleepTime(100).setRetryTimes(3);
    }

    public static void main(String[] args) {
        Spider.create(new MyProcessor()).addUrl("https://blog.csdn.net/").addPipeline(new ConsolePipeline()).addPipeline(new FilePipeline("D:/crawldata")).run();

    }
}


