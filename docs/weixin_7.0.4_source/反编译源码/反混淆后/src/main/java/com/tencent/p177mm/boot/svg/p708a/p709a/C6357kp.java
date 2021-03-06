package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.kp */
public final class C6357kp extends C5163c {
    private final int height = 96;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-15028967);
                Path l = C5163c.m7884l(looper);
                l.moveTo(48.0f, 80.0f);
                l.cubicTo(65.67311f, 80.0f, 80.0f, 65.67311f, 80.0f, 48.0f);
                l.cubicTo(80.0f, 30.326887f, 65.67311f, 16.0f, 48.0f, 16.0f);
                l.cubicTo(30.326887f, 16.0f, 16.0f, 30.326887f, 16.0f, 48.0f);
                l.cubicTo(16.0f, 65.67311f, 30.326887f, 80.0f, 48.0f, 80.0f);
                l.close();
                l.moveTo(48.0f, 88.0f);
                l.cubicTo(25.90861f, 88.0f, 8.0f, 70.09139f, 8.0f, 48.0f);
                l.cubicTo(8.0f, 25.90861f, 25.90861f, 8.0f, 48.0f, 8.0f);
                l.cubicTo(70.09139f, 8.0f, 88.0f, 25.90861f, 88.0f, 48.0f);
                l.cubicTo(88.0f, 70.09139f, 70.09139f, 88.0f, 48.0f, 88.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-15028967);
                l = C5163c.m7884l(looper);
                l.moveTo(48.0f, 65.0f);
                l.cubicTo(57.38884f, 65.0f, 65.0f, 57.38884f, 65.0f, 48.0f);
                l.cubicTo(65.0f, 38.61116f, 57.38884f, 31.0f, 48.0f, 31.0f);
                l.cubicTo(38.61116f, 31.0f, 31.0f, 38.61116f, 31.0f, 48.0f);
                l.cubicTo(31.0f, 57.38884f, 38.61116f, 65.0f, 48.0f, 65.0f);
                l.close();
                l.moveTo(48.0f, 73.0f);
                l.cubicTo(34.192883f, 73.0f, 23.0f, 61.807117f, 23.0f, 48.0f);
                l.cubicTo(23.0f, 34.192883f, 34.192883f, 23.0f, 48.0f, 23.0f);
                l.cubicTo(61.807117f, 23.0f, 73.0f, 34.192883f, 73.0f, 48.0f);
                l.cubicTo(73.0f, 61.807117f, 61.807117f, 73.0f, 48.0f, 73.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, k);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
