package com.ovwvwvo.share.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;

import com.ovwvwvo.sharelibary.R;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.shareboard.ShareBoardConfig;

/**
 * Copyright ©2017 by rawer
 */

public class ShareUtil {

    public static void startThirdShare(Activity actvity, String title, String desc,
                                       String url, UMImage umImage) {
        UMWeb web = new UMWeb(url);
        web.setTitle(title);
        web.setThumb(umImage);
        web.setDescription(desc);
        new ShareAction(actvity)
            .withMedia(web)
            .setDisplayList(SHARE_MEDIA.SINA, SHARE_MEDIA.WEIXIN, SHARE_MEDIA.WEIXIN_CIRCLE,
                SHARE_MEDIA.QQ, SHARE_MEDIA.QZONE, SHARE_MEDIA.MORE)
            .setCallback(new ShareListener())
            .open(getShareBoardConfig());
    }

    private static ShareBoardConfig getShareBoardConfig() {
        ShareBoardConfig config = new ShareBoardConfig();
        config.setShareboardBackgroundColor(Color.WHITE)
            .setCancelButtonVisibility(false)
            .setIndicatorColor(Color.WHITE, Color.WHITE)
            .setTitleVisibility(false);
        return config;
    }

    public static void startShare(Context context, String msg) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.share_title)));
    }
}
