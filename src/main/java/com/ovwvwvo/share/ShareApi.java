package com.ovwvwvo.share;

import android.content.Context;

import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Copyright ©2017 by rawer
 */

public class ShareApi {

    public static void init(Context context) {
        UMShareAPI.get(context);
        Config.isJumptoAppStore = true;
    }

    public static void setQQConfig(ShareConfig config) {
        PlatformConfig.setQQZone(config.key, config.value);
    }

    public static void setWeixin(ShareConfig config) {
        PlatformConfig.setWeixin(config.key, config.value);
    }

    public static void setSinaWeibo(ShareConfig config) {
        PlatformConfig.setSinaWeibo(config.key, config.value, "www.ovwvwvo.com");
    }

    public static class ShareConfig {
        public ShareConfig(String key, String value) {
            this.key = key;
            this.value = value;
        }

        String key, value;
    }
}
