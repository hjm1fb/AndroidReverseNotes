package com.tencent.p177mm.p230g.p711c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p177mm.sdk.p603e.C4925c;

/* renamed from: com.tencent.mm.g.c.fy */
public abstract class C42120fy extends C4925c {
    private static final int dIp = "appIdHash".hashCode();
    public static final String[] diI = new String[0];
    private static final int diR = "rowid".hashCode();
    private static final int dkV = "appId".hashCode();
    private static final int eam = "openDebug".hashCode();
    private boolean dIj = true;
    private boolean dkE = true;
    private boolean eal = true;
    public String field_appId;
    public int field_appIdHash;
    public boolean field_openDebug;

    /* renamed from: d */
    public final void mo8995d(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (dIp == hashCode) {
                    this.field_appIdHash = cursor.getInt(i);
                    this.dIj = true;
                } else if (dkV == hashCode) {
                    this.field_appId = cursor.getString(i);
                } else if (eam == hashCode) {
                    this.field_openDebug = cursor.getInt(i) != 0;
                } else if (diR == hashCode) {
                    this.xDa = cursor.getLong(i);
                }
            }
        }
    }

    /* renamed from: Hl */
    public final ContentValues mo10098Hl() {
        ContentValues contentValues = new ContentValues();
        if (this.dIj) {
            contentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
        }
        if (this.dkE) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.eal) {
            contentValues.put("openDebug", Boolean.valueOf(this.field_openDebug));
        }
        if (this.xDa > 0) {
            contentValues.put("rowid", Long.valueOf(this.xDa));
        }
        return contentValues;
    }
}
