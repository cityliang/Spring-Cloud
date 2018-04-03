package com.city.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * <dl>
 * <dd>Description: 类描述 </dd>
 * <dd>Copyright: 版权归杭州京歌科技有限公司所有</dd>
 * <dd>Company: 杭州京歌科技有限公司</dd>
 * <dd>Package_name: com.city.sericefeign.service</dd>
 * <dd>Author: 梁城市 </dd>
 * <dd>Create_time:2018/4/3 14:45</dd>
 * </dl>
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
