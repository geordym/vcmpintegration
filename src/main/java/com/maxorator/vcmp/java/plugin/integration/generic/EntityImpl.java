package com.maxorator.vcmp.java.plugin.integration.generic;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public abstract class EntityImpl implements Entity {

    public int id;
    private final Object sync;
    private Map<String, Object> data;
    private Map<String, DataTrigger> subs = new HashMap<>();

    protected EntityImpl(int id) {
        this.id = id;
        this.sync = new Object();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isValid() {
        return id >= 0;
    }

    @Override
    public DataTrigger whenData(String k) {
        DataTrigger d = new DataTrigger(k);
        return d;
    }

    @Override
    public void subscribe(DataTrigger d) {
        subs.put(d.key, d);
    }

    @Override
    public void unSubscribe(String name) {
        subs.remove(name);
    }

    @Override
    public void setData(String name, Object value) {
        synchronized (sync) {
            if (data == null) {
                data = new HashMap<>();
            }
            DataTrigger d = this.subs.get(name);

            data.put(name, value);
            if (d != null && d.value.equals(value)) {
                if (d.r != null) {
                    d.r.run();
                }
            }
        }
    }

    @Override
    public void clearData() {
        synchronized (sync) {
            if (data != null) {
                this.data.clear();
            }
        }
    }

    @Override
    public <T> T getData(String name, Class<T> klass) {
        synchronized (sync) {
            if (data == null) {
                return null;
            }

            Object value = data.get(name);

            if (klass.isInstance(value)) {
                return (T) value;
            }
            return null;
        }
    }

    @Override
    public <T> T getData(String name, Class<T> klass, Object defaultValue) {
        synchronized (sync) {
            if (data == null) {
                return (T) defaultValue;
            }

            Object value = data.get(name);

            if (klass.isInstance(defaultValue) && value == null) {
                return (T) defaultValue;
            } else if (klass.isInstance(value)) {
                return (T) value;
            }
            return null;
        }
    }

    @Override
    public Integer getDataAsInt(String name, Integer defaultValue) {
        return getData(name, Integer.class, defaultValue);
    }

    @Override
    public Long getDataAsLong(String name, Long defaultValue) {
        return getData(name, Long.class, defaultValue);
    }

    @Override
    public Date getDataAsDate(String name, Date defaultValue) {
        return getData(name, Date.class, defaultValue);
    }

    @Override
    public String getDataAsString(String name, String defaultValue) {
        return getData(name, String.class, defaultValue);
    }

    @Override
    public Boolean getDataAsBoolean(String name, Boolean defaultValue) {
        return getData(name, Boolean.class, defaultValue);
    }

    @Override
    public Float getDataAsFloat(String name, Float defaultValue) {
        return getData(name, Float.class, defaultValue);
    }

    @Override
    public Double getDataAsDouble(String name, Double defaultValue) {
        return getData(name, Double.class, defaultValue);
    }

    @Override
    public Vector getDataAsVector(String name, Vector defaultValue) {
        return getData(name, Vector.class, defaultValue);
    }

    @Override
    public Colour getDataAsColour(String name, Colour defaultValue) {
        return getData(name, Colour.class, defaultValue);
    }

    @Override
    public Quaternion getDataAsQuaternion(String name, Quaternion defaultValue) {
        return getData(name, Quaternion.class, defaultValue);
    }

    @Override
    public Rotation2d getDataAsRotation2d(String name, Rotation2d defaultValue) {
        return getData(name, Rotation2d.class, defaultValue);
    }

}
