package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class ahj extends a implements bzw {
    public int Ret;
    public int vZM;
    public int vZN;
    public int vZO;
    public LinkedList<cff> vZP = new LinkedList();
    public LinkedList<cff> vZQ = new LinkedList();
    public LinkedList<cff> vZR = new LinkedList();
    public int vZS;
    public int vZT;
    public int vZU;
    public ate vZV;
    public int wnO;
    public int wnP;
    public int wnQ;
    public LinkedList<cff> wnR = new LinkedList();
    public LinkedList<cff> wnS = new LinkedList();
    public LinkedList<cff> wnT = new LinkedList();

    public ahj() {
        AppMethodBeat.i(72850);
        AppMethodBeat.o(72850);
    }

    public final int getRet() {
        return this.Ret;
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(72851);
        int bs;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.Ret);
            aVar.iz(2, this.vZM);
            aVar.iz(3, this.vZN);
            aVar.iz(4, this.vZO);
            aVar.e(5, 8, this.vZP);
            aVar.e(6, 8, this.vZQ);
            aVar.e(7, 8, this.vZR);
            aVar.iz(8, this.vZS);
            aVar.iz(9, this.vZT);
            aVar.iz(10, this.vZU);
            aVar.iz(11, this.wnO);
            aVar.iz(12, this.wnP);
            aVar.iz(13, this.wnQ);
            aVar.e(14, 8, this.wnR);
            aVar.e(15, 8, this.wnS);
            aVar.e(16, 8, this.wnT);
            if (this.vZV != null) {
                aVar.iy(17, this.vZV.computeSize());
                this.vZV.writeFields(aVar);
            }
            AppMethodBeat.o(72851);
            return 0;
        } else if (i == 1) {
            bs = (((((((((((((((e.a.a.b.b.a.bs(1, this.Ret) + 0) + e.a.a.b.b.a.bs(2, this.vZM)) + e.a.a.b.b.a.bs(3, this.vZN)) + e.a.a.b.b.a.bs(4, this.vZO)) + e.a.a.a.c(5, 8, this.vZP)) + e.a.a.a.c(6, 8, this.vZQ)) + e.a.a.a.c(7, 8, this.vZR)) + e.a.a.b.b.a.bs(8, this.vZS)) + e.a.a.b.b.a.bs(9, this.vZT)) + e.a.a.b.b.a.bs(10, this.vZU)) + e.a.a.b.b.a.bs(11, this.wnO)) + e.a.a.b.b.a.bs(12, this.wnP)) + e.a.a.b.b.a.bs(13, this.wnQ)) + e.a.a.a.c(14, 8, this.wnR)) + e.a.a.a.c(15, 8, this.wnS)) + e.a.a.a.c(16, 8, this.wnT);
            if (this.vZV != null) {
                bs += e.a.a.a.ix(17, this.vZV.computeSize());
            }
            AppMethodBeat.o(72851);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vZP.clear();
            this.vZQ.clear();
            this.vZR.clear();
            this.wnR.clear();
            this.wnS.clear();
            this.wnT.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(72851);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ahj ahj = (ahj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            cff cff;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    ahj.Ret = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 2:
                    ahj.vZM = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 3:
                    ahj.vZN = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 4:
                    ahj.vZO = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(aVar4, cff, a.getNextFieldNumber(aVar4))) {
                        }
                        ahj.vZP.add(cff);
                    }
                    AppMethodBeat.o(72851);
                    return 0;
                case 6:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(aVar4, cff, a.getNextFieldNumber(aVar4))) {
                        }
                        ahj.vZQ.add(cff);
                    }
                    AppMethodBeat.o(72851);
                    return 0;
                case 7:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(aVar4, cff, a.getNextFieldNumber(aVar4))) {
                        }
                        ahj.vZR.add(cff);
                    }
                    AppMethodBeat.o(72851);
                    return 0;
                case 8:
                    ahj.vZS = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 9:
                    ahj.vZT = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 10:
                    ahj.vZU = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 11:
                    ahj.wnO = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 12:
                    ahj.wnP = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 13:
                    ahj.wnQ = aVar3.BTU.vd();
                    AppMethodBeat.o(72851);
                    return 0;
                case 14:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(aVar4, cff, a.getNextFieldNumber(aVar4))) {
                        }
                        ahj.wnR.add(cff);
                    }
                    AppMethodBeat.o(72851);
                    return 0;
                case 15:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(aVar4, cff, a.getNextFieldNumber(aVar4))) {
                        }
                        ahj.wnS.add(cff);
                    }
                    AppMethodBeat.o(72851);
                    return 0;
                case 16:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(aVar4, cff, a.getNextFieldNumber(aVar4))) {
                        }
                        ahj.wnT.add(cff);
                    }
                    AppMethodBeat.o(72851);
                    return 0;
                case 17:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        ate ate = new ate();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ate.populateBuilderWithField(aVar4, ate, a.getNextFieldNumber(aVar4))) {
                        }
                        ahj.vZV = ate;
                    }
                    AppMethodBeat.o(72851);
                    return 0;
                default:
                    AppMethodBeat.o(72851);
                    return -1;
            }
        } else {
            AppMethodBeat.o(72851);
            return -1;
        }
    }
}
