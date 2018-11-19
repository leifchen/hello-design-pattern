package com.chen.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 视频审批人
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class VideoAbstractApprover extends AbstractApprover {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (abstractApprover != null) {
                abstractApprover.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频，不批准");
            return;
        }
    }
}
