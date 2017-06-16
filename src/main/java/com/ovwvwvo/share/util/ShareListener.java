package com.ovwvwvo.share.util;

import android.util.Log;

import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

/**
 * Copyright ©2017 by rawer
 */

public class ShareListener implements UMShareListener {

    @Override
    public void onStart(SHARE_MEDIA share_media) {
    }

    @Override
    public void onResult(SHARE_MEDIA platform) {
    }

    @Override
    public void onError(SHARE_MEDIA platform, Throwable t) {
        Log.e("throw", "throw:" + t.getMessage());
    }

    @Override
    public void onCancel(SHARE_MEDIA platform) {
    }
}
