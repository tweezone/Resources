/**
 * Project Name:dt55_spring2
 * File Name:AppDaoManager.java
 * Package Name:cn.java.dao.impl
 * Date:上午11:12:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.dao.impl;

/**
 * Description: <br/>
 * Date: 上午11:12:56 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class AppDaoManager {
    private Security security;

    private ClearResource cResource;

    private AppLog appLog;

    private AppDaoImpl daoImpl;

    public AppDaoManager(Security security, ClearResource cResource, AppLog appLog, AppDaoImpl daoImpl) {
        super();
        this.security = security;
        this.cResource = cResource;
        this.appLog = appLog;
        this.daoImpl = daoImpl;
    }

    public void moneyZhuan() {
        // 1、执行安全监测
        security.isSecurity();
        // 2、核心方法
        daoImpl.zhuanMoney();
        // 3、清空操作记录
        cResource.clean();
        // 4、日志
        appLog.log();
    }

    public void moneySelect() {
        // 1、执行安全监测
        security.isSecurity();
        // 2、核心方法
        daoImpl.selectMoney();// 切入点
        // 3、清空操作记录
        cResource.clean();
        // 4、日志
        appLog.log();
    }

    public void touzi() {
    }

}
