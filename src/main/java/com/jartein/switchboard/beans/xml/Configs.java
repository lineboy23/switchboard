package com.jartein.switchboard.beans.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by JohnnyLeung on 2017/1/4.
 */
@XStreamAlias("configs")
public class Configs {
    public String dpath1;
    public String dpath2;
    public String dpath3;
    public String dpdfpath;
    public String zpath1;
    public String zpath2;
    public String zpath3;
    public List<Disk> disks;

    public Configs(){
        super();
    }

    public Configs(String dpath1,String dpath2,String dpath3,String dpdfpath,String zpath1,String zpath2,String zpath3,List<Disk> disks){
        super();
        this.dpath1=dpath1;
        this.dpath2=dpath2;
        this.dpath3=dpath3;

        this.dpdfpath=dpdfpath;

        this.zpath1=zpath1;
        this.zpath2=zpath2;
        this.zpath3=zpath3;

        this.disks=disks;
    }

    public String getDpath1() {
        return dpath1;
    }
    public void setDpath1(String dpath1) {
        this.dpath1 = dpath1;
    }

    public String getDpath2() {
        return dpath2;
    }
    public void setDpath2(String dpath2) {
        this.dpath2 = dpath2;
    }

    public String getDpath3() {
        return dpath3;
    }
    public void setDpath3(String dpath3) {
        this.dpath3 = dpath3;
    }

    public String getDpdfpath() {
        return dpdfpath;
    }
    public void setDpdfpath(String dpdfpath) {
        this.dpdfpath = dpdfpath;
    }

    public String getZpath1() {
        return zpath1;
    }
    public void setZpath1(String zpath1) {
        this.zpath1 = zpath1;
    }

    public String getZpath2() {
        return zpath2;
    }
    public void setZpath2(String zpath2) {
        this.zpath2 = zpath2;
    }

    public String getZpath3() {
        return zpath3;
    }
    public void setZpath3(String zpath3) {
        this.zpath3 = zpath3;
    }

    public List<Disk> getDisks() {
        return disks;
    }
    public void setDisks(List<Disk> disks) {
        this.disks = disks;
    }
}
