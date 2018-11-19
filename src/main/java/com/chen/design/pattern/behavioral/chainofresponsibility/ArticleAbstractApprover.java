package com.chen.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 手记审批人
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class ArticleAbstractApprover extends AbstractApprover {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if (abstractApprover != null) {
                abstractApprover.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记，不批准，流程");
            return;
        }
    }
}
