package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.csj */
public final class csj extends C1331a {
    public String xpI;
    public C30205nb xpJ;
    public boolean xpK;
    public String xpL;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56999);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.xpI != null) {
                c6093a.mo13475e(1, this.xpI);
            }
            if (this.xpJ != null) {
                c6093a.mo13479iy(2, this.xpJ.computeSize());
                this.xpJ.writeFields(c6093a);
            }
            c6093a.mo13471aO(3, this.xpK);
            if (this.xpL != null) {
                c6093a.mo13475e(4, this.xpL);
            }
            AppMethodBeat.m2505o(56999);
            return 0;
        } else if (i == 1) {
            if (this.xpI != null) {
                f = C6091a.m9575f(1, this.xpI) + 0;
            } else {
                f = 0;
            }
            if (this.xpJ != null) {
                f += C6087a.m9557ix(2, this.xpJ.computeSize());
            }
            f += C6091a.m9576fv(3) + 1;
            if (this.xpL != null) {
                f += C6091a.m9575f(4, this.xpL);
            }
            AppMethodBeat.m2505o(56999);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(56999);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            csj csj = (csj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    csj.xpI = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56999);
                    return 0;
                case 2:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C30205nb c30205nb = new C30205nb();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c30205nb.populateBuilderWithField(c6086a3, c30205nb, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        csj.xpJ = c30205nb;
                    }
                    AppMethodBeat.m2505o(56999);
                    return 0;
                case 3:
                    csj.xpK = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(56999);
                    return 0;
                case 4:
                    csj.xpL = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56999);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56999);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56999);
            return -1;
        }
    }
}
