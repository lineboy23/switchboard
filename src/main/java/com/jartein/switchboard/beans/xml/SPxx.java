package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("Spxx")
public class SPxx {
    @XStreamImplicit(itemFieldName="Sph")//标注加在list上
    private List<SPh> Sph;

    public List<SPh> getSph() {
        return Sph;
    }

    public void setSph(List<SPh> sph) {
        Sph = sph;
    }
}
