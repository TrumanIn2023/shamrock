package com.tencent.common.app;

import com.tencent.mobileqq.app.BusinessHandler;

import mqq.app.AppRuntime;

public abstract class AppInterface extends AppRuntime {
    public String getCurrentNickname() {
        return "";
    }

    public BusinessHandler getBusinessHandler(String className) {
        return null;
    }
}
