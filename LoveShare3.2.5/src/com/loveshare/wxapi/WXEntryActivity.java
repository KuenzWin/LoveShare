/*
 * �?�??��??:http://www.ShareSDK.cn
 * ????????QQ: 4006852216
 * �??�微�?:ShareSDK   �?�?????�??��??????�?�???�?�?�?�?�??��?��??�?�?信�??????��?��??容�?��??�??��??�???使�?��?�?�???任�???�?�?�???以�??�?�?信�???�???�???系�???�?�?�???24�??��??�?�???�?�?
 *
 * Copyright (c) 2013�? ShareSDK.cn. All rights reserved.
 */

package com.loveshare.wxapi;

import android.content.Intent;
import android.widget.Toast;
import cn.sharesdk.wechat.utils.WXAppExtendObject;
import cn.sharesdk.wechat.utils.WXMediaMessage;
import cn.sharesdk.wechat.utils.WechatHandlerActivity;

/** �?信�?��?��????�?activity示�? */
public class WXEntryActivity extends WechatHandlerActivity {

	/**
	 * �???�?信�???��????�?�??��??��?��?app message
	 * <p>
	 * ?�微信�?��?��??�?????天页?��????添�??工�?��??�???以�???�??��???��??添�???��?�中
	 * 此�???��?��?��??�?�??��??代�??�?�??��???Demo�?�???????�???己�??已�?�?�???
	 * ???��?��???�???�??????��??�???�?任�?页�??
	 */
	public void onGetMessageFromWXReq(WXMediaMessage msg) {
		Intent iLaunchMyself = getPackageManager().getLaunchIntentForPackage(getPackageName());
		startActivity(iLaunchMyself);
	}

	/**
	 * �???�?信�??�?�??��??��??起�??�???
	 * <p>
	 * 此�??��?��?��?��?�?信�????�??��??�???�?�??��?��??demo??wechatpage???��??�?
	 * �??��?��??以�???�?�??��??件�?????�?�?段�??��????�?�?信�?????��???��??�?�?
	 * 客�?��??�???�?�?�??��?�?�?�?�?信�?????????��?��?��???��?????demo�?�?�?�?
	 * ??�???
	 * <p>
	 * ??Demo????�?信�??�?示�?��?��?�?�??????��?��???�???�???�?�?�?????Toast
	 */
	public void onShowMessageFromWXReq(WXMediaMessage msg) {
		if (msg != null && msg.mediaObject != null
				&& (msg.mediaObject instanceof WXAppExtendObject)) {
			WXAppExtendObject obj = (WXAppExtendObject) msg.mediaObject;
			Toast.makeText(this, obj.extInfo, Toast.LENGTH_SHORT).show();
		}
	}

}