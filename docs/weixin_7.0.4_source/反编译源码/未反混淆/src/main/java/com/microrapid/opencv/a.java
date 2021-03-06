package com.microrapid.opencv;

import android.graphics.Bitmap;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;
import java.util.Map;

public final class a extends BaseFilter {
    float alpha = 1.0f;
    int bCo = 0;
    int bCp = 0;
    int bCq = 0;
    Bitmap bCr = null;
    int color = 0;
    int paramTEXTRUEID = 0;
    int radius = 0;
    int type = 0;
    int width = 0;

    public a() {
        super(GLSLRender.bJB);
    }

    public final void setParameterDic(Map<String, Object> map) {
        AppMethodBeat.i(86260);
        if (map.containsKey("pstbitmap")) {
            this.bCr = (Bitmap) map.get("pstbitmap");
        }
        if (map.containsKey("effectIndex")) {
            this.type = ((Integer) map.get("effectIndex")).intValue();
        }
        if (map.containsKey("color")) {
            this.color = ((Integer) map.get("color")).intValue();
        }
        if (map.containsKey("radius")) {
            this.radius = ((Integer) map.get("radius")).intValue();
        }
        if (map.containsKey("width")) {
            this.width = ((Integer) map.get("width")).intValue();
        }
        if (map.containsKey("alpha")) {
            this.alpha = ((Float) map.get("alpha")).floatValue();
        }
        if (map.containsKey("xOffset")) {
            this.bCo = ((Integer) map.get("xOffset")).intValue();
        }
        if (map.containsKey("yOffset")) {
            this.bCp = ((Integer) map.get("yOffset")).intValue();
        }
        if (map.containsKey("grayVal")) {
            this.bCq = ((Integer) map.get("grayVal")).intValue();
        }
        AppMethodBeat.o(86260);
    }

    public final void ClearGLSL() {
        AppMethodBeat.i(86261);
        if (this.bCr != null) {
            this.bCr.recycle();
            this.bCr = null;
        }
        g.Sk(this.paramTEXTRUEID);
        super.ClearGLSL();
        AppMethodBeat.o(86261);
    }

    public final void ApplyGLSLFilter(boolean z, float f, float f2) {
        AppMethodBeat.i(86262);
        this.paramTEXTRUEID = g.dSO();
        super.ApplyGLSLFilter(z, f, f2);
        AppMethodBeat.o(86262);
    }

    public final void beforeRender(int i, int i2, int i3) {
        AppMethodBeat.i(86263);
        Bitmap aK = g.aK(i, i2, i3);
        if (aK == null) {
            AppMethodBeat.o(86263);
            return;
        }
        QImage BindBitmap = QImage.BindBitmap(aK);
        switch (this.type) {
            case 0:
                OpencvAlgorithm.nativeGlowFilterGlow(BindBitmap, this.color, this.radius, this.alpha);
                break;
            case 1:
                OpencvAlgorithm.nativeGlowFilterPolyFit(BindBitmap, this.bCr, this.width, this.alpha);
                break;
            case 2:
                OpencvAlgorithm.nativeGlowFilterDropShadow(BindBitmap, this.bCo, this.bCp, this.bCq, this.alpha);
                break;
        }
        GLSLRender.nativeTextImage(BindBitmap, this.paramTEXTRUEID);
        BindBitmap.UnBindBitmap(aK);
        BindBitmap.Dispose();
        AppMethodBeat.o(86263);
    }

    public final boolean renderTexture(int i, int i2, int i3) {
        AppMethodBeat.i(86264);
        boolean renderTexture = super.renderTexture(this.paramTEXTRUEID, i2, i3);
        AppMethodBeat.o(86264);
        return renderTexture;
    }
}
