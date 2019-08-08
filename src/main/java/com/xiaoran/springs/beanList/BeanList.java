package com.xiaoran.springs.beanList;

import java.util.List;
import java.util.Properties;

public class BeanList {


    private List<String> customList;

    public void setCustomList(List<String> customList) {
        this.customList = customList;
    }

    public List getCustomList() {
        return customList;
    }

    private Properties pro;
    public void setPro(Properties pro){
        this.pro = pro;
    }
}
