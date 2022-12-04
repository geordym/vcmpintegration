package com.maxorator.vcmp.java.plugin.integration.generic;

import java.util.Date;

@SuppressWarnings("unused")
public interface Entity {

    int getId();

    boolean isValid();

    void setData(String name, Object value);

    void unSubscribe(String name);

    void subscribe(DataTrigger d);

    DataTrigger whenData(String k);

    <T> T getData(String name, Class<T> klass);

    <T> T getData(String name, Class<T> klass, Object defaultValue);

    Integer getDataAsInt(String name, Integer defaultValue);

    Long getDataAsLong(String name, Long defaultValue);

    Date getDataAsDate(String name, Date defaultValue);

    String getDataAsString(String name, String defaultValue);

    Boolean getDataAsBoolean(String name, Boolean defaultValue);

    Float getDataAsFloat(String name, Float defaultValue);

    Double getDataAsDouble(String name, Double defaultValue);

    Vector getDataAsVector(String name, Vector defaultValue);

    Colour getDataAsColour(String name, Colour defaultValue);

    Quaternion getDataAsQuaternion(String name, Quaternion defaultValue);

    Rotation2d getDataAsRotation2d(String name, Rotation2d defaultValue);

    void clearData();
}
