package com.prowidesoftware.swift.samples;

import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxCamt00400108;
import com.prowidesoftware.swift.model.mx.MxCamt01900107;
import com.prowidesoftware.swift.model.mx.MxCamt02900109;
import com.prowidesoftware.swift.model.mx.MxCamt04800103;
import com.prowidesoftware.swift.model.mx.MxCamt05200108;
import com.prowidesoftware.swift.model.mx.MxCamt05300108;
import com.prowidesoftware.swift.model.mx.MxCamt05400108;
import com.prowidesoftware.swift.model.mx.MxCamt05600108;
import com.prowidesoftware.swift.model.mx.MxCamt05700106;
import com.prowidesoftware.swift.model.mx.MxCamt06000105;
import com.prowidesoftware.swift.model.mx.MxPacs00200110;
import com.prowidesoftware.swift.model.mx.MxPacs00400109;
import com.prowidesoftware.swift.model.mx.MxPacs00800108;
import com.prowidesoftware.swift.model.mx.MxPacs00800109;
import com.prowidesoftware.swift.model.mx.MxPacs00900108;
import com.prowidesoftware.swift.model.mx.MxPacs00900109;
import com.prowidesoftware.swift.model.mx.MxPacs01000103;
import com.prowidesoftware.swift.model.mx.MxPain00100109;

public class MxUtil {

    public void parseMxMessage(String mxMessage) {

        AbstractMX mx = AbstractMX.parse(mxMessage);

        System.out.println("Parsed message type: " + mx.getMxId().id());

        SwiftMsg msg = new SwiftMsg();

        // check the parsed type and cast to specific model
        if ("camt.048.001.03".equals(mx.getMxId().id())) {
            MxCamt04800103 camt = (MxCamt04800103) mx;
            System.out.println("Message id: " + camt.getModfyRsvatn().getMsgHdr().getMsgId());

        }

        switch(mx.getMxId().id()) {
            case "camt.048.001.03":
                MxCamt04800103 camt = (MxCamt04800103) mx;
                // set reference number
                msg.setRefNum(camt.getModfyRsvatn().getMsgHdr().getMsgId());
                // set sender BIC

                // set receiver BIC

                // set country code

                // set MT type

                // set hashcode

                // set message
                break;
            case "pacs.008.001.09":
                //block
                MxPacs00800109 p809 = (MxPacs00800109) mx;
                break;
            case "camt.019.001.07":
                MxCamt01900107 c1917 = (MxCamt01900107) mx;
                break;
            case "camt.004.001.08":
                MxCamt00400108 c418 = (MxCamt00400108) mx;
                break;
            case "camt.029.001.09":
                MxCamt02900109 c2919 = (MxCamt02900109) mx;
                break;
            case "camt.052.001.08":
                MxCamt05200108 c5218 = (MxCamt05200108) mx;
                break;
            case "camt.053.001.08":
                MxCamt05300108 c5318 = (MxCamt05300108) mx;
                break;
            case "camt.054.001.08":
                MxCamt05400108 c5418 = (MxCamt05400108) mx;
                break;
            case "camt.056.001.08":
                MxCamt05600108 c5618 = (MxCamt05600108) mx;
                break;
            case "camt.057.001.06":
                MxCamt05700106 c5716 = (MxCamt05700106) mx;
                break;
            case "camt.060.001.05":
                MxCamt06000105 c6015 = (MxCamt06000105) mx;
                break;
            // case "head.001.001.02":
            //     Mxhea
            //     break;
            case "pacs.004.001.09":
                MxPacs00400109 p419 = (MxPacs00400109) mx;
                break;
            case "pacs.002.001.10":
                MxPacs00200110 p2110 = (MxPacs00200110) mx;
                break;
            case "pacs.010.001.03":
                MxPacs01000103 p1013 = (MxPacs01000103) mx;
                break;
            case "pacs.008.001.08":
                MxPacs00800108 p818 = (MxPacs00800108) mx;
                break;
            case "pacs.009.001.09":
                MxPacs00900109 p919 = (MxPacs00900109) mx;
                break;
            case "pacs.009.001.08":
                MxPacs00900108 p918 = (MxPacs00900108) mx;
                break;
            case "pacs.009.001.08_ADV":
                MxPacs00900108 p918adv = (MxPacs00900108) mx;

                break;
            case "pacs.009.001.08_COV":
                MxPacs00900108 p918cov = (MxPacs00900108) mx;
                break;
            case "pacs.009.001.08_STP":
                MxPacs00900108 p918stp = (MxPacs00900108) mx;
                break;
            case "pain.001.001.09":
                MxPain00100109 p119 = (MxPain00100109) mx;
                break;
            default:
                // Added logger to pring mx id and throw error

        }
    }
    
}
