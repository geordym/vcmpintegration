package com.maxorator.vcmp.java.plugin.integration.generic;

/**
 *
 * @author newk
 */
public class DataTrigger {

    public String key;
    public Object value;
    public Runnable r;
    public DataTrigger(String key) {
        this.key = key;
    }

    public DataTrigger() {
    }
    
    

    public DataTrigger is(Object k) {
        this.value = k;
        return this;
    }
    
    public DataTrigger run(Runnable r){
        this.r = r;
         return this;
    }
}
