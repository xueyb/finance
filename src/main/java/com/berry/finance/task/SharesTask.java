package com.berry.finance.task;

import com.berry.finance.utils.HttpClientUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SharesTask extends QuartzJobBean {

    private static final String sinaUrl = "http://hq.sinajs.cn/list";

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        String res = HttpClientUtils.get(sinaUrl);

    }

    public static void main(String[] args) {
        String res = HttpClientUtils.get(sinaUrl + "=sz002280");
        System.out.println(res);
    }
}
