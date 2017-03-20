package com.sprocomm.camera.open;

import com.sprocomm.common.PlatformSupportManager;

/**
 * Created by wujiabin on 2017/3/20.
 */

public final class OpenCameraManager extends PlatformSupportManager<OpenCameraInterface> {

    public OpenCameraManager() {
        super(OpenCameraInterface.class, new DefaultOpenCameraInterface());
        addImplementationClass(9, "com.google.zxing.client.android.camera.open.GingerbreadOpenCameraInterface");
    }
}
